package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="T_CargoPersonal")

@NamedQueries({ @NamedQuery(name = "CargoPersonal.listarcargopersonal", query = "SELECT tip FROM CargoPersonal tip"),
	@NamedQuery(name = "CargoPersonal.listarbuscarcargopersonal", query = "SELECT tip FROM CargoPersonal tip where tip.idCargoPersonal=:codigo") })

public class CargoPersonal implements Serializable {

	@Id
	@Column
	private String idCargoPersonal;
	
	@Column
	private String nombre;

	/**
	 * 
	 */
	public CargoPersonal() {
		super();
	}

	/**
	 * @param idCargoPersonal
	 * @param nombre
	 */
	public CargoPersonal(String idCargoPersonal, String nombre) {
		super();
		this.idCargoPersonal = idCargoPersonal;
		this.nombre = nombre;
	}

	public String getIdCargoPersonal() {
		return idCargoPersonal;
	}

	public void setIdCargoPersonal(String idCargoPersonal) {
		this.idCargoPersonal = idCargoPersonal;
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
		result = prime * result + ((idCargoPersonal == null) ? 0 : idCargoPersonal.hashCode());
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
		CargoPersonal other = (CargoPersonal) obj;
		if (idCargoPersonal == null) {
			if (other.idCargoPersonal != null)
				return false;
		} else if (!idCargoPersonal.equals(other.idCargoPersonal))
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
		return "CargoPersonal [idCargoPersonal=" + idCargoPersonal + ", nombre=" + nombre + "]";
	}
	
	
}
