package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "t_gradocomplejidadhospital")
@NamedQueries({ @NamedQuery(name = "ComplejidadHospital.listarcomplejidadhospital", query = "SELECT com FROM GradocomplejidadHospital com"),
	@NamedQuery(name = "ComplejidadHospital.buscarlistarcomplejidadhospital", query = "SELECT com FROM GradocomplejidadHospital com where com.idcomplejidad=:id") })
public class GradocomplejidadHospital implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String idcomplejidad;
	
	@Column(name="nombre",nullable=false,length=50)
	private String nombre;

	
	public GradocomplejidadHospital() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param idcomplejidad
	 * @param nombre
	 */
	public GradocomplejidadHospital(String idcomplejidad, String nombre) {
		super();
		this.idcomplejidad = idcomplejidad;
		this.nombre = nombre;
	}

	public String getIdcomplejidad() {
		return idcomplejidad;
	}

	public void setIdcomplejidad(String idcomplejidad) {
		this.idcomplejidad = idcomplejidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idcomplejidad == null) ? 0 : idcomplejidad.hashCode());
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
		GradocomplejidadHospital other = (GradocomplejidadHospital) obj;
		if (idcomplejidad == null) {
			if (other.idcomplejidad != null)
				return false;
		} else if (!idcomplejidad.equals(other.idcomplejidad))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GradocomplejidadHospital [idcomplejidad=" + idcomplejidad + ", nombre=" + nombre + "]";
	}
	
	
}
