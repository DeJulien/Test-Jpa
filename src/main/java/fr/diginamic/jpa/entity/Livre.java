package fr.diginamic.jpa.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinTable(name="COMPO",joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"),
			inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"))
	private List<Emprunt> emprunt;
	
	
	


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
	
	public String toString()
	{
		return ""+this.id+" "+this.auteur+" "+this.titre;
	}
	
}
