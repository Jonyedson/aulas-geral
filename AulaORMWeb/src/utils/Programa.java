package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Cliente;

public class Programa {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aulaorm_web");
		
		EntityManager em = factory.createEntityManager();
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("João");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Ana");
		
		em.getTransaction().begin();
		em.persist(cliente1);
		em.persist(cliente2);
		em.getTransaction().commit();
		em.close();
		
	}

}
