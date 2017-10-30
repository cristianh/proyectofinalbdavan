package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "t_urgenciaevento")
public class UrgenciaEvento implements Serializable {

	@Id
	private Integer idurgenciaevento;

	@ManyToOne
	@JoinColumn(name = "tipoeventourgencia",nullable=false)
	private TipoEvento tipoevento;

	@Column(name = "descripciourgenciaevento", length = 100)
	private String descripcionurgenciaevento;

	@Column(name = "lugarurgenciaevento", length = 100)
	private String lugarurgenciaevento;

	@Column(name = "estadourgenciaevento", length = 1)
	private char estadourgenciaevento;

	@ManyToOne
	@JoinColumn(name = "idurgencia",nullable=false)
	private Urgencia idurgencia;

	@ManyToOne
	@JoinColumn(name = "idoperador")
	private Operador operadorurgencia;

	public UrgenciaEvento() {
		// TODO Auto-generated constructor stub
	}

	public UrgenciaEvento(Integer idurgenciaevento, TipoEvento tipoevento, String descripcionurgenciaevento,
			String lugarurgenciaevento, char estadourgenciaevento, Urgencia idurgencia, Operador operadorurgencia) {
		super();
		this.idurgenciaevento = idurgenciaevento;
		this.tipoevento = tipoevento;
		this.descripcionurgenciaevento = descripcionurgenciaevento;
		this.lugarurgenciaevento = lugarurgenciaevento;
		this.estadourgenciaevento = estadourgenciaevento;
		this.idurgencia = idurgencia;
		this.operadorurgencia = operadorurgencia;
	}

	public Integer getIdurgenciaevento() {
		return idurgenciaevento;
	}

	public void setIdurgenciaevento(Integer idurgenciaevento) {
		this.idurgenciaevento = idurgenciaevento;
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

	public Urgencia getIdurgencia() {
		return idurgencia;
	}

	public void setIdurgencia(Urgencia idurgencia) {
		this.idurgencia = idurgencia;
	}

	public Operador getOperadorurgencia() {
		return operadorurgencia;
	}

	public void setOperadorurgencia(Operador operadorurgencia) {
		this.operadorurgencia = operadorurgencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idurgenciaevento == null) ? 0 : idurgenciaevento.hashCode());
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
		if (idurgenciaevento == null) {
			if (other.idurgenciaevento != null)
				return false;
		} else if (!idurgenciaevento.equals(other.idurgenciaevento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UrgenciaEvento [idurgenciaevento=" + idurgenciaevento + ", tipoevento=" + tipoevento
				+ ", descripcionurgenciaevento=" + descripcionurgenciaevento + ", lugarurgenciaevento="
				+ lugarurgenciaevento + ", estadourgenciaevento=" + estadourgenciaevento + ", idurgencia=" + idurgencia
				+ ", operadorurgencia=" + operadorurgencia + "]";
	}
	
	
	
	

	
	
}