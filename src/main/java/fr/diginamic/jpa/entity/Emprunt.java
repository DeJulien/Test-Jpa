package fr.diginamic.jpa.entity;

import java.util.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Emprunt")
public class Emprunt {
	
	@Id
	private int id;
	@Temporal(TemporalType.DATE)
	private Date date_Debut;
	@Temporal(TemporalType.DATE)
	private Date date_Fin;
	@Column(name = "delai", length = 255, nullable = false, unique = true)
	private int delais;


	@ManyToOne
    @JoinColumn(name="id_client")
    private Client client;
	
	@ManyToMany
	@JoinTable(name="COMPO",joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"),
			inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"))
	private List<Livre> livre;

	
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
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return date_Debut;
	}


	/**Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.date_Debut = dateDebut;
	}


	/**Getter
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return date_Fin;
	}


	/**Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.date_Fin = dateFin;
	}


	/**Getter
	 * @return the delais
	 */
	public int getDelais() {
		return delais;
	}


	/**Setter
	 * @param delais the delais to set
	 */
	public void setDelais(int delais) {
		this.delais = delais;
	}








	/**Getter
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}


	/**Setter
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}


	/**Getter
	 * @return the livre
	 */
	public List<Livre> getLivre() {
		return livre;
	}


	/**Setter
	 * @param livre the livre to set
	 */
	public void setLivre(List<Livre> livre) {
		this.livre = livre;
	}


	public Emprunt(){
		
	}
	


}
