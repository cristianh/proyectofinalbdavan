package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="t_urgencia")
@NamedQueries({ @NamedQuery(name = "ReporteUrgencia.listarreportesurgencia", query = "SELECT u FROM Urgencia u"),
	@NamedQuery(name = "ReporteUrgencia.buscarlistarreportesurgencia", query = "SELECT u FROM Urgencia u where u.idurgencia=:id") })
public class Urgencia implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String idurgencia;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@Column(name="estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="operadorfuncionario",nullable=false)
	private OperadorPersonal operadorpersonal;
	
	@ManyToOne
	@JoinColumn(name="reporteurgencia",nullable=false)
	private ReporteUrgencia reporteurgencia;
	
	
	
	public Urgencia() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param idreporteurgencia
	 * @param fecha
	 * @param estado
	 * @param operadorpersonal
	 * @param reporteurgencia
	 */
	public Urgencia(String idurgencia, Date fecha, String estado, OperadorPersonal operadorpersonal,
			ReporteUrgencia reporteurgencia) {
		super();
		this.idurgencia = idurgencia;
		this.fecha = fecha;
		this.estado = estado;
		this.operadorpersonal = operadorpersonal;
		this.reporteurgencia = reporteurgencia;
	}





	public String getIdurgencia() {
		return idurgencia;
	}



	public void setIdurgencia(String idurgencia) {
		this.idurgencia = idurgencia;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public OperadorPersonal getOperadorpersonal() {
		return operadorpersonal;
	}



	public void setOperadorpersonal(OperadorPersonal operadorpersonal) {
		this.operadorpersonal = operadorpersonal;
	}



	public ReporteUrgencia getReporteurgencia() {
		return reporteurgencia;
	}



	public void setReporteurgencia(ReporteUrgencia reporteurgencia) {
		this.reporteurgencia = reporteurgencia;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idurgencia == null) ? 0 : idurgencia.hashCode());
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
		Urgencia other = (Urgencia) obj;
		if (idurgencia == null) {
			if (other.idurgencia != null)
				return false;
		} else if (!idurgencia.equals(other.idurgencia))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Urgencia [idurgencia=" + idurgencia + ", fecha=" + fecha + ", estado=" + estado + ", operadorpersonal="
				+ operadorpersonal + ", reporteurgencia=" + reporteurgencia + "]";
	}



	
	
	
}
