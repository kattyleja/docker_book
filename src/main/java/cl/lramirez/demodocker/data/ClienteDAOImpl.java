package cl.lramirez.demodocker.data;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.query.Query;

@Repository
public class ClienteDAOImpl implements ClienteDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Cliente> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Cliente> theQuery = currentSession.createQuery("from Cliente", Cliente.class);
		List<Cliente> clientes = theQuery.getResultList();
		return clientes;
	}

	@Override
	public Cliente findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Cliente cliente = currentSession.get(Cliente.class, id);
		return cliente;
	}

	@Override
	public void save(Cliente cliente) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(cliente);
	}

	@Override
	public void deleteById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Cliente> theQuery = currentSession.createQuery("delete from clientes where id=:idCliente");
		theQuery.setParameter("idCliente", id);
		theQuery.executeUpdate();
	}
}
