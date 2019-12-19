package fr.diginamic.jpa.banque;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Client")
public class Client {
	
	@Id
	private int id;
	@Column(name = "NOM", length = 255)
	private String nom;
	@Column(name = "PRENOM", length = 255)
	private String prenom;
	@Column(name = "DATE_DE_NAISSANCE")
    private LocalDate dateDeNaissance;
	
	@Embedded
	private Adresse adresse; 
	
	@ManyToOne
	@JoinColumn(name="BAN_ID")
	private Banque banque; 
	
	@ManyToMany
	@JoinTable(name="COMPO",joinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID"),
			inverseJoinColumns= @JoinColumn(name="ID_COMP", referencedColumnName="ID"))
	private List<Compte> compte;
	
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

	/**Getter
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**Setter
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/**Getter
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**Getter
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**Setter
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**Getter
	 * @return the compte
	 */
	public List<Compte> getCompte() {
		return compte;
	}

	/**Setter
	 * @param compte the compte to set
	 */
	public void setCompte(List<Compte> compte) {
		this.compte = compte;
	}

	public Client()
	{
		
	}

}
