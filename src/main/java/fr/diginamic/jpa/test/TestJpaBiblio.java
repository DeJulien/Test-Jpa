package fr.diginamic.jpa.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.jpa.entity.Emprunt;
import fr.diginamic.jpa.entity.Livre;
import fr.diginamic.jpa.entity.Client;

public class TestJpaBiblio {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();
		System.out.println(em);
		
		TypedQuery<Emprunt> query1 = em.createQuery("select e from  Emprunt e, Livre l where l.id='1'",Emprunt.class);
		List<Emprunt> liv=query1.getResultList();
		for(int i=0;i<liv.size();i++)
		{
			Emprunt temp=liv.get(i);
			System.out.println(temp.getId()+" "+temp.getLivre().toString());
		}
		
		System.out.println("");
		TypedQuery<Emprunt> query2 = em.createQuery("select e from  Emprunt e, Client c where c.id='3'",Emprunt.class);
		List<Emprunt> emp=query2.getResultList();
		for(int i=0;i<emp.size();i++)
		{
			Emprunt temp=emp.get(i);
			System.out.println(temp.getId()+" "+temp.getClient().toString());
		}

		em.close();
		entityManagerFactory.close();

	}

}
