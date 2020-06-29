package cl.lramirez.demodocker.data;

import java.util.List;

public interface ClienteDAO {

	public List<Cliente> findAll();

	public Cliente findById(int id);

	public void save(Cliente cliente);

	public void deleteById(int id);
}
