package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.Acompa�antepersonaPK;

@Entity
@Table(name="t_acompa�ante")
public class Acompa�ante implements Serializable {

	@EmbeddedId
	private Acompa�antepersonaPK idacompa�anate;
	
	@Column(name="parentezcoacompa�ante")
	private String parentezcoacompa�ante;
	
	@Column(name="telefonoacompa�ante")
	private String telegonoacompa�ante;
	
	public Acompa�ante() {
		// TODO Auto-generated constructor stub
	}

	public Acompa�ante(Acompa�antepersonaPK idacompa�anate, String parentezcoacompa�ante, String telegonoacompa�ante) {
		super();
		this.idacompa�anate = idacompa�anate;
		this.parentezcoacompa�ante = parentezcoacompa�ante;
		this.telegonoacompa�ante = telegonoacompa�ante;
	}

	public Acompa�antepersonaPK getIdacompa�anate() {
		return idacompa�anate;
	}

	public void setIdacompa�anate(Acompa�antepersonaPK idacompa�anate) {
		this.idacompa�anate = idacompa�anate;
	}

	public String getParentezcoacompa�ante() {
		return parentezcoacompa�ante;
	}

	public void setParentezcoacompa�ante(String parentezcoacompa�ante) {
		this.parentezcoacompa�ante = parentezcoacompa�ante;
	}

	public String getTelegonoacompa�ante() {
		return telegonoacompa�ante;
	}

	public void setTelegonoacompa�ante(String telegonoacompa�ante) {
		this.telegonoacompa�ante = telegonoacompa�ante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idacompa�anate == null) ? 0 : idacompa�anate.hashCode());
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
		Acompa�ante other = (Acompa�ante) obj;
		if (idacompa�anate == null) {
			if (other.idacompa�anate != null)
				return false;
		} else if (!idacompa�anate.equals(other.idacompa�anate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Acompa�ante [idacompa�anate=" + idacompa�anate + ", parentezcoacompa�ante=" + parentezcoacompa�ante
				+ ", telegonoacompa�ante=" + telegonoacompa�ante + "]";
	}
	 
	
}
