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
import javax.validation.constraints.Pattern;

import co.edu.avanzada.negocio.beans.OperadorPersonalEJB;
import co.edu.avanzada.negocio.beans.ReporteUrgenciaEJB;
import co.edu.avanzada.negocio.beans.TipoUrgenciaEJB;
import co.edu.eam.ingesoft.persistencia.entidades.*;

@ViewScoped
@Named("conreporteciudadano")
public class Controladorreporteurgencia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private OperadorPersonalEJB operadorpersonaleEJB;

	@EJB
	private TipoUrgenciaEJB tipourgenciaEJB;

	@EJB
	private ReporteUrgenciaEJB reporteUrgenciaEJB;

	// Entidades

	private OperadorPersonal operadorpersonal;

	private ReporteUrgencia ciudadano;

	private Urgencia urgencia;

	// Variables ciudadano.

	private String idreporeteurgencia;

	@Pattern(regexp = "[a-zA-z ]*", message = "Formato no valido solo se permiten letras")
	private String nombreciudadano;

	@Pattern(regexp = "[a-zA-z ]*", message = "Formato no valido solo se permiten letras")
	private String apellidoCiudadano;

	@Pattern(regexp = "[0-9]*", message = "Formato no valido solo se permiten numeros")
	private String cedula;

	@Pattern(regexp = "[0-9]*", message = "Formato no valido solo se permiten numeros")
	private String telefono;

	@Pattern(regexp = "[0-9a-zA-z ]*", message = "Formato no valido solo se permiten letras")
	private String direccion;

	private Integer numeroafectados;
	// fin variables ciudadano.

	//
	private TipoUrgencia tipourgenciaseleccionada;
	
	private ReporteUrgencia reuseleccionado;

	

	// List
	private List<TipoUrgencia> listartipourgencia;
	private List<ReporteUrgencia> listarreporteurgencias;

	// reporte

	@PostConstruct
	public void initializar() {
		listartipourgencia = tipourgenciaEJB.listarTipoUrgencia();
		idreporeteurgencia = String.valueOf((int) (Math.round(Math.random() * 60)) + 1);
		listarreporteurgencias = reporteUrgenciaEJB.listarreporteUrgenciasOrdenado();
	}

	public OperadorPersonalEJB getOperadorpersonaleEJB() {
		return operadorpersonaleEJB;
	}

	public void setOperadorpersonaleEJB(OperadorPersonalEJB operadorpersonaleEJB) {
		this.operadorpersonaleEJB = operadorpersonaleEJB;
	}

	public TipoUrgenciaEJB getTipourgenciaEJB() {
		return tipourgenciaEJB;
	}

	public void setTipourgenciaEJB(TipoUrgenciaEJB tipourgenciaEJB) {
		this.tipourgenciaEJB = tipourgenciaEJB;
	}

	public OperadorPersonal getOperadorpersonal() {
		return operadorpersonal;
	}

	public void setOperadorpersonal(OperadorPersonal operadorpersonal) {
		this.operadorpersonal = operadorpersonal;
	}

	public ReporteUrgencia getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(ReporteUrgencia ciudadano) {
		this.ciudadano = ciudadano;
	}

	public Urgencia getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(Urgencia urgencia) {
		this.urgencia = urgencia;
	}

	public TipoUrgencia getTipourgencia() {
		return tipourgenciaseleccionada;
	}

	public void setTipourgencia(TipoUrgencia tipourgencia) {
		this.tipourgenciaseleccionada = tipourgencia;
	}

	public String getIdreporeteurgencia() {
		return idreporeteurgencia;
	}

	public void setIdreporeteurgencia(String idreporeteurgencia) {
		this.idreporeteurgencia = idreporeteurgencia;
	}

	public String getNombreciudadano() {
		return nombreciudadano;
	}

	public void setNombreciudadano(String nombreciudadano) {
		this.nombreciudadano = nombreciudadano;
	}

	public String getApellidoCiudadano() {
		return apellidoCiudadano;
	}

	public void setApellidoCiudadano(String apellidoCiudadano) {
		this.apellidoCiudadano = apellidoCiudadano;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumeroafectados() {
		return numeroafectados;
	}

	public void setNumeroafectados(Integer numeroafectados) {
		this.numeroafectados = numeroafectados;
	}

	public TipoUrgencia getTipourgenciaseleccionada() {
		return tipourgenciaseleccionada;
	}

	public void setTipourgenciaseleccionada(TipoUrgencia tipourgenciaseleccionada) {
		this.tipourgenciaseleccionada = tipourgenciaseleccionada;
	}

	public List<TipoUrgencia> getListartipourgencia() {
		return listartipourgencia;
	}

	public void setListartipourgencia(List<TipoUrgencia> listartipourgencia) {
		this.listartipourgencia = listartipourgencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ReporteUrgenciaEJB getReporteUrgenciaEJB() {
		return reporteUrgenciaEJB;
	}

	public void setReporteUrgenciaEJB(ReporteUrgenciaEJB reporteUrgenciaEJB) {
		this.reporteUrgenciaEJB = reporteUrgenciaEJB;
	}

	public List<ReporteUrgencia> getListarreporteurgencias() {
		return listarreporteurgencias;
	}

	public void setListarreporteurgencias(List<ReporteUrgencia> listarreporteurgencias) {
		this.listarreporteurgencias = listarreporteurgencias;
	}
	
	

	public ReporteUrgencia getReuseleccionado() {
		return reuseleccionado;
	}

	public void setReuseleccionado(ReporteUrgencia reuseleccionado) {
		this.reuseleccionado = reuseleccionado;
	}

	public void registrar() {

		try {
			ReporteUrgencia reporteUrgencia = new ReporteUrgencia(nombreciudadano, apellidoCiudadano, cedula, telefono,
					direccion, numeroafectados, getTipourgencia());
			reporteUrgencia.setFechayhora(new Date());
			reporteUrgencia.setEstado("Notificada");
			reporteUrgenciaEJB.crearReporteUrgencia(reporteUrgencia);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Informacion guardada!", ""));
			limpiar();
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se a podido guardar el reporte!", ""));
		}

	}

	public void TipoUrgenciaseleccionado() {
		System.out.println(tipourgenciaseleccionada.getIdTipoUrgencia());
	}

	public void limpiar(){
		 idreporeteurgencia=null;
		 nombreciudadano=null;
		 apellidoCiudadano=null;
		 cedula=null;
		 telefono=null;
		 direccion=null;
		 numeroafectados=null;
	}
	
	public void atender(){
		
	}

}
