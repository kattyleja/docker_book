package cl.lramirez.demodocker.service;

import java.util.List;

import cl.lramirez.demodocker.data.Cliente;

public interface ClienteService {

	public List<Cliente> findAll();

	public Cliente findById(int id);

	public void save(Cliente user);

	public void deleteById(int id);
}
