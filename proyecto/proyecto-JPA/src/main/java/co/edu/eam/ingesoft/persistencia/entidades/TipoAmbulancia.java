package co.edu.eam.ingesoft.persistencia.entidades;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="t_tipoambulancia")
@NamedNativeQueries({ @NamedNativeQuery(name = "TipoAmbulancia.listartipoambulancia",
query = "SELECT * FROM T_TipoAmbulancia",resultClass=TipoAmbulancia.class),
	@NamedNativeQuery(name = "TipoAmbulancia.listarbuscartipoambulancia",
	query = "SELECT * FROM T_TipoAmbulancia  where placaambulancia=:estado",resultClass=TipoAmbulancia.class) })
public class TipoAmbulancia implements Serializable {

	@Id
	private String idTipoAmbulancia;
	
	@Column(name="nombreTipoAmbulancia", nullable = false, length = 50)
	private String nonmbreTipoAmbulancia;

	/**
	 * 
	 */
	public TipoAmbulancia() {
		super();
	}

	/**
	 * @param idTipoAmbulancia
	 * @param nonmbreTipoAmbulancia
	 */
	public TipoAmbulancia(String idTipoAmbulancia, String nonmbreTipoAmbulancia) {
		super();
		this.idTipoAmbulancia = idTipoAmbulancia;
		this.nonmbreTipoAmbulancia = nonmbreTipoAmbulancia;
	}

	public String getIdTipoAmbulancia() {
		return idTipoAmbulancia;
	}

	public void setIdTipoAmbulancia(String idTipoAmbulancia) {
		this.idTipoAmbulancia = idTipoAmbulancia;
	}

	public String getNonmbreTipoAmbulancia() {
		return nonmbreTipoAmbulancia;
	}

	public void setNonmbreTipoAmbulancia(String nonmbreTipoAmbulancia) {
		this.nonmbreTipoAmbulancia = nonmbreTipoAmbulancia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoAmbulancia == null) ? 0 : idTipoAmbulancia.hashCode());
		result = prime * result + ((nonmbreTipoAmbulancia == null) ? 0 : nonmbreTipoAmbulancia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoAmbulancia other = (TipoAmbulancia) obj;
		if (idTipoAmbulancia == null) {
			if (other.idTipoAmbulancia != null)
				return false;
		} else if (!idTipoAmbulancia.equals(other.idTipoAmbulancia))
			return false;
		if (nonmbreTipoAmbulancia == null) {
			if (other.nonmbreTipoAmbulancia != null)
				return false;
		} else if (!nonmbreTipoAmbulancia.equals(other.nonmbreTipoAmbulancia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoAmbulancia [idTipoAmbulancia=" + idTipoAmbulancia + ", nonmbreTipoAmbulancia="
				+ nonmbreTipoAmbulancia + "]";
	}
	
	
}
