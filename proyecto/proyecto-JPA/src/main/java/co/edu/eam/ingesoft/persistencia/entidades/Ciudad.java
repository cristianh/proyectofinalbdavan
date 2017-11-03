package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="t_ciudad")
@NamedQueries({ @NamedQuery(name = "Ciudad.listarciudades", query = "SELECT c FROM Ciudad c"),
	@NamedQuery(name = "Ciudad.buscarlistarciudades", query = "Select c from Ciudad c where c.departamento.id_departamento=:iddepartamento") })
public class Ciudad implements Serializable {

	@Id
	private String idciudad;
	
	@Column(name="nombre",length=20,nullable=false)
	private String nombreciudad;
	
	@Column(name="descripcion",length=20)
	private String descripcionciudad;
	
	@ManyToOne
	@JoinColumn(name = "departamento_id", nullable = false)
	private Departamento departamento;

	@OneToMany(mappedBy="ciudadpersona",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Persona> persona;
	
	public Ciudad() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param idciudad
	 * @param nombreciudad
	 * @param descripcionciudad
	 * @param departamento
	 */
	public Ciudad(String idciudad, String nombreciudad, String descripcionciudad, Departamento departamento) {
		super();
		this.idciudad = idciudad;
		this.nombreciudad = nombreciudad;
		this.descripcionciudad = descripcionciudad;
		this.departamento = departamento;
	}







	public String getIdciudad() {
		return idciudad;
	}

	public void setIdciudad(String idciudad) {
		this.idciudad = idciudad;
	}

	public String getNombreciudad() {
		return nombreciudad;
	}

	public void setNombreciudad(String nombreciudad) {
		this.nombreciudad = nombreciudad;
	}

	public String getDescripcionciudad() {
		return descripcionciudad;
	}

	public void setDescripcionciudad(String descripcionciudad) {
		this.descripcionciudad = descripcionciudad;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Persona> getPersona() {
		return persona;
	}

	public void setPersona(List<Persona> persona) {
		this.persona = persona;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idciudad == null) ? 0 : idciudad.hashCode());
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
		Ciudad other = (Ciudad) obj;
		if (idciudad == null) {
			if (other.idciudad != null)
				return false;
		} else if (!idciudad.equals(other.idciudad))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ciudad [idciudad=" + idciudad + ", nombreciudad=" + nombreciudad + ", descripcionciudad="
				+ descripcionciudad + "]";
	}	

}
