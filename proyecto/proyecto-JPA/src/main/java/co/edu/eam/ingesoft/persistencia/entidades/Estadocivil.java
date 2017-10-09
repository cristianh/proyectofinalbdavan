package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_estadocivil")
public class Estadocivil implements Serializable {
	
	@Id
	private Integer idestadocivil;
	
	@Column(name="nombreestadocivil",length=50)
	private String nombreestadocivil;
	
	public Estadocivil() {
		// TODO Auto-generated constructor stub
	}

	public Estadocivil(Integer idestadocivil, String nombreestadocivil) {
		super();
		this.idestadocivil = idestadocivil;
		this.nombreestadocivil = nombreestadocivil;
	}

	public Integer getIdestadocivil() {
		return idestadocivil;
	}

	public void setIdestadocivil(Integer idestadocivil) {
		this.idestadocivil = idestadocivil;
	}

	public String getNombreestadocivil() {
		return nombreestadocivil;
	}

	public void setNombreestadocivil(String nombreestadocivil) {
		this.nombreestadocivil = nombreestadocivil;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idestadocivil == null) ? 0 : idestadocivil.hashCode());
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
		Estadocivil other = (Estadocivil) obj;
		if (idestadocivil == null) {
			if (other.idestadocivil != null)
				return false;
		} else if (!idestadocivil.equals(other.idestadocivil))
			return false;
		return true;
	}
	
}
