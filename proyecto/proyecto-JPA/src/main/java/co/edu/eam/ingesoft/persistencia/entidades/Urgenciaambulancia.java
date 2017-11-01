package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "t_urgenciaambulancia")
public class UrgenciaAmbulancia implements Serializable {

	@Id
	private Integer idurgenciaambulacia;
	
	@Column(name="acompananteid")
	private Acompanante acompanante;
	
	
	@ManyToOne
	@JoinColumn(name = "entidadhospitalariaenvento", nullable = false)
	private EntidadHospitalaria entidadhospitalaria;

	@OneToMany(mappedBy = "urgenciaambulancia")
	private List<AmbulanciaUrgencia> ambulanciaurgencia;

	@Column(name="gradpcomplejidad")
	private Integer gradoComplejidad;	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="acompananteurgenciaambulancia") private Acompanante
	 * acompananteid;
	 */

	

	public Integer getIdurgenciaambulacia() {
		return idurgenciaambulacia;
	}

	public void setIdurgenciaambulacia(Integer idurgenciaambulacia) {
		this.idurgenciaambulacia = idurgenciaambulacia;
	}

	public List<AmbulanciaUrgencia> getAmbulanciaurgencia() {
		return ambulanciaurgencia;
	}

	public void setAmbulanciaurgencia(List<AmbulanciaUrgencia> ambulanciaurgencia) {
		this.ambulanciaurgencia = ambulanciaurgencia;
	}

	public EntidadHospitalaria getEntidadhospitalaria() {
		return entidadhospitalaria;
	}

	public void setEntidadhospitalaria(EntidadHospitalaria entidadhospitalaria) {
		this.entidadhospitalaria = entidadhospitalaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ambulanciaurgencia == null) ? 0 : ambulanciaurgencia.hashCode());
		result = prime * result + ((entidadhospitalaria == null) ? 0 : entidadhospitalaria.hashCode());
		result = prime * result + ((idurgenciaambulacia == null) ? 0 : idurgenciaambulacia.hashCode());
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
		UrgenciaAmbulancia other = (UrgenciaAmbulancia) obj;
		if (ambulanciaurgencia == null) {
			if (other.ambulanciaurgencia != null)
				return false;
		} else if (!ambulanciaurgencia.equals(other.ambulanciaurgencia))
			return false;
		if (entidadhospitalaria == null) {
			if (other.entidadhospitalaria != null)
				return false;
		} else if (!entidadhospitalaria.equals(other.entidadhospitalaria))
			return false;
		if (idurgenciaambulacia == null) {
			if (other.idurgenciaambulacia != null)
				return false;
		} else if (!idurgenciaambulacia.equals(other.idurgenciaambulacia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UrgenciaAmbulancia [idurgenciaambulacia=" + idurgenciaambulacia + ", ambulanciaurgencia="
				+ ambulanciaurgencia + ", entidadhospitalaria=" + entidadhospitalaria + "]";
	}

}
