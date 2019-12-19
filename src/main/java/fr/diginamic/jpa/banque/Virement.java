package fr.diginamic.jpa.banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Virement")
public class Virement extends Operation {
	
	@Id
	private int id;
	@Column(name = "BENIFICIAIRE", length = 255)
	private String benificiaire;

	public Virement(){
		
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
	 * @return the benificiaire
	 */
	public String getBenificiaire() {
		return benificiaire;
	}

	/**Setter
	 * @param benificiaire the benificiaire to set
	 */
	public void setBenificiaire(String benificiaire) {
		this.benificiaire = benificiaire;
	}
}
