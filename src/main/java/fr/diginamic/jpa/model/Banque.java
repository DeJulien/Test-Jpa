package fr.diginamic.jpa.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Banque {

	@Id
	private int id;
	@Column(name = "NOM", length = 255, nullable = false, unique = true)
	private String nom;
	
	@OneToMany(mappedBy="banque")
	private Client client; 
	
	public Banque()
	{
		
	}

}
