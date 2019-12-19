package fr.diginamic.jpa.banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Operation")
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
	
	@Id
	private int id;
	@Column(name = "MONTANT", length = 255)
	private double montant;
	@Column(name = "MODIF", length = 255)
	private String modif;
	@Column(name = "DATE")
    private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name="COMP_ID")
	private Compte compte;
	
	
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
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}


	/**Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}


	/**Getter
	 * @return the modif
	 */
	public String getModif() {
		return modif;
	}


	/**Setter
	 * @param modif the modif to set
	 */
	public void setModif(String modif) {
		this.modif = modif;
	}


	/**Getter
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}


	/**Setter
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}


	/**Getter
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}


	/**Setter
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}


	public Operation(){
		
	}
}
