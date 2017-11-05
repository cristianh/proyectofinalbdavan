package co.edu.eam.ingesoft.persistencia.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_tipoUrgencia")
@NamedQueries({ @NamedQuery(name = "TipoUrgencia.listartipoUrgencia", query = "Select tu from TipoUrgencia tu") })
public class TipoUrgencia {

	@Id
	private Integer idTipoUrgencia;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy="tipourgencia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Urgencia> urgencia;

	/**
	 * 
	 */
	public TipoUrgencia() {
		
	}

	/**
	 * @param idTipoUrgencia
	 * @param nombre
	 * @param urgencia
	 */
	public TipoUrgencia(Integer idTipoUrgencia, String nombre, List<Urgencia> urgencia) {
		super();
		this.idTipoUrgencia = idTipoUrgencia;
		this.nombre = nombre;
		this.urgencia = urgencia;
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

	public List<Urgencia> getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(List<Urgencia> urgencia) {
		this.urgencia = urgencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoUrgencia == null) ? 0 : idTipoUrgencia.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((urgencia == null) ? 0 : urgencia.hashCode());
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
		if (urgencia == null) {
			if (other.urgencia != null)
				return false;
		} else if (!urgencia.equals(other.urgencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoUrgencia [idTipoUrgencia=" + idTipoUrgencia + ", nombre=" + nombre + ", urgencia=" + urgencia + "]";
	}
	
	
	
}
