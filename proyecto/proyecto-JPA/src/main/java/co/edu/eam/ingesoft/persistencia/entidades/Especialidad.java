
package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_especialidad")

@NamedNativeQueries({ @NamedNativeQuery(name = "Especialidad.listarespecialidad",
query = "SELECT * FROM t_especialidad",resultClass=Especialidad.class),
	@NamedNativeQuery(name = "Ambulancia.listarbuscarespecialidad",
	query = "SELECT * FROM t_especialidad  where placaambulancia=:estado",resultClass=Especialidad.class) })


public class Especialidad implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CodigoEspecialidad", unique = true, nullable = false, length = 70)
	private String codigo;

	@Column(name = "NombreEspecialidad", nullable = false, length = 100)
	private String nombre;

	@Column(name = "estadoespecialidad", nullable = false, length = 20)
	private String estadoespecialidad;
	
	@ManyToOne
	@JoinColumn(name = "endidadhospitalaria")
	private EntidadHospitalaria entidadhospitalaria;
	

	/**
	 * @param codigo
	 * @param nombre
	 * @param estadoespecialidad
	 */
	public Especialidad(String codigo, String nombre, String estadoespecialidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.estadoespecialidad = estadoespecialidad;
	}

	public Especialidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public String getEstadoespecialidad() {
		return estadoespecialidad;
	}

	public void setEstadoespecialidad(String estadoespecialidad) {
		this.estadoespecialidad = estadoespecialidad;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Especialidad other = (Especialidad) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Especialidad [codigo=" + codigo + ", nombre=" + nombre + ", estadoespecialidad=" + estadoespecialidad
				+ "]";
	}

}
