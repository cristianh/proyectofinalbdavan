package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.AcompaņantepersonaPK;

@Entity
@Table(name="t_acompanante")
public class Acompanante implements Serializable {


	@EmbeddedId
	private AcompaņantepersonaPK idacompananate;
	
	@Column(name="parentezcoacompanante")
	private String parentezcoacompaņante;
	
	@Column(name="telefonoacompanante")
	private String telegonoacompaņante;
	
	/*@OneToMany(mappedBy="acompananteid",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Urgenciaambulancia> urgenciaambulancia;*/
	
	
	public Acompanante() {
		// TODO Auto-generated constructor stub
	}

	public Acompanante(AcompaņantepersonaPK idacompananate, String parentezcoacompaņante, String telegonoacompaņante,
			List<UrgenciaAmbulancia> urgenciaambulancia) {
		super();
		this.idacompananate = idacompananate;
		this.parentezcoacompaņante = parentezcoacompaņante;
		this.telegonoacompaņante = telegonoacompaņante;
		
	}

	public AcompaņantepersonaPK getIdacompananate() {
		return idacompananate;
	}

	public void setIdacompananate(AcompaņantepersonaPK idacompananate) {
		this.idacompananate = idacompananate;
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
		result = prime * result + ((idacompananate == null) ? 0 : idacompananate.hashCode());
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
		Acompanante other = (Acompanante) obj;
		if (idacompananate == null) {
			if (other.idacompananate != null)
				return false;
		} else if (!idacompananate.equals(other.idacompananate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Acompanante [idacompananate=" + idacompananate + ", parentezcoacompaņante=" + parentezcoacompaņante
				+ ", telegonoacompaņante=" + telegonoacompaņante + "]";
	}

	
	
	 
	
}
