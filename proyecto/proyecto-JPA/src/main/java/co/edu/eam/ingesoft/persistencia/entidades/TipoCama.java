package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_tipocama")

@NamedNativeQueries({ @NamedNativeQuery(name = "Ambulancia.listartipoCama",
query = "SELECT * FROM t_tipocama",resultClass=TipoCama.class),
	@NamedNativeQuery(name = "Ambulancia.listarbuscartipoCama",
	query = "SELECT * FROM t_tipocama  where idtipocama=:estado",resultClass=TipoCama.class) })


public class TipoCama implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String idtipocama;
	
	@OneToMany(mappedBy="tipocama")
	private List<Cama> cama;

	@Column(name = "nombretipocama", nullable = false)
	private String nombre;

	public TipoCama() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idtipocama
	 * @param nombre
	 */
	public TipoCama(String idtipocama, String nombre) {
		super();
		this.idtipocama = idtipocama;
		this.nombre = nombre;
	}

	public String getIdtipocama() {
		return idtipocama;
	}

	public void setIdtipocama(String idtipocama) {
		this.idtipocama = idtipocama;
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
		result = prime * result + ((idtipocama == null) ? 0 : idtipocama.hashCode());
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
		TipoCama other = (TipoCama) obj;
		if (idtipocama == null) {
			if (other.idtipocama != null)
				return false;
		} else if (!idtipocama.equals(other.idtipocama))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoCama [idtipocama=" + idtipocama + ", nombre=" + nombre + "]";
	}

}
