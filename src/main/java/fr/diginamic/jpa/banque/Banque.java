package fr.diginamic.jpa.banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


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
	@Column(name = "NOM", length = 255)
	private String nom;
	
	@OneToMany(mappedBy="banque")
	private List<Client> client; 


	/**Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter
	 * @return the client
	 */
	public List<Client> getClient() {
		return client;
	}

	/**Setter
	 * @param client the client to set
	 */
	public void setClient(List<Client> client) {
		this.client = client;
	}

	public Banque()
	{
		
	}

}
