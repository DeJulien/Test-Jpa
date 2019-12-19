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
	@Column(name = "NUMERO", length = 255)
	private int numero;
	@Column(name = "RUE", length = 255)
	private String rue;
	@Column(name = "CODE_POSTAL", length = 255)
	private int codePostal;
	@Column(name = "VILLE", length = 255)
	private String ville;
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
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**Setter
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**Getter
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}
	/**Setter
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	/**Getter
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}
	/**Setter
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	/**Getter
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**Setter
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	

}
