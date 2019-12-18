package fr.diginamic.jpa.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Operation {
	
	@Id
	private int id;
	@Column(name = "MONTANT", length = 255, nullable = false, unique = true)
	private double montant;
	@Column(name = "MODIF", length = 255, nullable = false, unique = true)
	private String modif;
	
	@ManyToOne
	@JoinColumn(name="COMP_ID")
	private Compte compte;
	
	
	public Operation(){
		
	}
}
