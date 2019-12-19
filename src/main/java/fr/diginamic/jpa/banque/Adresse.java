package fr.diginamic.jpa.banque;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Table;
@Embeddable
@Table(name="Adresse")
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
	

}
