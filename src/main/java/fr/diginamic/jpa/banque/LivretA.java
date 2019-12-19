package fr.diginamic.jpa.banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LivretA")
public class LivretA extends Compte {
	
	@Id
	private int id;
	@Column(name = "TAUX", length = 255)
	private double taux;
	
	
	public LivretA(){
		
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
