package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Disponibilidad")
@NamedQueries({ @NamedQuery(name = "Disponibilidad.listardisponibilidad", query = "SELECT d FROM Disponibilidad d"),
	@NamedQuery(name = "Disponibilidad.listarbuscardisponibilidad", query = "SELECT d FROM Disponibilidad d where d.idDisponibilidad=:codigo") })


public class Disponibilidad implements Serializable {
	@Id
	@Column(name="idDisponibilidad")
	private String idDisponibilidad;
	
	@Column(name="nombre")
	private String nombre;

	
	/**
	 * 
	 */
	public Disponibilidad() {
		super();
	}
	

	/**
	 * @param idDisponibilidad
	 * @param nombre
	 */
	public Disponibilidad(String idDisponibilidad, String nombre) {
		super();
		this.idDisponibilidad = idDisponibilidad;
		this.nombre = nombre;
	}



	public String getIdDisponibilidad() {
		return idDisponibilidad;
	}

	public void setIdDisponibilidad(String idDisponibilidad) {
		this.idDisponibilidad = idDisponibilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDisponibilidad == null) ? 0 : idDisponibilidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Disponibilidad other = (Disponibilidad) obj;
		if (idDisponibilidad == null) {
			if (other.idDisponibilidad != null)
				return false;
		} else if (!idDisponibilidad.equals(other.idDisponibilidad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "TipoAmbulancia [idDisponibilidad=" + idDisponibilidad + ", nombre=" + nombre + "]";
	}
	
	
}
