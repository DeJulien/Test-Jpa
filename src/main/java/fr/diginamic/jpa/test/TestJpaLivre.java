package fr.diginamic.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.jpa.entity.Livre;

public class TestJpaLivre {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("livre");
		EntityManager em = entityManagerFactory.createEntityManager();
		System.out.println(em);
		Livre liv1 = em.find(Livre.class, 1);
		if (liv1 != null){
			System.out.println(liv1.getId()+" "+liv1.getAuteur()+" "+liv1.getTitre());
		}
		TypedQuery<Livre> query2 = em.createQuery("select h from Livre h where h.titre='Guerre et paix'",Livre.class);
		Livre h2 = query2.getResultList().get(0);
		System.out.println(h2.getId()+" "+h2.getAuteur()+" "+h2.getTitre());


		em.close();
		entityManagerFactory.close();

	}

}
