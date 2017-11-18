package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
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

	private Disponibilidad dispoSeleccion;
	private TipoAmbulancia tiposeleccion;

	private List<Ambulancia> listarAmbulancia;
	private List<Disponibilidad> listarDisponibilidad;
	private List<TipoAmbulancia> listarTipoAmbulancia;

	@Size(min = 1, max = 5, message = "este campo acepta maximo 5 caracteres")
	// @Pattern(regexp = "[a-zA-Z]*", message = "Formato invalido, no se
	// permiten letras")
	private String idAmbulancia;

	@Size(min = 1, max = 8, message = "este campo acepta maximo 8 caracteres")
	private String codigoAmbulancia;

	@Size(min = 1, max = 50, message = "la longitud debe se entre 1 y 50 caracteres")
	// @Pattern(regexp = "[a-zA-z]*", message = "Formato invalido, no se
	// permiten letras")
	private String marcaAmbulancia;

	@Size(min = 1, max = 7, message = "la longitud debe se entre 1 y 7 caracteres")
	private String placa;

	private Disponibilidad disponibilidadAmbulancia;
	private TipoAmbulancia tipoAmbulancia;
	private Ambulancia ambulancia;

	@PostConstruct
	public void initializar() {
		listarDisponibilidad = disponibilidadEjb.ListarDisponibilidad();
		System.out.println(listarDisponibilidad);
		listarTipoAmbulancia = tipoAmbulanciaEjb.ListarTipoAmbulancia();
		listarAmbulancia = ambulanciaEjb.listarAmbulancia();
		

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

	

	public Disponibilidad getDispoSeleccion() {
		return dispoSeleccion;
	}

	public void setDispoSeleccion(Disponibilidad dispoSeleccion) {
		this.dispoSeleccion = dispoSeleccion;
	}

	public TipoAmbulancia getTiposeleccion() {
		return tiposeleccion;
	}

	public void setTiposeleccion(TipoAmbulancia tiposeleccion) {
		this.tiposeleccion = tiposeleccion;
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

	
	
	public Ambulancia getAmbulancia() {
		return ambulancia;
	}

	public void setAmbulancia(Ambulancia ambulancia) {
		this.ambulancia = ambulancia;
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
			limpiar();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "La Ambulancia a sido registrada"));
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"No se ha podido crear", e.getMessage().toString() + "."));
		}
	}

	public void buscarPorPlaca() {
		System.out.println(getPlaca());
		try {
			if (getPlaca().isEmpty()) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Error!" + ' ' + "Debe ingresar un parametro de busqueda", ""));

			} else {
				listarAmbulancia = ambulanciaEjb.BuscarListaAmbulancia(placa);

				idAmbulancia = listarAmbulancia.get(0).getIdambulancia();
				codigoAmbulancia = listarAmbulancia.get(0).getCodigoambulancia();
				placa = listarAmbulancia.get(0).getPlacaambulancia();
				marcaAmbulancia = listarAmbulancia.get(0).getMarcaambulancia();
				disponibilidadAmbulancia = listarAmbulancia.get(0).getDisponibilidadAmbu();
				tipoAmbulancia = listarAmbulancia.get(0).getTipoAmbulancia();

				setIdAmbulancia(idAmbulancia);
				setCodigoAmbulancia(codigoAmbulancia);
				setPlaca(placa);
				setMarcaAmbulancia(marcaAmbulancia);
				setDisponibilidadAmbulancia(disponibilidadAmbulancia);
				System.out.println(disponibilidadAmbulancia);
				setTipoAmbulancia(tipoAmbulancia);

			}
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Error! no se encuentra la especialidad con los parametros de busqueda", ""));
		}
	}

	public void buscar() {

		try {
			if (getIdAmbulancia().isEmpty()) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Error!" + ' ' + "Debe ingresar un parametro de busqueda", ""));

			} else {
				listarAmbulancia = ambulanciaEjb.BuscarListaAmbulancia(idAmbulancia);

				idAmbulancia = listarAmbulancia.get(0).getIdambulancia();
				codigoAmbulancia = listarAmbulancia.get(0).getCodigoambulancia();
				placa = listarAmbulancia.get(0).getPlacaambulancia();
				marcaAmbulancia = listarAmbulancia.get(0).getMarcaambulancia();
				disponibilidadAmbulancia = listarAmbulancia.get(0).getDisponibilidadAmbu();
				tipoAmbulancia = listarAmbulancia.get(0).getTipoAmbulancia();

				setIdAmbulancia(idAmbulancia);
				setCodigoAmbulancia(codigoAmbulancia);
				setPlaca(placa);
				setMarcaAmbulancia(marcaAmbulancia);
				setDisponibilidadAmbulancia(disponibilidadAmbulancia);
				System.out.println(disponibilidadAmbulancia);
				setTipoAmbulancia(tipoAmbulancia);

			}
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Error! no se encuentra la especialidad con los parametros de busqueda", ""));
		}
	}

	public void eliminar(Ambulancia ambulania) {
		ambulanciaEjb.eliminarAmbulancia(ambulancia.getIdambulancia());
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "info", "la ambulancia ha sido eliminada"));
		listarAmbulancia = ambulanciaEjb.listarAmbulancia();
		setListarAmbulancia(listarAmbulancia);
		return;
	}

	public void editar() {
		try {
			Ambulancia ambulancia = ambulanciaEjb.buscarAmbulancia(idAmbulancia);
			ambulancia.setCodigoambulancia(codigoAmbulancia);
			ambulancia.setMarcaambulancia(marcaAmbulancia);
			ambulancia.setPlacaambulancia(placa);
			ambulancia.setDisponibilidadAmbu(disponibilidadAmbulancia);
			ambulancia.setTipoAmbulancia(tipoAmbulancia);

			ambulanciaEjb.editarAmbulancia(ambulancia);
			limpiar();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto! La ambulancia a sido editado", ""));
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Error!" + ' ' + e.getMessage().toString() + ".", ""));
		}
	}

	public void limpiar() {
		listarAmbulancia = null;
		idAmbulancia = null;
		codigoAmbulancia = null;
		marcaAmbulancia = null;
		placa = null;
		disponibilidadAmbulancia = null;
		tipoAmbulancia = null;
	}

}
