package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.OperadorPersonalPK;

@Entity
@Table(name="t_operador")
public class OperadorPersonal implements Serializable {

	@EmbeddedId
	private OperadorPersonalPK idpk;
	
	@ManyToOne
	@JoinColumn(name="personaId",insertable=false,updatable=false)
	private Persona personaop;
	
	@ManyToOne
	@JoinColumn(name="operadorId",insertable=false,updatable=false)
	private Persona operadorpe;
	
	
	/*@OneToMany(mappedBy="operadorurgencia",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<UrgenciaEvento> urgenciaevento;*/
	
	public OperadorPersonal() {
		// TODO Auto-generated constructor stub
	}
	
	

	public OperadorPersonal(OperadorPersonalPK idpk, Persona personaop, Persona operadorpe) {
		super();
		this.idpk = idpk;
		this.personaop = personaop;
		this.operadorpe = operadorpe;
	}

	


	public OperadorPersonalPK getIdpk() {
		return idpk;
	}



	public void setIdpk(OperadorPersonalPK idpk) {
		this.idpk = idpk;
	}



	public Persona getPersonaop() {
		return personaop;
	}



	public void setPersonaop(Persona personaop) {
		this.personaop = personaop;
	}



	public Persona getOperadorpe() {
		return operadorpe;
	}



	public void setOperadorpe(Persona operadorpe) {
		this.operadorpe = operadorpe;
	}



	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idpk == null) ? 0 : idpk.hashCode());
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
		OperadorPersonal other = (OperadorPersonal) obj;
		if (idpk == null) {
			if (other.idpk != null)
				return false;
		} else if (!idpk.equals(other.idpk))
			return false;
		return true;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
