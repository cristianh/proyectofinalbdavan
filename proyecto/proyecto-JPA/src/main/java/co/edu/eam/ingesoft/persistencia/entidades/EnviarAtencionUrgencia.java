package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_enviarAtencionUrgencia")

@NamedNativeQueries({
		@NamedNativeQuery(name = "EnviarAtencionUrgencia.listarEnviarAtencionUrgencia", query = "SELECT * FROM t_enviarAtencionUrgencia", resultClass = Ambulancia.class),
		@NamedNativeQuery(name = "EnviarAtencionUrgencia.listarbuscarEnviarAtencionUrgencia", query = "SELECT * FROM t_enviarAtencionUrgencia  where idatencionS=:estado", resultClass = Ambulancia.class) })

public class EnviarAtencionUrgencia implements Serializable {

	@Id
	@Column(name = "idatencion")
	private String idatencion;

	@ManyToOne
	@JoinColumn(name = "reporteurgencia")
	private ReporteUrgencia reporteUrgencia;

	@ManyToOne
	@JoinColumn(name = "ambulancia")
	private Ambulancia ambulancia;

	
	/**
	 * este bloque es de ensayo para el enviar ath 17/11/2017/11:55
	 */
	@ManyToOne
	@JoinColumn(name="conductor")
	private Personal conductor;
	
	@ManyToOne
	@JoinColumn(name="auxiliar")
	private Personal auxiliar;
	
	@ManyToOne
	@JoinColumn(name="paramedico")
	private Personal paramedico;
	
	
	
	public EnviarAtencionUrgencia() {

	}



	/**
	 * @param idatencion
	 * @param reporteUrgencia
	 * @param ambulancia
	 * @param conductor
	 * @param auxiliar
	 * @param paramedico
	 */
	public EnviarAtencionUrgencia(String idatencion, ReporteUrgencia reporteUrgencia, Ambulancia ambulancia,
			Personal conductor, Personal auxiliar, Personal paramedico) {
		super();
		this.idatencion = idatencion;
		this.reporteUrgencia = reporteUrgencia;
		this.ambulancia = ambulancia;
		this.conductor = conductor;
		this.auxiliar = auxiliar;
		this.paramedico = paramedico;
	}

	


	public String getIdatencion() {
		return idatencion;
	}



	public void setIdatencion(String idatencion) {
		this.idatencion = idatencion;
	}



	public ReporteUrgencia getReporteUrgencia() {
		return reporteUrgencia;
	}



	public void setReporteUrgencia(ReporteUrgencia reporteUrgencia) {
		this.reporteUrgencia = reporteUrgencia;
	}



	public Ambulancia getAmbulancia() {
		return ambulancia;
	}



	public void setAmbulancia(Ambulancia ambulancia) {
		this.ambulancia = ambulancia;
	}



	public Personal getConductor() {
		return conductor;
	}



	public void setConductor(Personal conductor) {
		this.conductor = conductor;
	}



	public Personal getAuxiliar() {
		return auxiliar;
	}



	public void setAuxiliar(Personal auxiliar) {
		this.auxiliar = auxiliar;
	}



	public Personal getParamedico() {
		return paramedico;
	}



	public void setParamedico(Personal paramedico) {
		this.paramedico = paramedico;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ambulancia == null) ? 0 : ambulancia.hashCode());
		result = prime * result + ((auxiliar == null) ? 0 : auxiliar.hashCode());
		result = prime * result + ((conductor == null) ? 0 : conductor.hashCode());
		result = prime * result + ((idatencion == null) ? 0 : idatencion.hashCode());
		result = prime * result + ((paramedico == null) ? 0 : paramedico.hashCode());
		result = prime * result + ((reporteUrgencia == null) ? 0 : reporteUrgencia.hashCode());
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
		EnviarAtencionUrgencia other = (EnviarAtencionUrgencia) obj;
		if (ambulancia == null) {
			if (other.ambulancia != null)
				return false;
		} else if (!ambulancia.equals(other.ambulancia))
			return false;
		if (auxiliar == null) {
			if (other.auxiliar != null)
				return false;
		} else if (!auxiliar.equals(other.auxiliar))
			return false;
		if (conductor == null) {
			if (other.conductor != null)
				return false;
		} else if (!conductor.equals(other.conductor))
			return false;
		if (idatencion == null) {
			if (other.idatencion != null)
				return false;
		} else if (!idatencion.equals(other.idatencion))
			return false;
		if (paramedico == null) {
			if (other.paramedico != null)
				return false;
		} else if (!paramedico.equals(other.paramedico))
			return false;
		if (reporteUrgencia == null) {
			if (other.reporteUrgencia != null)
				return false;
		} else if (!reporteUrgencia.equals(other.reporteUrgencia))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "EnviarAtencionUrgencia [idatencion=" + idatencion + ", reporteUrgencia=" + reporteUrgencia
				+ ", ambulancia=" + ambulancia + ", conductor=" + conductor + ", auxiliar=" + auxiliar + ", paramedico="
				+ paramedico + "]";
	}



	

}
