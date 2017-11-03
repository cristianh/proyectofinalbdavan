package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
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
@Table(name = "t_tipodocumento")
@NamedQueries({ @NamedQuery(name = "Tipodocumento.listartipodocumento", query = "SELECT t FROM Tipodocumento t"),
		@NamedQuery(name = "Tipodocumento.buscarlistartipodocumento", query = "SELECT t FROM Tipodocumento t where t.nombredocumento=:id") })
public class Tipodocumento implements Serializable {

	@Id
	private String idtipodocumento;

	@Column(name = "nombre", length = 50)
	private String nombredocumento;

	@OneToMany(mappedBy = "tipodocumentopersona", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Persona> persona;

	public Tipodocumento() {
		// TODO Auto-generated constructor stub
	}

	public Tipodocumento(String idtipodocumento, String nombredocumento) {
		super();
		this.idtipodocumento = idtipodocumento;
		this.nombredocumento = nombredocumento;
	}

	public String getIdtipodocumento() {
		return idtipodocumento;
	}

	public void setIdtipodocumento(String idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
	}

	public List<Persona> getPersona() {
		return persona;
	}

	public void setPersona(List<Persona> persona) {
		this.persona = persona;
	}

	public String getNombredocumento() {
		return nombredocumento;
	}

	public void setNombredocumento(String nombredocumento) {
		this.nombredocumento = nombredocumento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idtipodocumento == null) ? 0 : idtipodocumento.hashCode());
		result = prime * result + ((nombredocumento == null) ? 0 : nombredocumento.hashCode());
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
		Tipodocumento other = (Tipodocumento) obj;
		if (idtipodocumento == null) {
			if (other.idtipodocumento != null)
				return false;
		} else if (!idtipodocumento.equals(other.idtipodocumento))
			return false;
		if (nombredocumento == null) {
			if (other.nombredocumento != null)
				return false;
		} else if (!nombredocumento.equals(other.nombredocumento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tipodocumento [idtipodocumento=" + idtipodocumento + ", nombredocumento=" + nombredocumento + "]";
	}

}
