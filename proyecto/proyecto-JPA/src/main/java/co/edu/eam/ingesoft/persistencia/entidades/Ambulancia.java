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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="t_ambulancia")
@NamedNativeQueries({ @NamedNativeQuery(name = "Ambulancia.listarambulancia", query = "SELECT * FROM t_ambulancia",resultClass=Ambulancia.class),
	@NamedNativeQuery(name = "Ambulancia.listarbuscarambulancia", query = "SELECT * FROM t_ambulancia  where placaambulancia=:estado",resultClass=Ambulancia.class) })
public class Ambulancia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String idambulancia;
	
	@Column(name="codigoambulancia", nullable=false,length=50)
	private String codigoambulancia;
	
	@Column(name="marcaambulancia",length=50)
	private String marcaambulancia;
	
	@Column(name="placaambulancia",length=50)
	private String placaambulancia;
	
	@ManyToOne
	@JoinColumn(name="Disponibilidad")
	private Disponibilidad disponibilidadAmbu;
	
	@ManyToOne
	@JoinColumn(name="TipoAmbulancia")
	private TipoAmbulancia tipoAmbulancia;
	
	@OneToMany(mappedBy="ambulanciaid")
	private List<AmbulanciaUrgencia> ambulanciaurgencia;

	public Ambulancia() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idambulancia
	 * @param codigoambulancia
	 * @param marcaambulancia
	 * @param placaambulancia
	 * @param disponibilidadAmbu
	 * @param tipoAmbulancia
	 * @param ambulanciaurgencia
	 */
	public Ambulancia(String idambulancia, String codigoambulancia, String marcaambulancia, String placaambulancia,
			Disponibilidad disponibilidadAmbu, TipoAmbulancia tipoAmbulancia,
			List<AmbulanciaUrgencia> ambulanciaurgencia) {
		super();
		this.idambulancia = idambulancia;
		this.codigoambulancia = codigoambulancia;
		this.marcaambulancia = marcaambulancia;
		this.placaambulancia = placaambulancia;
		this.disponibilidadAmbu = disponibilidadAmbu;
		this.tipoAmbulancia = tipoAmbulancia;
		this.ambulanciaurgencia = ambulanciaurgencia;
	}

	public String getIdambulancia() {
		return idambulancia;
	}

	public void setIdambulancia(String idambulancia) {
		this.idambulancia = idambulancia;
	}

	public String getCodigoambulancia() {
		return codigoambulancia;
	}

	public void setCodigoambulancia(String codigoambulancia) {
		this.codigoambulancia = codigoambulancia;
	}

	public String getMarcaambulancia() {
		return marcaambulancia;
	}

	public void setMarcaambulancia(String marcaambulancia) {
		this.marcaambulancia = marcaambulancia;
	}

	public String getPlacaambulancia() {
		return placaambulancia;
	}

	public void setPlacaambulancia(String placaambulancia) {
		this.placaambulancia = placaambulancia;
	}

	public Disponibilidad getDisponibilidadAmbu() {
		return disponibilidadAmbu;
	}

	public void setDisponibilidadAmbu(Disponibilidad disponibilidadAmbu) {
		this.disponibilidadAmbu = disponibilidadAmbu;
	}

	public TipoAmbulancia getTipoAmbulancia() {
		return tipoAmbulancia;
	}

	public void setTipoAmbulancia(TipoAmbulancia tipoAmbulancia) {
		this.tipoAmbulancia = tipoAmbulancia;
	}

	public List<AmbulanciaUrgencia> getAmbulanciaurgencia() {
		return ambulanciaurgencia;
	}

	public void setAmbulanciaurgencia(List<AmbulanciaUrgencia> ambulanciaurgencia) {
		this.ambulanciaurgencia = ambulanciaurgencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ambulanciaurgencia == null) ? 0 : ambulanciaurgencia.hashCode());
		result = prime * result + ((codigoambulancia == null) ? 0 : codigoambulancia.hashCode());
		result = prime * result + ((disponibilidadAmbu == null) ? 0 : disponibilidadAmbu.hashCode());
		result = prime * result + ((idambulancia == null) ? 0 : idambulancia.hashCode());
		result = prime * result + ((marcaambulancia == null) ? 0 : marcaambulancia.hashCode());
		result = prime * result + ((placaambulancia == null) ? 0 : placaambulancia.hashCode());
		result = prime * result + ((tipoAmbulancia == null) ? 0 : tipoAmbulancia.hashCode());
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
		Ambulancia other = (Ambulancia) obj;
		if (ambulanciaurgencia == null) {
			if (other.ambulanciaurgencia != null)
				return false;
		} else if (!ambulanciaurgencia.equals(other.ambulanciaurgencia))
			return false;
		if (codigoambulancia == null) {
			if (other.codigoambulancia != null)
				return false;
		} else if (!codigoambulancia.equals(other.codigoambulancia))
			return false;
		if (disponibilidadAmbu == null) {
			if (other.disponibilidadAmbu != null)
				return false;
		} else if (!disponibilidadAmbu.equals(other.disponibilidadAmbu))
			return false;
		if (idambulancia == null) {
			if (other.idambulancia != null)
				return false;
		} else if (!idambulancia.equals(other.idambulancia))
			return false;
		if (marcaambulancia == null) {
			if (other.marcaambulancia != null)
				return false;
		} else if (!marcaambulancia.equals(other.marcaambulancia))
			return false;
		if (placaambulancia == null) {
			if (other.placaambulancia != null)
				return false;
		} else if (!placaambulancia.equals(other.placaambulancia))
			return false;
		if (tipoAmbulancia == null) {
			if (other.tipoAmbulancia != null)
				return false;
		} else if (!tipoAmbulancia.equals(other.tipoAmbulancia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ambulancia [idambulancia=" + idambulancia + ", codigoambulancia=" + codigoambulancia
				+ ", marcaambulancia=" + marcaambulancia + ", placaambulancia=" + placaambulancia
				+ ", disponibilidadAmbu=" + disponibilidadAmbu + ", tipoAmbulancia=" + tipoAmbulancia
				+ ", ambulanciaurgencia=" + ambulanciaurgencia + "]";
	}
	
	
	
}