package fr.diginamic.jpa.banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Compte")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
	@Id
	private int id;
	@Column(name = "NUMERO", length = 255)
	private String numero;
	@Column(name = "SOLDE", length = 255)
	private double solde;
	
	
	@OneToMany(mappedBy="compte")
	private List<Operation> operation; 
	
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
	public String getNumero() {
		return numero;
	}

	/**Setter
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**Getter
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**Getter
	 * @return the operation
	 */
	public List<Operation> getOperation() {
		return operation;
	}

	/**Setter
	 * @param operation the operation to set
	 */
	public void setOperation(List<Operation> operation) {
		this.operation = operation;
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

	@ManyToMany
	@JoinTable(name="COMPO",joinColumns= @JoinColumn(name="ID_COMP", referencedColumnName="ID"),
			inverseJoinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID"))
	private List<Client> client;
	
	public Compte()
	{
		
	}

}
