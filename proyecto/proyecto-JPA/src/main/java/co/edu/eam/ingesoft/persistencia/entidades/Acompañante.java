package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.AcompañantepersonaPK;

@Entity
@Table(name="t_acompañante")
public class Acompañante implements Serializable {

	@EmbeddedId
	private AcompañantepersonaPK idacompañanate;
	
	@Column(name="parentezcoacompañante")
	private String parentezcoacompañante;
	
	@Column(name="telefonoacompañante")
	private String telegonoacompañante;
	
	public Acompañante() {
		// TODO Auto-generated constructor stub
	}

	public Acompañante(AcompañantepersonaPK idacompañanate, String parentezcoacompañante, String telegonoacompañante) {
		super();
		this.idacompañanate = idacompañanate;
		this.parentezcoacompañante = parentezcoacompañante;
		this.telegonoacompañante = telegonoacompañante;
	}

	public AcompañantepersonaPK getIdacompañanate() {
		return idacompañanate;
	}

	public void setIdacompañanate(AcompañantepersonaPK idacompañanate) {
		this.idacompañanate = idacompañanate;
	}

	public String getParentezcoacompañante() {
		return parentezcoacompañante;
	}

	public void setParentezcoacompañante(String parentezcoacompañante) {
		this.parentezcoacompañante = parentezcoacompañante;
	}

	public String getTelegonoacompañante() {
		return telegonoacompañante;
	}

	public void setTelegonoacompañante(String telegonoacompañante) {
		this.telegonoacompañante = telegonoacompañante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idacompañanate == null) ? 0 : idacompañanate.hashCode());
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
		Acompañante other = (Acompañante) obj;
		if (idacompañanate == null) {
			if (other.idacompañanate != null)
				return false;
		} else if (!idacompañanate.equals(other.idacompañanate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Acompañante [idacompañanate=" + idacompañanate + ", parentezcoacompañante=" + parentezcoacompañante
				+ ", telegonoacompañante=" + telegonoacompañante + "]";
	}
	 
	
}
