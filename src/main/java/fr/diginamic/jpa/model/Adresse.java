package fr.diginamic.jpa.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Adresse {
	
	@Id
	private int id;
	@Column(name = "NUMERO", length = 255, nullable = false, unique = true)
	private int numero;
	@Column(name = "RUE", length = 255, nullable = false, unique = true)
	private String rue;
	@Column(name = "CODE_POSTAL", length = 255, nullable = false, unique = true)
	private int codePostal;
	@Column(name = "VILLE", length = 255, nullable = false, unique = true)
	private String ville;
	
	public Adresse()
	{
		
	}

}
