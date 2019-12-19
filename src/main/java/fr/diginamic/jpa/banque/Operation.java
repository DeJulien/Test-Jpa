package fr.diginamic.jpa.banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Operation")
public class Operation {
	
	@Id
	private int id;
	@Column(name = "MONTANT", length = 255, nullable = false, unique = true)
	private double montant;
	@Column(name = "MODIF", length = 255, nullable = false, unique = true)
	private String modif;
	@Column(name = "DATE")
    private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name="COMP_ID")
	private Compte compte;
	
	
	public Operation(){
		
	}
}
