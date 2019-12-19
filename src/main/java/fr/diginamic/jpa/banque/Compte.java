package fr.diginamic.jpa.banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Compte")
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
