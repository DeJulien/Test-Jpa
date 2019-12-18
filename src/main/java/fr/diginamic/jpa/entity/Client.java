package fr.diginamic.jpa.entity;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {
	
	@Id
	private int id;
	@Column(name = "NOM", length = 255, nullable = false, unique = true)
	private String nom;
	@Column(name = "PRENOM", length = 255, nullable = false, unique = true)
	private String prenom;
	
	@OneToMany(mappedBy="client")
	private List<Emprunt> emprunt; 
	

	
	
	public Client(){ }

	/**Getter
	 * @return the emprunt
	 */
	public List<Emprunt> getEmprunt() {
		return emprunt;
	}


	/**Setter
	 * @param emprunt the emprunt to set
	 */
	public void setEmprunt(List<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}



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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String toString()
	{
		return ""+this.id+" "+this.nom+" "+this.prenom;
	}

}
