package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


//Faltan crear las relaciones con las otras entidades
@Entity
@Table(name="t_persona")
public class Persona implements Serializable {
	
	@Id
	private Integer id_persona;
	
	@Column(name="numerodocumento",length=20)
	private String numeroDocumento;
	
	@Column(name="nombre",length=50,nullable=false)
	private String nombre;
	
	@Column(name="apellido",length=50,nullable=false)
	private String apellido;
	
	@Column(name="telefono",length=10)
	private Integer telefono;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechanacimiento;
	
	@Column(name="email",length=50)
	private String email;
	
	@ManyToOne
	@JoinColumn(name="genero_persona")
	private Genero generopersona;
	
	@ManyToOne
	@JoinColumn(name="estadocivil_persona")
	private Estadocivil estadocivilpersona;
	
	@ManyToOne
	@JoinColumn(name="tipodocumento_persona")
	private Tipodocumento tipodocumentopersona;
	
	@ManyToOne
	@JoinColumn(name="eps_persona")
	private Eps epspersona;
	
	@ManyToOne
	@JoinColumn(name="ciudad_persona")
	private Ciudad ciudadpersona;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * 
	 * @return
	 */
	public Integer getId_persona() {
		return id_persona;
	}

	/**
	 * 
	 * @param id_persona
	 */
	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}

	/**
	 * 
	 * @return
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * 
	 * @param numeroDocumento
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	/**
	 * 
	 * @return
	 */
	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	/**
	 * 
	 * @param fechanacimiento
	 */
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_persona == null) ? 0 : id_persona.hashCode());
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
		Persona other = (Persona) obj;
		if (id_persona == null) {
			if (other.id_persona != null)
				return false;
		} else if (!id_persona.equals(other.id_persona))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Persona [id_persona=" + id_persona + ", numeroDocumento=" + numeroDocumento + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", telefono=" + telefono + ", fechanacimiento=" + fechanacimiento
				+ ", email=" + email + ", generopersona=" + generopersona + ", estadocivilpersona=" + estadocivilpersona
				+ ", tipodocumentopersona=" + tipodocumentopersona + ", epspersona=" + epspersona + ", ciudadpersona="
				+ ciudadpersona + "]";
	}
	
}
