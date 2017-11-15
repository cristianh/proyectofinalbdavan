package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="T_estadopersonal")
@NamedQueries({ @NamedQuery(name = "EstadoPersonal.listarestadopersonal", query = "SELECT per FROM EstadoPersonal per"),
	@NamedQuery(name = "EstadoPersonal.listarbuscaresatdopersonal", query = "SELECT per FROM EstadoPersonal per where per.idEstadoPersonal=:estado") })

public class EstadoPersonal implements Serializable{

	@Id
	@Column(name="idEstadoPersonal", unique=true, nullable=false)
	private String idEstadoPersonal;

	@Column(name="nombreEstadoPersonal")
	private String nombreEstadoPersonal;

	/**
	 * 
	 */
	public EstadoPersonal() {
		super();
	}

	/**
	 * @param idEstadoPersonal
	 * @param nombreEstadoPersonal
	 */
	public EstadoPersonal(String idEstadoPersonal, String nombreEstadoPersonal) {
		super();
		this.idEstadoPersonal = idEstadoPersonal;
		this.nombreEstadoPersonal = nombreEstadoPersonal;
	}

	public String getIdEstadoPersonal() {
		return idEstadoPersonal;
	}

	public void setIdEstadoPersonal(String idEstadoPersonal) {
		this.idEstadoPersonal = idEstadoPersonal;
	}

	public String getNombreEstadoPersonal() {
		return nombreEstadoPersonal;
	}

	public void setNombreEstadoPersonal(String nombreEstadoPersonal) {
		this.nombreEstadoPersonal = nombreEstadoPersonal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEstadoPersonal == null) ? 0 : idEstadoPersonal.hashCode());
		result = prime * result + ((nombreEstadoPersonal == null) ? 0 : nombreEstadoPersonal.hashCode());
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
		EstadoPersonal other = (EstadoPersonal) obj;
		if (idEstadoPersonal == null) {
			if (other.idEstadoPersonal != null)
				return false;
		} else if (!idEstadoPersonal.equals(other.idEstadoPersonal))
			return false;
		if (nombreEstadoPersonal == null) {
			if (other.nombreEstadoPersonal != null)
				return false;
		} else if (!nombreEstadoPersonal.equals(other.nombreEstadoPersonal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EstadoPersonal [idEstadoPersonal=" + idEstadoPersonal + ", nombreEstadoPersonal=" + nombreEstadoPersonal
				+ "]";
	}
	
	
}
