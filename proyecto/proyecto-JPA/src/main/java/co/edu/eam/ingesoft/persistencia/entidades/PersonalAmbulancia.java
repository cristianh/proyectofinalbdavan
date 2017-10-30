package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="t_personaambulancia")
public class PersonalAmbulancia implements Serializable {
	
	@Id
	private Integer idpersonalambulancia;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date horainicioturno;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date horasalidaturno;
	
	@ManyToOne
	@JoinColumn(name="idauxiliar",nullable=false)
	private Funcionario idauxiliar;
	
	@ManyToOne
	@JoinColumn(name="idparamedico",nullable=false)
	private Funcionario idconductor;
	
	@ManyToOne
	@JoinColumn(name="idmedico",nullable=false)
	private Funcionario idmedico;
	
	@OneToMany(mappedBy="personalambulancia")
	private List<AmbulanciaUrgencia> ambulanciaurgencia;

	public Integer getIdpersonalambulancia() {
		return idpersonalambulancia;
	}

	public void setIdpersonalambulancia(Integer idpersonalambulancia) {
		this.idpersonalambulancia = idpersonalambulancia;
	}

	public Date getHorainicioturno() {
		return horainicioturno;
	}

	public void setHorainicioturno(Date horainicioturno) {
		this.horainicioturno = horainicioturno;
	}

	public Date getHorasalidaturno() {
		return horasalidaturno;
	}

	public void setHorasalidaturno(Date horasalidaturno) {
		this.horasalidaturno = horasalidaturno;
	}

	public Funcionario getIdauxiliar() {
		return idauxiliar;
	}

	public void setIdauxiliar(Funcionario idauxiliar) {
		this.idauxiliar = idauxiliar;
	}

	public Funcionario getIdconductor() {
		return idconductor;
	}

	public void setIdconductor(Funcionario idconductor) {
		this.idconductor = idconductor;
	}

	public Funcionario getIdmedico() {
		return idmedico;
	}

	public void setIdmedico(Funcionario idmedico) {
		this.idmedico = idmedico;
	}

	public List<AmbulanciaUrgencia> getAmbulanciaurgencia() {
		return ambulanciaurgencia;
	}

	public void setAmbulanciaurgencia(List<AmbulanciaUrgencia> ambulanciaurgencia) {
		this.ambulanciaurgencia = ambulanciaurgencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ambulanciaurgencia == null) ? 0 : ambulanciaurgencia.hashCode());
		result = prime * result + ((horainicioturno == null) ? 0 : horainicioturno.hashCode());
		result = prime * result + ((horasalidaturno == null) ? 0 : horasalidaturno.hashCode());
		result = prime * result + ((idauxiliar == null) ? 0 : idauxiliar.hashCode());
		result = prime * result + ((idconductor == null) ? 0 : idconductor.hashCode());
		result = prime * result + ((idmedico == null) ? 0 : idmedico.hashCode());
		result = prime * result + ((idpersonalambulancia == null) ? 0 : idpersonalambulancia.hashCode());
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
		PersonalAmbulancia other = (PersonalAmbulancia) obj;
		if (ambulanciaurgencia == null) {
			if (other.ambulanciaurgencia != null)
				return false;
		} else if (!ambulanciaurgencia.equals(other.ambulanciaurgencia))
			return false;
		if (horainicioturno == null) {
			if (other.horainicioturno != null)
				return false;
		} else if (!horainicioturno.equals(other.horainicioturno))
			return false;
		if (horasalidaturno == null) {
			if (other.horasalidaturno != null)
				return false;
		} else if (!horasalidaturno.equals(other.horasalidaturno))
			return false;
		if (idauxiliar == null) {
			if (other.idauxiliar != null)
				return false;
		} else if (!idauxiliar.equals(other.idauxiliar))
			return false;
		if (idconductor == null) {
			if (other.idconductor != null)
				return false;
		} else if (!idconductor.equals(other.idconductor))
			return false;
		if (idmedico == null) {
			if (other.idmedico != null)
				return false;
		} else if (!idmedico.equals(other.idmedico))
			return false;
		if (idpersonalambulancia == null) {
			if (other.idpersonalambulancia != null)
				return false;
		} else if (!idpersonalambulancia.equals(other.idpersonalambulancia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personalambulancia [idpersonalambulancia=" + idpersonalambulancia + ", horainicioturno="
				+ horainicioturno + ", horasalidaturno=" + horasalidaturno + ", idauxiliar=" + idauxiliar
				+ ", idconductor=" + idconductor + ", idmedico=" + idmedico + ", ambulanciaurgencia="
				+ ambulanciaurgencia + "]";
	}

	
	
}
