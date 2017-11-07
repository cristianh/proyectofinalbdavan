package co.edu.eam.ingesoft.persistencia.entidades;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="t_tipoUrgencia")
@NamedQueries({ @NamedQuery(name = "TipoUrgencia.listartipoUrgencia", query = "Select tu from TipoUrgencia tu") })
public class TipoUrgencia {

	@Id
	private Integer idTipoUrgencia;
	
	

	@ManyToOne
	@JoinColumn(name = "idurgencia", nullable = false)
	private Urgencia urgenciaevento;

	@Column(name="nombre")
	private String nombre;
	
	
	/**
	 * 
	 */
	public TipoUrgencia() {
		
	}

	

	/**
	 * @param idTipoUrgencia
	 * @param urgenciaevento
	 * @param nombre
	 */
	public TipoUrgencia(Integer idTipoUrgencia, Urgencia urgenciaevento, String nombre) {
		super();
		this.idTipoUrgencia = idTipoUrgencia;
		this.urgenciaevento = urgenciaevento;
		this.nombre = nombre;
	}

	


	public Urgencia getUrgenciaevento() {
		return urgenciaevento;
	}



	public void setUrgenciaevento(Urgencia urgenciaevento) {
		this.urgenciaevento = urgenciaevento;
	}



	public Integer getIdTipoUrgencia() {
		return idTipoUrgencia;
	}

	public void setIdTipoUrgencia(Integer idTipoUrgencia) {
		this.idTipoUrgencia = idTipoUrgencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoUrgencia == null) ? 0 : idTipoUrgencia.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((urgenciaevento == null) ? 0 : urgenciaevento.hashCode());
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
		TipoUrgencia other = (TipoUrgencia) obj;
		if (idTipoUrgencia == null) {
			if (other.idTipoUrgencia != null)
				return false;
		} else if (!idTipoUrgencia.equals(other.idTipoUrgencia))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (urgenciaevento == null) {
			if (other.urgenciaevento != null)
				return false;
		} else if (!urgenciaevento.equals(other.urgenciaevento))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "TipoUrgencia [idTipoUrgencia=" + idTipoUrgencia + ", urgenciaevento=" + urgenciaevento + ", nombre="
				+ nombre + "]";
	}


}
