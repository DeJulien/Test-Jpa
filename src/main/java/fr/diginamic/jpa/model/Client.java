package fr.diginamic.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Client {
	
	@Id
	private int id;
	@Column(name = "NOM", length = 255, nullable = false, unique = true)
	private String nom;
	@Column(name = "PRENOM", length = 255, nullable = false, unique = true)
	private String prenom;
	
	@OneToOne
	private Adresse adresse; 
	
	@ManyToOne
	@JoinColumn(name="BAN_ID")
	private Banque banque; 
	
	@ManyToMany
	@JoinTable(name="COMPO",joinColumns= @JoinColumn(name="ID_COMP", referencedColumnName="ID"),
			inverseJoinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID"))
	private List<Compte> compte;
	
	public Client()
	{
		
	}

}