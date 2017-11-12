package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="t_tipocentro")
@NamedQueries({ @NamedQuery(name = "TipoCentroMedico.listartipocentro", query = "SELECT t FROM TipoCentroMedico t"),
	@NamedQuery(name = "TipoCentroMedico.buscarlistartipocentro", query = "SELECT tp FROM TipoCentroMedico tp where tp.idtipoCentromedico=:id") })
public class TipoCentroMedico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String idtipoCentromedico;
	
	@Column(name="tiponombrecentromedico")
	private String nombre;
	
	
	public TipoCentroMedico() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param tipoCentromedico
	 * @param nombre
	 */
	public TipoCentroMedico(String idtipoCentromedico, String nombre) {
		super();
		this.idtipoCentromedico = idtipoCentromedico;
		this.nombre = nombre;
	}

	
	

	public String getIdtipoCentromedico() {
		return idtipoCentromedico;
	}

	public void setIdtipoCentromedico(String idtipoCentromedico) {
		this.idtipoCentromedico = idtipoCentromedico;
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
		result = prime * result + ((idtipoCentromedico == null) ? 0 : idtipoCentromedico.hashCode());
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
		TipoCentroMedico other = (TipoCentroMedico) obj;
		if (idtipoCentromedico == null) {
			if (other.idtipoCentromedico != null)
				return false;
		} else if (!idtipoCentromedico.equals(other.idtipoCentromedico))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoCentro [idtipoCentromedico=" + idtipoCentromedico + ", nombre=" + nombre + "]";
	}
	
}
