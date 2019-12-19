package fr.diginamic.jpa.banque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class CreaJpaTp4 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		System.out.println(em);
		EntityTransaction transac = em.getTransaction();
		transac.begin();
		
		//creation banque
		Banque banque1 = new Banque();
		banque1.setId(1);
		banque1.setNom("BNP");
		em.persist(banque1);
		
		//creation compte livretA
		LivretA cpt1= new LivretA();
		cpt1.setId(1);
		cpt1.setNumero("10001");
		cpt1.setSolde(23.1);
		cpt1.setTaux(32);
		em.persist(cpt1);
		
		LocalDate date1 = LocalDate.of(2017, 2, 24);
		//creation compte livretA
		AssuranceVie cpt2= new AssuranceVie();
		cpt2.setId(2);
		cpt2.setNumero("10003");
		cpt2.setSolde(3000);
		cpt2.setTaux(32);
		cpt2.setDate(date1);
		em.persist(cpt2);
		

		//operation
		Virement ope1 = new Virement();
		ope1.setId(1);
		ope1.setDate(date1);
		ope1.setMontant(2000);
		ope1.setBenificiaire("toto");
		ope1.setCompte(cpt1);
		em.persist(ope1);
		
		//operation
		Operation ope2 = new Operation();
		ope2.setId(2);
		ope2.setDate(date1);
		ope2.setMontant(2000);
		ope2.setCompte(cpt2);
		em.persist(ope1);
		
		//creation adresse
		Adresse addre1=new Adresse();
		addre1.setId(1);
		addre1.setNumero(23);
		addre1.setRue("rue de la court");
		addre1.setCodePostal(23006);
		addre1.setVille("paris");
		
		LocalDate dateDeNaissance = LocalDate.of(2017, 2, 24);
		//creation client
		Client c1= new Client();
		c1.setId(1);
		c1.setNom("Dupont");
		c1.setPrenom("tintin");
		c1.setDateDeNaissance(dateDeNaissance);
		c1.setBanque(banque1);
		c1.setAdresse(addre1);
		em.persist(c1);
		
		
		transac.commit();
		
		em.close();
		entityManagerFactory.close();
	}

}
