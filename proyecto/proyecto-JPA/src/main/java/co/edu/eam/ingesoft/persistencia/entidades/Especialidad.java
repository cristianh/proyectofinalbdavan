package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_especialidad")
public class Especialidad implements Serializable {

	@Id
	private Integer id_especialidad;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "estado",length=1)
	private char estado;
	
	public Especialidad() {
		// TODO Auto-generated constructor stub
	}

	public Especialidad(Integer id_especialidad, String nombre, char estado) {
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
	
}
