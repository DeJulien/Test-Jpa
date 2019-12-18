package fr.diginamic.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Livre")
public class Livre {

	@Id
	private int id;
	@Column(name = "TITRE", length = 255, nullable = false, unique = true)
	private String titre;
	@Column(name = "AUTEUR", length = 255, nullable = false, unique = true)
	private String auteur;
	
	public Livre(){ }

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
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**Setter
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**Getter
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**Setter
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
}
