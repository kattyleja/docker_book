package cl.lramirez.demodocker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.lramirez.demodocker.data.Cliente;
import cl.lramirez.demodocker.data.ClienteDAO;
@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDAO clienteDAO;
	
	@Override
	public List<Cliente> findAll() {
		List<Cliente> listClientes= clienteDAO.findAll();
		return listClientes;
	}

	@Override
	public Cliente findById(int id) {
		Cliente cliente = clienteDAO.findById(id);
		return cliente;
	}

	@Override
	public void save(Cliente cliente) {
		clienteDAO.save(cliente);

	}

	@Override
	public void deleteById(int id) {
		clienteDAO.deleteById(id);
	}

}
