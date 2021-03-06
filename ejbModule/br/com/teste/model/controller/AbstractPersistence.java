package br.com.teste.model.controller;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@LocalBean
@Stateless
public class AbstractPersistence {

	@PersistenceContext(type = PersistenceContextType.EXTENDED, unitName = "produtoEJB")
	EntityManager entityManager ;
	
	
	public Object insert(Object object){
	
		if(entityManager == null){
			System.out.println("\n\n\n Persistent manager esta nulo");
			System.out.println("\n\n\n Persistent manager esta nulo");
			System.out.println("\n\n\n Persistent manager esta nulo");
			System.out.println("\n\n\n Persistent manager esta nulo");
			System.out.println("\n\n\n Persistent manager esta nulo");
			System.out.println("\n\n\n Persistent manager esta nulo");
		}else{
			entityManager.persist(object);
		}
		
		
		return object;
	}
	
	public Object update(Object object){
		entityManager.merge(object);
		return object;
	}
		
	public void delete(Class<?> classe, Integer codigo){
		Object object = find(classe, codigo);		
		entityManager.remove(object);				
	}
	
	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(Class<T> classe){
		return entityManager.createQuery("select e from " + 
									classe.getName() + " e ")
									.getResultList();
	}
	
	public <T> T find(Class<T> classe, Integer codigo){
		return entityManager.find(classe, codigo);
	}
}

