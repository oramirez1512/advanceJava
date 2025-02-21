package co.edu.usbcali.bank.jpa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class UsuarioJpaTest {
	private final static Long clieId = 4560L; 
	
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	
	@BeforeEach
	void beforeEach() {
		entityManagerFactory = Persistence.createEntityManagerFactory("bank-logic");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@AfterEach
	void afterEach() {
		entityManager.close();
		entityManagerFactory.close();
	}
	
	/*@Test
	@DisplayName("save")
	void aTest() {
		//fail("Not yet implemented");
		assertNotNull(entityManager, "Entity manager es nulo.");
		
		Usuario usuario = entityManager.find(Usuario.class, clieId);
		assertNull(usuario, "Cliente con id: "+clieId+" ya existe.");
		
		usuario = new Usuario();
		usuario.setClieId(clieId);
		usuario.setActivo("S");
		usuario.setDireccion("Calle falsa 123");
		usuario.setEmail("HomeroJSimpson@gmail.com");
		usuario.setNombre("Homero J. Simpson");
		usuario.setTelefono("555 555 555");
		
		TipoDocumento tipoDocumento = entityManager.find(TipoDocumento.class, 1L);
		assertNotNull(tipoDocumento, "El tipo de documento con id: 1 no existe.");
		
		usuario.setTipoDocumento(tipoDocumento);
		
		entityManager.getTransaction().begin();
			entityManager.persist(usuario);
		entityManager.getTransaction().commit();
	}

	@Test
	@DisplayName("findById")
	void bTest() {
		//fail("Not yet implemented");
		assertNotNull(entityManager, "Entity manager es nulo.");
		
		Cliente cliente = entityManager.find(Cliente.class, clieId);
		assertNotNull(cliente, "Cliente con id: "+clieId+" no existe.");
	}	

	@Test
	@DisplayName("update")
	void cTest() {
		//fail("Not yet implemented");
		assertNotNull(entityManager, "Entity manager es nulo.");
		
		Cliente cliente = entityManager.find(Cliente.class, clieId);
		assertNotNull(cliente, "Cliente con id: "+clieId+" no existe.");		

		cliente.setActivo("N");
		
		entityManager.getTransaction().begin();
			entityManager.merge(cliente);
		entityManager.getTransaction().commit();
		
		entityManager.refresh(cliente);
	}
	
	@Test
	@DisplayName("delete")
	void dTest() {
		//fail("Not yet implemented");
		assertNotNull(entityManager, "Entity manager es nulo.");
		
		Cliente cliente = entityManager.find(Cliente.class, clieId);
		assertNotNull(cliente, "Cliente con id: "+clieId+" no existe.");		

		cliente.setActivo("N");
		
		entityManager.getTransaction().begin();
			entityManager.remove(cliente);
		entityManager.getTransaction().commit();
	}
	
	private final static Logger log = LoggerFactory.getLogger(ClienteJpaTest.class);

	@Test
	@DisplayName("findAll")
	void eTest() {
		//fail("Not yet implemented");
		assertNotNull(entityManager, "Entity manager es nulo.");
		
		String jpql = "SELECT cli FROM Cliente cli";
		Query query = entityManager.createQuery(jpql);
		
		List<Cliente> clientes = query.getResultList();
		assertNotNull(clientes);
		assertFalse(clientes.isEmpty());
		
		for (Cliente cliente : clientes) {
			log.info(cliente.getNombre());
		}
		
		clientes.forEach(cliente -> {
			log.info(cliente.getNombre());
		});
	}*/

}
