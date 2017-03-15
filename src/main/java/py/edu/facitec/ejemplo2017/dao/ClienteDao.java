package py.edu.facitec.ejemplo2017.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.ejemplo2017.model.Cliente;
//Indicamos a Spring que se trata de una clase que manipulara los datos
@Repository
public class ClienteDao {

	
	@PersistenceContext
	private EntityManager manager; //gestionar el estado y persistencia de las entidades
	
	
	public void save(Cliente cliente){
		
		//Genera el sql para insertar el objeto
		manager.persist(cliente);
	}
}
