package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_afectado")
public class Afectado implements Serializable {

	@Id
	private Integer idafectado;
	
	@ManyToOne
	@JoinColumn(name="emergenciaid")
	private Emergencia emergenciaid;
	
	@ManyToOne
	@JoinColumn(name="personaid")
	private Persona personaid;
	
	@Column(name="descripcion")
	private String descripcion;
	
	public Afectado() {
		// TODO Auto-generated constructor stub
	}

	public Afectado(Integer idafectado, Emergencia emergenciaid, Persona personaid, String descripcion) {
		super();
		this.idafectado = idafectado;
		this.emergenciaid = emergenciaid;
		this.personaid = personaid;
		this.descripcion = descripcion;
	}
	
	

	public Integer getIdafectado() {
		return idafectado;
	}

	public void setIdafectado(Integer idafectado) {
		this.idafectado = idafectado;
	}

	public Emergencia getEmergenciaid() {
		return emergenciaid;
	}

	public void setEmergenciaid(Emergencia emergenciaid) {
		this.emergenciaid = emergenciaid;
	}

	public Persona getPersonaid() {
		return personaid;
	}

	public void setPersonaid(Persona personaid) {
		this.personaid = personaid;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idafectado == null) ? 0 : idafectado.hashCode());
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
		Afectado other = (Afectado) obj;
		if (idafectado == null) {
			if (other.idafectado != null)
				return false;
		} else if (!idafectado.equals(other.idafectado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Afectado [idafectado=" + idafectado + ", emergenciaid=" + emergenciaid + ", personaid=" + personaid
				+ ", descripcion=" + descripcion + "]";
	}

	
	
}
