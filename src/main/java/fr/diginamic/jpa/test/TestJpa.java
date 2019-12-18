package fr.diginamic.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("compta");
		EntityManager em = entityManagerFactory.createEntityManager();
		System.out.println(em);
		Fournisseur fourni = em.find(Fournisseur.class, 1);
		if (fourni != null){
			System.out.println(fourni.getId()+" "+fourni.getNom());
		}



		em.close();
		entityManagerFactory.close();
	}

}
