package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_especialidad")
public class Especialidadcristian implements Serializable {

	@Id
	private Integer id_especialidad;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "estado",length=1)
	private char estado;
	
	public Especialidadcristian() {
		// TODO Auto-generated constructor stub
	}

	public Especialidadcristian(Integer id_especialidad, String nombre, char estado) {
		super();
		this.id_especialidad = id_especialidad;
		this.nombre = nombre;
		this.estado = estado;
	}

	public Integer getId_especialidad() {
		return id_especialidad;
	}

	public void setId_especialidad(Integer id_especialidad) {
		this.id_especialidad = id_especialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_especialidad == null) ? 0 : id_especialidad.hashCode());
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
		Especialidadcristian other = (Especialidadcristian) obj;
		if (id_especialidad == null) {
			if (other.id_especialidad != null)
				return false;
		} else if (!id_especialidad.equals(other.id_especialidad))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Especialidad [id_especialidad=" + id_especialidad + ", nombre=" + nombre + ", estado=" + estado + "]";
	}
	
	
	
}
