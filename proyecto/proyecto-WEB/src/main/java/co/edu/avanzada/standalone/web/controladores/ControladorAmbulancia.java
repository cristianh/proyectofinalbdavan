package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import java.util.List;

import co.edu.avanzada.negocio.beans.AmbulanciaEJB;
import co.edu.avanzada.negocio.beans.DisponibilidadEJB;
import co.edu.avanzada.negocio.beans.TipoAmbulanciaEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Ambulancia;
import co.edu.eam.ingesoft.persistencia.entidades.Disponibilidad;
import co.edu.eam.ingesoft.persistencia.entidades.TipoAmbulancia;

@ViewScoped
@Named("controladorAmbulancia")
public class ControladorAmbulancia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private AmbulanciaEJB ambulanciaEjb;

	@EJB
	private DisponibilidadEJB disponibilidadEjb;

	@EJB
	private TipoAmbulanciaEJB tipoAmbulanciaEjb;

	private Disponibilidad disponibilidadSeleccion;
	private TipoAmbulancia tipoAmbulanciaSeleccion;

	private List<Ambulancia> listarAmbulancia;
	private List<Disponibilidad> listarDisponibilidad;
	private List<TipoAmbulancia> listarTipoAmbulancia;

	@Size(min = 1, max = 5, message = "este campo acepta maximo 5 caracteres")
//	@Pattern(regexp = "[a-zA-Z]*", message = "Formato invalido, no se permiten letras")
	private String idAmbulancia;

	@Size(min = 1, max = 8, message = "este campo acepta maximo 8 caracteres")
	private String codigoAmbulancia;

	@Size(min = 1, max = 50, message = "la longitud debe se entre 1 y 50 caracteres")
//	@Pattern(regexp = "[a-zA-z]*", message = "Formato invalido, no se permiten letras")
	private String marcaAmbulancia;

	@Size(min = 1, max = 7, message = "la longitud debe se entre 1 y 7 caracteres")
	private String placa;

	private Disponibilidad disponibilidadAmbulancia;
	private TipoAmbulancia tipoAmbulancia;

	@PostConstruct
	public void initializar() {
		listarDisponibilidad = disponibilidadEjb.ListarDisponibilidad();
		listarTipoAmbulancia = tipoAmbulanciaEjb.ListarTipoAmbulancia();
		
	}

	public AmbulanciaEJB getAmbulanciaEjb() {
		return ambulanciaEjb;
	}

	public void setAmbulanciaEjb(AmbulanciaEJB ambulanciaEjb) {
		this.ambulanciaEjb = ambulanciaEjb;
	}

	public DisponibilidadEJB getDisponibilidadEjb() {
		return disponibilidadEjb;
	}

	public void setDisponibilidadEjb(DisponibilidadEJB disponibilidadEjb) {
		this.disponibilidadEjb = disponibilidadEjb;
	}

	public TipoAmbulanciaEJB getTipoAmbulanciaEjb() {
		return tipoAmbulanciaEjb;
	}

	public void setTipoAmbulanciaEjb(TipoAmbulanciaEJB tipoAmbulanciaEjb) {
		this.tipoAmbulanciaEjb = tipoAmbulanciaEjb;
	}

	public Disponibilidad getDisponibilidadSeleccion() {
		return disponibilidadSeleccion;
	}

	public void setDisponibilidadSeleccion(Disponibilidad disponibilidadSeleccion) {
		this.disponibilidadSeleccion = disponibilidadSeleccion;
	}

	public TipoAmbulancia getTipoAmbulanciaSeleccion() {
		return tipoAmbulanciaSeleccion;
	}

	public void setTipoAmbulanciaSeleccion(TipoAmbulancia tipoAmbulanciaSeleccion) {
		this.tipoAmbulanciaSeleccion = tipoAmbulanciaSeleccion;
	}

	public List<Ambulancia> getListarAmbulancia() {
		return listarAmbulancia;
	}

	public void setListarAmbulancia(List<Ambulancia> listarAmbulancia) {
		this.listarAmbulancia = listarAmbulancia;
	}

	public List<Disponibilidad> getListarDisponibilidad() {
		return listarDisponibilidad;
	}

	public void setListarDisponibilidad(List<Disponibilidad> listarDisponibilidad) {
		this.listarDisponibilidad = listarDisponibilidad;
	}

	public List<TipoAmbulancia> getListarTipoAmbulancia() {
		return listarTipoAmbulancia;
	}

	public void setListarTipoAmbulancia(List<TipoAmbulancia> listarTipoAmbulancia) {
		this.listarTipoAmbulancia = listarTipoAmbulancia;
	}

	public String getIdAmbulancia() {
		return idAmbulancia;
	}

	public void setIdAmbulancia(String idAmbulancia) {
		this.idAmbulancia = idAmbulancia;
	}

	public String getCodigoAmbulancia() {
		return codigoAmbulancia;
	}

	public void setCodigoAmbulancia(String codigoAmbulancia) {
		this.codigoAmbulancia = codigoAmbulancia;
	}

	public String getMarcaAmbulancia() {
		return marcaAmbulancia;
	}

	public void setMarcaAmbulancia(String marcaAmbulancia) {
		this.marcaAmbulancia = marcaAmbulancia;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Disponibilidad getDisponibilidadAmbulancia() {
		return disponibilidadAmbulancia;
	}

	public void setDisponibilidadAmbulancia(Disponibilidad disponibilidadAmbulancia) {
		this.disponibilidadAmbulancia = disponibilidadAmbulancia;
	}

	public TipoAmbulancia getTipoAmbulancia() {
		return tipoAmbulancia;
	}

	public void setTipoAmbulancia(TipoAmbulancia tipoAmbulancia) {
		this.tipoAmbulancia = tipoAmbulancia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void crearAmbulancia() {
		try {
			Ambulancia ambulancia = new Ambulancia();
			
			ambulancia.setIdambulancia(idAmbulancia);
			ambulancia.setCodigoambulancia(codigoAmbulancia);
			ambulancia.setMarcaambulancia(marcaAmbulancia);
			ambulancia.setPlacaambulancia(placa);
			ambulancia.setDisponibilidadAmbu(disponibilidadAmbulancia);
			ambulancia.setTipoAmbulancia(tipoAmbulancia);
			

			ambulanciaEjb.crearAmbulancia(ambulancia);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "La Ambulancia a sido registrada"));
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se ha podido crear", e.getMessage().toString() + "."));
		}
	}


	

}
