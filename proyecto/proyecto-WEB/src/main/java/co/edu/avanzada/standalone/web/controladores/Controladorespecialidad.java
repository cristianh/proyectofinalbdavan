package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.EspecialidadEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;

@ViewScoped
@Named("conEspecialidad")
public class Controladorespecialidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private EspecialidadEJB especialidadEJB;

	private Especialidad especialidad;

	// List
	private List<Especialidad> listarespecialidad;

	private String codigoespecialidad;

	private String codigoespecialidadbuscar;

	private String nombreespecialidad;

	private String estadoespecialidad;

	@PostConstruct
	public void initializar() {
		listarespecialidad = especialidadEJB.ListarEspecialidad();
		estadoespecialidad="Activa";
	}

	public EspecialidadEJB getEspecialidadEJB() {
		return especialidadEJB;
	}

	public void setEspecialidadEJB(EspecialidadEJB especialidadEJB) {
		this.especialidadEJB = especialidadEJB;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public String getCodigoespecialidad() {
		return codigoespecialidad;
	}

	public void setCodigoespecialidad(String codigoespecialidad) {
		this.codigoespecialidad = codigoespecialidad;
	}

	public String getNombreespecialidad() {
		return nombreespecialidad;
	}

	public void setNombreespecialidad(String nombreespecialidad) {
		this.nombreespecialidad = nombreespecialidad;
	}

	public String getEstadoespecialidad() {
		return estadoespecialidad;
	}

	public void setEstadoespecialidad(String estadoespecialidad) {
		this.estadoespecialidad = estadoespecialidad;
	}

	public String getCodigoespecialidadbuscar() {
		return codigoespecialidadbuscar;
	}

	public void setCodigoespecialidadbuscar(String codigoespecialidadbuscar) {
		this.codigoespecialidadbuscar = codigoespecialidadbuscar;
	}

	public List<Especialidad> getListarespecialidad() {
		return listarespecialidad;
	}

	public void setListarespecialidad(List<Especialidad> listarespecialidad) {
		this.listarespecialidad = listarespecialidad;
	}

	public void crear() {
		try {
			Especialidad especialidad = new Especialidad();
			especialidad.setCodigo(codigoespecialidad);
			especialidad.setNombre(nombreespecialidad);
			especialidad.setEstadoespecialidad(estadoespecialidad);
			especialidadEJB.crearEspecialidad(especialidad);
			limpiar();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto! La especialidad a sido registrada", ""));
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Error!" + ' ' + e.getMessage().toString() + ".", ""));
		}
	}

	public void buscar() {
		System.out.println(getCodigoespecialidadbuscar());
		try {
			if(getCodigoespecialidadbuscar().isEmpty()){
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Error!" + ' ' + "Debe ingresar un parametro de busqueda", ""));
				
			}else
			{
				listarespecialidad = especialidadEJB.BuscarListaEspecialidad(codigoespecialidadbuscar);
				System.out.println("Especialidad:" + listarespecialidad.get(0).getCodigo());
				codigoespecialidad = listarespecialidad.get(0).getCodigo();
				nombreespecialidad = listarespecialidad.get(0).getNombre();
				estadoespecialidad = listarespecialidad.get(0).getEstadoespecialidad();
				setCodigoespecialidad(codigoespecialidad);
				setNombreespecialidad(nombreespecialidad);
				setEstadoespecialidad(estadoespecialidad);
			}
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Error! no se encuentra la especialidad con los parametros de busqueda", ""));
		}
		
		
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void editar() {
		try {
			Especialidad especialidad = especialidadEJB.buscarEspecialidad(codigoespecialidad);
			especialidad.setEstadoespecialidad(estadoespecialidad);
			especialidad.setNombre(nombreespecialidad);
			especialidadEJB.editarEspecialidad(especialidad);
			limpiar();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto! La especialidad a sido editado", ""));
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Error!" + ' ' + e.getMessage().toString() + ".", ""));
		}
	}

	public void eliminar(Especialidad especialidad) {
		especialidadEJB.eliminar(especialidad.getCodigo());
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "La especialidad a sido eliminada."));
		listarespecialidad = especialidadEJB.ListarEspecialidad();
		setListarespecialidad(listarespecialidad);
		return;
	}
	
	public void limpiar(){
		listarespecialidad=null;
		codigoespecialidad=null;
		codigoespecialidadbuscar=null;
		nombreespecialidad=null;
	}

}
