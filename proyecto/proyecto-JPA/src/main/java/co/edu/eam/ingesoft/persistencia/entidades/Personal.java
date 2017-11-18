package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
<<<<<<< HEAD
@Table(name="t_personal")
@NamedQueries({ @NamedQuery(name = "Personal.listarpersonal", query = "SELECT per FROM Personal per"),
	@NamedQuery(name = "Personal.listarbuscarpersonal", query = "SELECT pa FROM Personal pa where pa.nombre=:nombre and pa.numeroDocumento=:cedula") })
=======
@Table(name="T_Personal")
@NamedNativeQueries({ @NamedNativeQuery(name = "Personal.listarpersonal",
query = "SELECT * FROM T_Personal",resultClass=Personal.class),
	@NamedNativeQuery(name = "Personal.listarbuscarpersonal",
	query = "SELECT * FROM T_Personal  where numeroDocumento=:estado",resultClass=Personal.class) })
>>>>>>> 4adad58439582b7ca3d687f631e2ae0e782e8f2e

public class Personal implements Serializable {

	@Id
	@Column(name="idPersonal", unique=true)
	private String idPersonal;

	@Column(name = "numeroDocumento", length = 20, unique=true)
	private String numeroDocumento;

	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;

	@Column(name = "apellido", length = 50, nullable = false)
	private String apellido;

	@Column(name = "telefono", length = 10)
	private Integer telefono;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechanacimiento;

	@Column(name = "email", length = 50)
	private String email;

	@ManyToOne
	@JoinColumn(name="CargoPersonal")
	private CargoPersonal cargoPersonal;
	
	@ManyToOne
	@JoinColumn(name="EstadoPersonal")
	private EstadoPersonal estadoPersonal;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="salario")
	private Double salario;
	
	@Column(name="fechaIngreso")
	private Date fechaIngreso;

	/**
	 * 
	 */
	public Personal() {
		super();
	}


	/**
	 * @param idPersonal
	 * @param numeroDocumento
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 * @param fechanacimiento
	 * @param email
	 * @param cargoPersonal
	 * @param estadoPersonal
	 * @param direccion
	 * @param salario
	 * @param fechaIngreso
	 */
	public Personal(String idPersonal, String numeroDocumento, String nombre, String apellido, Integer telefono,
			Date fechanacimiento, String email, CargoPersonal cargoPersonal, EstadoPersonal estadoPersonal,
			String direccion, Double salario, Date fechaIngreso) {
		super();
		this.idPersonal = idPersonal;
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.fechanacimiento = fechanacimiento;
		this.email = email;
		this.cargoPersonal = cargoPersonal;
		this.estadoPersonal = estadoPersonal;
		this.direccion = direccion;
		this.salario = salario;
		this.fechaIngreso = fechaIngreso;
	}

	public String getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(String idPersonal) {
		this.idPersonal = idPersonal;
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

	public CargoPersonal getCargoPersonal() {
		return cargoPersonal;
	}

	public void setCargoPersonal(CargoPersonal cargoPersonal) {
		this.cargoPersonal = cargoPersonal;
	}

	public EstadoPersonal getEstadoPersonal() {
		return estadoPersonal;
	}

	public void setEstadoPersonal(EstadoPersonal estadoPersonal) {
		this.estadoPersonal = estadoPersonal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	

	public Date getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((cargoPersonal == null) ? 0 : cargoPersonal.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estadoPersonal == null) ? 0 : estadoPersonal.hashCode());
		result = prime * result + ((fechaIngreso == null) ? 0 : fechaIngreso.hashCode());
		result = prime * result + ((fechanacimiento == null) ? 0 : fechanacimiento.hashCode());
		result = prime * result + ((idPersonal == null) ? 0 : idPersonal.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numeroDocumento == null) ? 0 : numeroDocumento.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Personal other = (Personal) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cargoPersonal == null) {
			if (other.cargoPersonal != null)
				return false;
		} else if (!cargoPersonal.equals(other.cargoPersonal))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (estadoPersonal == null) {
			if (other.estadoPersonal != null)
				return false;
		} else if (!estadoPersonal.equals(other.estadoPersonal))
			return false;
		if (fechaIngreso == null) {
			if (other.fechaIngreso != null)
				return false;
		} else if (!fechaIngreso.equals(other.fechaIngreso))
			return false;
		if (fechanacimiento == null) {
			if (other.fechanacimiento != null)
				return false;
		} else if (!fechanacimiento.equals(other.fechanacimiento))
			return false;
		if (idPersonal == null) {
			if (other.idPersonal != null)
				return false;
		} else if (!idPersonal.equals(other.idPersonal))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroDocumento == null) {
			if (other.numeroDocumento != null)
				return false;
		} else if (!numeroDocumento.equals(other.numeroDocumento))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Personal [idPersonal=" + idPersonal + ", numeroDocumento=" + numeroDocumento + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", telefono=" + telefono + ", fechanacimiento=" + fechanacimiento
				+ ", email=" + email + ", cargoPersonal=" + cargoPersonal + ", estadoPersonal=" + estadoPersonal
				+ ", direccion=" + direccion + ", salario=" + salario + ", fechaIngreso=" + fechaIngreso + "]";
	}

}