package fr.diginamic.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import fr.diginamic.jpa.entity.Livre;

public class Compte {
	@Id
	private int id;
	@Column(name = "NUMERO", length = 255, nullable = false, unique = true)
	private String numero;
	@Column(name = "SOLDE", length = 255, nullable = false, unique = true)
	private double solde;
	
	
	@OneToMany(mappedBy="compte")
	private Operation operation; 
	
	@ManyToMany
	@JoinTable(name="COMPO",joinColumns= @JoinColumn(name="ID_COMP", referencedColumnName="ID"),
			inverseJoinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID"))
	private List<Client> client;
	
	public Compte()
	{
		
	}

}
