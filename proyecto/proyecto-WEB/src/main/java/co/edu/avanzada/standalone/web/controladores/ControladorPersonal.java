package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.CargoPersonalEJB;
import co.edu.avanzada.negocio.beans.EstadoPersonalEJB;
import co.edu.avanzada.negocio.beans.PersonalEJB;
import co.edu.eam.ingesoft.persistencia.entidades.CargoPersonal;
import co.edu.eam.ingesoft.persistencia.entidades.EstadoPersonal;
import co.edu.eam.ingesoft.persistencia.entidades.Personal;

@ViewScoped
@Named("controladorPersonal")
public class ControladorPersonal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private PersonalEJB personalEJB;

	@EJB
	private CargoPersonalEJB cargoPersonalEJB;

	@EJB
	private EstadoPersonalEJB estadoPersonalEJB;

	private List<Personal> listarpersonal;
	private List<CargoPersonal> listarcargopersonal;
	private List<EstadoPersonal> listarestadopersonal;

	private Personal personal;
	private CargoPersonal cargopersonal;
	private EstadoPersonal estadopersonal;
	private String idPersonal, nombre, apellido, cedula, direccion, email;
	private Integer telefono;
	private Double salario;
	private Date fechaIngreso, fechaNacimiento;

	@PostConstruct
	public void initializar() {
		//listarpersonal = personalEJB.listarPersonal();
		listarcargopersonal = cargoPersonalEJB.listarCargoPersonal();
		listarestadopersonal = estadoPersonalEJB.listarEstadoPersonal();
	}

	public String getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(String idPersonal) {
		this.idPersonal = idPersonal;
	}

	public PersonalEJB getPersonalEJB() {
		return personalEJB;
	}

	public void setPersonalEJB(PersonalEJB personalEJB) {
		this.personalEJB = personalEJB;
	}

	public CargoPersonalEJB getCargoPersonalEJB() {
		return cargoPersonalEJB;
	}

	public void setCargoPersonalEJB(CargoPersonalEJB cargoPersonalEJB) {
		this.cargoPersonalEJB = cargoPersonalEJB;
	}

	public EstadoPersonalEJB getEstadoPersonalEJB() {
		return estadoPersonalEJB;
	}

	public void setEstadoPersonalEJB(EstadoPersonalEJB estadoPersonalEJB) {
		this.estadoPersonalEJB = estadoPersonalEJB;
	}

	public List<Personal> getListarpersonal() {
		return listarpersonal;
	}

	public void setListarpersonal(List<Personal> listarpersonal) {
		this.listarpersonal = listarpersonal;
	}

	public List<CargoPersonal> getListarcargopersonal() {
		return listarcargopersonal;
	}

	public void setListarcargopersonal(List<CargoPersonal> listarcargopersonal) {
		this.listarcargopersonal = listarcargopersonal;
	}

	public List<EstadoPersonal> getListarestadopersonal() {
		return listarestadopersonal;
	}

	public void setListarestadopersonal(List<EstadoPersonal> listarestadopersonal) {
		this.listarestadopersonal = listarestadopersonal;
	}

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public CargoPersonal getCargopersonal() {
		return cargopersonal;
	}

	public void setCargopersonal(CargoPersonal cargopersonal) {
		this.cargopersonal = cargopersonal;
	}

	public EstadoPersonal getEstadopersonal() {
		return estadopersonal;
	}

	public void setEstadopersonal(EstadoPersonal estadopersonal) {
		this.estadopersonal = estadopersonal;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void crear() {
		try {
			Personal personal = new Personal();
			personal.setApellido(apellido);
			personal.setCargoPersonal(cargopersonal);
			personal.setDireccion(direccion);
			personal.setEmail(email);
			personal.setEstadoPersonal(estadopersonal);
			personal.setFechaIngreso(fechaIngreso);
			personal.setFechanacimiento(fechaNacimiento);
			personal.setIdPersonal(idPersonal);
			personal.setNombre(nombre);
			personal.setNumeroDocumento(cedula);
			personal.setSalario(salario);
			personal.setTelefono(telefono);

			personalEJB.crearPersonal(personal);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto! La personal a sido registrada", ""));
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Error!" + ' ' + e.getMessage().toString() + ".", ""));
		}
	}

	public void buscarPersonal(String cedula, String nombre) {
		try {
			if (getNombre().isEmpty() && getCedula().isEmpty()) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Error!" + ' ' + "Debe ingresar un parametro de busqueda", ""));
			} else {
				listarpersonal = personalEJB.BuscarListaPersonal(nombre, cedula);

				idPersonal = listarpersonal.get(0).getIdPersonal();
				nombre = listarpersonal.get(0).getNombre();
				apellido = listarpersonal.get(0).getApellido();
				cedula = listarpersonal.get(0).getNumeroDocumento();
				fechaNacimiento = listarpersonal.get(0).getFechanacimiento();
				telefono = listarpersonal.get(0).getTelefono();
				email = listarpersonal.get(0).getEmail();
				cargopersonal = listarpersonal.get(0).getCargoPersonal();
				direccion = listarpersonal.get(0).getDireccion();
				fechaIngreso = listarpersonal.get(0).getFechaIngreso();
				salario = listarpersonal.get(0).getSalario();
				estadopersonal = listarpersonal.get(0).getEstadoPersonal();

				setApellido(apellido);
				setCargopersonal(cargopersonal);
				setDireccion(direccion);
				setEmail(email);
				setEstadopersonal(estadopersonal);
				setFechaIngreso(fechaIngreso);
				setFechaNacimiento(fechaNacimiento);
				setIdPersonal(idPersonal);
				setNombre(nombre);
				setCedula(cedula);
				setSalario(salario);
				setTelefono(telefono);
			}
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Error! no se encuentra la especialidad con los parametros de busqueda", ""));
		}
	}

}
