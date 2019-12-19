package fr.diginamic.jpa.banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AssuranceVie")
public class AssuranceVie extends Compte {
	
	@Id
	private int id;
	@Column(name = "DATE_FIN")
    private LocalDate date;
	@Column(name = "TAUX", length = 255)
	private double taux;
	
	
	public AssuranceVie(){
		
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
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}


	/**Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
}
