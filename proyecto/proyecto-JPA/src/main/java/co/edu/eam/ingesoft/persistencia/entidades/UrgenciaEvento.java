package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "t_urgenciaevento")
public class UrgenciaEvento implements Serializable {

	@Id
	private Integer idurgenciaevento;

	@ManyToOne
	@JoinColumn(name = "idurgencia", nullable = false)
	private Urgencia idurgencia;

	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "ippersonal", referencedColumnName = "id_peronal"),
			@JoinColumn(name = "idoperador", referencedColumnName = "id_operador") })
	private OperadorPersonal operador;

	@ManyToOne
	@JoinColumn(name = "idurgenciaambulancia", nullable = false)
	private UrgenciaAmbulancia urgenciaambulancia;

	@ManyToOne
	@JoinColumn(name = "tipoeventourgencia", nullable = false)
	private TipoEvento tipoevento;

	@Column(name = "descripciourgenciaevento", length = 100)
	private String descripcionurgenciaevento;

	@Column(name = "lugarurgenciaevento", length = 100)
	private String lugarurgenciaevento;

	@Column(name = "estadourgenciaevento", length = 1)
	private char estadourgenciaevento;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaurgenciaevento;

	/*
	 * @ManyToOne(fetch=FetchType.LAZY)
	 * 
	 * @JoinColumn(name="operadorpe") private OperadorPersonal operadorurgencia;
	 */

	public UrgenciaEvento() {
		// TODO Auto-generated constructor stub
	}

	public UrgenciaEvento(Integer idurgenciaevento, Urgencia idurgencia, OperadorPersonal operador,
			UrgenciaAmbulancia urgenciaambulancia, TipoEvento tipoevento, String descripcionurgenciaevento,
			String lugarurgenciaevento, char estadourgenciaevento, Date fechaurgenciaevento) {
		super();
		this.idurgenciaevento = idurgenciaevento;
		this.idurgencia = idurgencia;
		this.operador = operador;
		this.urgenciaambulancia = urgenciaambulancia;
		this.tipoevento = tipoevento;
		this.descripcionurgenciaevento = descripcionurgenciaevento;
		this.lugarurgenciaevento = lugarurgenciaevento;
		this.estadourgenciaevento = estadourgenciaevento;
		this.fechaurgenciaevento = fechaurgenciaevento;
	}

	public Integer getIdurgenciaevento() {
		return idurgenciaevento;
	}

	public void setIdurgenciaevento(Integer idurgenciaevento) {
		this.idurgenciaevento = idurgenciaevento;
	}

	public Urgencia getIdurgencia() {
		return idurgencia;
	}

	public void setIdurgencia(Urgencia idurgencia) {
		this.idurgencia = idurgencia;
	}

	public OperadorPersonal getOperador() {
		return operador;
	}

	public void setOperador(OperadorPersonal operador) {
		this.operador = operador;
	}

	public UrgenciaAmbulancia getUrgenciaambulancia() {
		return urgenciaambulancia;
	}

	public void setUrgenciaambulancia(UrgenciaAmbulancia urgenciaambulancia) {
		this.urgenciaambulancia = urgenciaambulancia;
	}

	public TipoEvento getTipoevento() {
		return tipoevento;
	}

	public void setTipoevento(TipoEvento tipoevento) {
		this.tipoevento = tipoevento;
	}

	public String getDescripcionurgenciaevento() {
		return descripcionurgenciaevento;
	}

	public void setDescripcionurgenciaevento(String descripcionurgenciaevento) {
		this.descripcionurgenciaevento = descripcionurgenciaevento;
	}

	public String getLugarurgenciaevento() {
		return lugarurgenciaevento;
	}

	public void setLugarurgenciaevento(String lugarurgenciaevento) {
		this.lugarurgenciaevento = lugarurgenciaevento;
	}

	public char getEstadourgenciaevento() {
		return estadourgenciaevento;
	}

	public void setEstadourgenciaevento(char estadourgenciaevento) {
		this.estadourgenciaevento = estadourgenciaevento;
	}

	public Date getFechaurgenciaevento() {
		return fechaurgenciaevento;
	}

	public void setFechaurgenciaevento(Date fechaurgenciaevento) {
		this.fechaurgenciaevento = fechaurgenciaevento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lugarurgenciaevento == null) ? 0 : lugarurgenciaevento.hashCode());
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
		UrgenciaEvento other = (UrgenciaEvento) obj;
		if (lugarurgenciaevento == null) {
			if (other.lugarurgenciaevento != null)
				return false;
		} else if (!lugarurgenciaevento.equals(other.lugarurgenciaevento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UrgenciaEvento [idurgenciaevento=" + idurgenciaevento + ", idurgencia=" + idurgencia + ", operador="
				+ operador + ", urgenciaambulancia=" + urgenciaambulancia + ", tipoevento=" + tipoevento
				+ ", descripcionurgenciaevento=" + descripcionurgenciaevento + ", lugarurgenciaevento="
				+ lugarurgenciaevento + ", estadourgenciaevento=" + estadourgenciaevento + ", fechaurgenciaevento="
				+ fechaurgenciaevento + "]";
	}

}