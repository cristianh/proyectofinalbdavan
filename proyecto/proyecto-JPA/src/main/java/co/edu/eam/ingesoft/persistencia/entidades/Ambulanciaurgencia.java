package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "t_ambulanciaurgencia")

public class AmbulanciaUrgencia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
	private Integer idambulanciaurgencia;

	@ManyToOne
	@JoinColumn(name = "personalambulancia")
	private PersonalAmbulancia personalambulancia;

	@ManyToOne
	@JoinColumn(name = "urgenciaambulacia", nullable = false)
	private UrgenciaAmbulancia urgenciaambulancia;

	@ManyToOne
	@JoinColumn(name = "ambulanciaid", nullable = false)
	private Ambulancia ambulanciaid;

	public Integer getIdambulanciaurgencia() {
		return idambulanciaurgencia;
	}

	public void setIdambulanciaurgencia(Integer idambulanciaurgencia) {
		this.idambulanciaurgencia = idambulanciaurgencia;
	}

	public PersonalAmbulancia getPersonalambulancia() {
		return personalambulancia;
	}

	public void setPersonalambulancia(PersonalAmbulancia personalambulancia) {
		this.personalambulancia = personalambulancia;
	}

	public UrgenciaAmbulancia getUrgenciaambulancia() {
		return urgenciaambulancia;
	}

	public void setUrgenciaambulancia(UrgenciaAmbulancia urgenciaambulancia) {
		this.urgenciaambulancia = urgenciaambulancia;
	}

	public Ambulancia getAmbulanciaid() {
		return ambulanciaid;
	}

	public void setAmbulanciaid(Ambulancia ambulanciaid) {
		this.ambulanciaid = ambulanciaid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ambulanciaid == null) ? 0 : ambulanciaid.hashCode());
		result = prime * result + ((idambulanciaurgencia == null) ? 0 : idambulanciaurgencia.hashCode());
		result = prime * result + ((personalambulancia == null) ? 0 : personalambulancia.hashCode());
		result = prime * result + ((urgenciaambulancia == null) ? 0 : urgenciaambulancia.hashCode());
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
		AmbulanciaUrgencia other = (AmbulanciaUrgencia) obj;
		if (ambulanciaid == null) {
			if (other.ambulanciaid != null)
				return false;
		} else if (!ambulanciaid.equals(other.ambulanciaid))
			return false;
		if (idambulanciaurgencia == null) {
			if (other.idambulanciaurgencia != null)
				return false;
		} else if (!idambulanciaurgencia.equals(other.idambulanciaurgencia))
			return false;
		if (personalambulancia == null) {
			if (other.personalambulancia != null)
				return false;
		} else if (!personalambulancia.equals(other.personalambulancia))
			return false;
		if (urgenciaambulancia == null) {
			if (other.urgenciaambulancia != null)
				return false;
		} else if (!urgenciaambulancia.equals(other.urgenciaambulancia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ambulanciaurgencia [idambulanciaurgencia=" + idambulanciaurgencia + ", personalambulancia="
				+ personalambulancia + ", urgenciaambulancia=" + urgenciaambulancia + ", ambulanciaid=" + ambulanciaid
				+ "]";
	}

	
}
