package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "t_tipoUrgencia")
@NamedQueries({ @NamedQuery(name = "TipoUrgencia.listartipoUrgencia", query = "Select t from TipoUrgencia t") })
public class TipoUrgencia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String idTipoUrgencia;

	@Column(name = "nombre")
	private String nombre;

	public TipoUrgencia() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idTipoUrgencia
	 * @param nombre
	 */
	public TipoUrgencia(String idTipoUrgencia, String nombre) {
		super();
		this.idTipoUrgencia = idTipoUrgencia;
		this.nombre = nombre;
	}

	public String getIdTipoUrgencia() {
		return idTipoUrgencia;
	}

	public void setIdTipoUrgencia(String idTipoUrgencia) {
		this.idTipoUrgencia = idTipoUrgencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoUrgencia == null) ? 0 : idTipoUrgencia.hashCode());
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
		return true;
	}

	@Override
	public String toString() {
		return "TipoUrgencia [idTipoUrgencia=" + idTipoUrgencia + ", nombre=" + nombre + "]";
	}

}
