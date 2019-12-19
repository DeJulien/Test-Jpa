package fr.diginamic.jpa.banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Banque")
public class Banque {

	@Id
	private int id;
	@Column(name = "NOM", length = 255, nullable = false, unique = true)
	private String nom;
	
	@OneToMany(mappedBy="banque")
	private List<Client> client; 
	
	public Banque()
	{
		
	}

}
