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
	@JoinColumn(name="genero_persona",nullable=false)
	private Genero generopersona;
	
	@ManyToOne
	@JoinColumn(name="estadocivil_persona",nullable=false)
	private Estadocivil estadocivilpersona;
	
	@ManyToOne
	@JoinColumn(name="tipodocumento_persona",nullable=false)
	private Tipodocumento tipodocumentopersona;
	
	@ManyToOne
	@JoinColumn(name="eps_persona",nullable=false)
	private Eps epspersona;
	
	@ManyToOne
	@JoinColumn(name="ciudad_persona",nullable=false)
	private Ciudad ciudadpersona;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	

	

	public Persona(Integer id_persona, String numeroDocumento, String nombre, String apellido, Integer telefono,
			Date fechanacimiento, String email, Genero generopersona, Estadocivil estadocivilpersona,
			Tipodocumento tipodocumentopersona, Eps epspersona, Ciudad ciudadpersona) {
		super();
		this.id_persona = id_persona;
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.fechanacimiento = fechanacimiento;
		this.email = email;
		this.generopersona = generopersona;
		this.estadocivilpersona = estadocivilpersona;
		this.tipodocumentopersona = tipodocumentopersona;
		this.epspersona = epspersona;
		this.ciudadpersona = ciudadpersona;
	}





	

	public Integer getId_persona() {
		return id_persona;
	}





	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}





	public String getNumeroDocumento() {
		return numeroDocumento;
	}





	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getApellido() {
		return apellido;
	}





	public void setApellido(String apellido) {
		this.apellido = apellido;
	}





	public Integer getTelefono() {
		return telefono;
	}





	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}





	public Date getFechanacimiento() {
		return fechanacimiento;
	}





	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Genero getGeneropersona() {
		return generopersona;
	}





	public void setGeneropersona(Genero generopersona) {
		this.generopersona = generopersona;
	}





	public Estadocivil getEstadocivilpersona() {
		return estadocivilpersona;
	}





	public void setEstadocivilpersona(Estadocivil estadocivilpersona) {
		this.estadocivilpersona = estadocivilpersona;
	}





	public Tipodocumento getTipodocumentopersona() {
		return tipodocumentopersona;
	}





	public void setTipodocumentopersona(Tipodocumento tipodocumentopersona) {
		this.tipodocumentopersona = tipodocumentopersona;
	}





	public Eps getEpspersona() {
		return epspersona;
	}





	public void setEpspersona(Eps epspersona) {
		this.epspersona = epspersona;
	}




	public Ciudad getCiudadpersona() {
		return ciudadpersona;
	}





	public void setCiudadpersona(Ciudad ciudadpersona) {
		this.ciudadpersona = ciudadpersona;
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
