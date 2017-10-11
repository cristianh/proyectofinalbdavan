package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.AcompaņantepersonaPK;

@Entity
@Table(name="t_acompaņante")
public class Acompaņante implements Serializable {

	@EmbeddedId
	private AcompaņantepersonaPK idacompaņanate;
	
	@Column(name="parentezcoacompaņante")
	private String parentezcoacompaņante;
	
	@Column(name="telefonoacompaņante")
	private String telegonoacompaņante;
	
	public Acompaņante() {
		// TODO Auto-generated constructor stub
	}

	public Acompaņante(AcompaņantepersonaPK idacompaņanate, String parentezcoacompaņante, String telegonoacompaņante) {
		super();
		this.idacompaņanate = idacompaņanate;
		this.parentezcoacompaņante = parentezcoacompaņante;
		this.telegonoacompaņante = telegonoacompaņante;
	}

	public AcompaņantepersonaPK getIdacompaņanate() {
		return idacompaņanate;
	}

	public void setIdacompaņanate(AcompaņantepersonaPK idacompaņanate) {
		this.idacompaņanate = idacompaņanate;
	}

	public String getParentezcoacompaņante() {
		return parentezcoacompaņante;
	}

	public void setParentezcoacompaņante(String parentezcoacompaņante) {
		this.parentezcoacompaņante = parentezcoacompaņante;
	}

	public String getTelegonoacompaņante() {
		return telegonoacompaņante;
	}

	public void setTelegonoacompaņante(String telegonoacompaņante) {
		this.telegonoacompaņante = telegonoacompaņante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idacompaņanate == null) ? 0 : idacompaņanate.hashCode());
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
		Acompaņante other = (Acompaņante) obj;
		if (idacompaņanate == null) {
			if (other.idacompaņanate != null)
				return false;
		} else if (!idacompaņanate.equals(other.idacompaņanate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Acompaņante [idacompaņanate=" + idacompaņanate + ", parentezcoacompaņante=" + parentezcoacompaņante
				+ ", telegonoacompaņante=" + telegonoacompaņante + "]";
	}
	 
	
}
