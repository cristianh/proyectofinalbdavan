package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;

import co.edu.avanzada.negocio.beans.AmbulanciaEJB;
import co.edu.avanzada.negocio.beans.EnviarAtencionUrgenciaEJB;
import co.edu.avanzada.negocio.beans.PersonalEJB;
import co.edu.avanzada.negocio.beans.ReporteUrgenciaEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Ambulancia;
import co.edu.eam.ingesoft.persistencia.entidades.EnviarAtencionUrgencia;
import co.edu.eam.ingesoft.persistencia.entidades.Personal;
import co.edu.eam.ingesoft.persistencia.entidades.ReporteUrgencia;

@ViewScoped
@Named("controladorEnviarAtencion")
public class ControladorEnviarAtencion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private EnviarAtencionUrgenciaEJB enviarAtencionEJB;

	@EJB
	private AmbulanciaEJB ambulanciaEJB;

	@EJB
	private ReporteUrgenciaEJB reporteUrgenciaEJB;

	@EJB
	private PersonalEJB personalEJB;

	private Ambulancia ambulanciaSelec;
	private Personal personalSelec;
	private ReporteUrgencia reporteSelec;

	private List<Ambulancia> listarAmbulancia;
	private List<Personal> listarConductorPersonal;
	private List<Personal> listarAuxiliarPersonal;
	private List<Personal> listarParamedicoPersonal;
	private List<ReporteUrgencia> listarReporte;

	@Size(min = 1, max = 50)
	private String idEnviarAtencion;

	/**
	 * Documentacion de reporte urgencia
	 */
	private ReporteUrgencia reporteUrgencia;
	/**
	 * Documentacion personal
	 */
	private Personal Conducto;
	private Personal auxiliar;
	private Personal paramedico;
	
	
	/**
	 * Documentacion ambulancia
	 */
	private Ambulancia ambulancia;

	@PostConstruct
	public void initializar() {
		listarAmbulancia = ambulanciaEJB.listarAmbulancia();
		listarConductorPersonal = personalEJB.listarBuscarConductorPersonal();
		listarAuxiliarPersonal = personalEJB.listarAuxiliarPersonal();
		listarParamedicoPersonal = personalEJB.listarParamedicoPersonal();
		listarReporte = reporteUrgenciaEJB.ListarreporteUrgencias();
	}


	public EnviarAtencionUrgenciaEJB getEnviarAtencionEJB() {
		return enviarAtencionEJB;
	}


	public void setEnviarAtencionEJB(EnviarAtencionUrgenciaEJB enviarAtencionEJB) {
		this.enviarAtencionEJB = enviarAtencionEJB;
	}


	public AmbulanciaEJB getAmbulanciaEJB() {
		return ambulanciaEJB;
	}


	public void setAmbulanciaEJB(AmbulanciaEJB ambulanciaEJB) {
		this.ambulanciaEJB = ambulanciaEJB;
	}


	public ReporteUrgenciaEJB getReporteUrgenciaEJB() {
		return reporteUrgenciaEJB;
	}


	public void setReporteUrgenciaEJB(ReporteUrgenciaEJB reporteUrgenciaEJB) {
		this.reporteUrgenciaEJB = reporteUrgenciaEJB;
	}


	public PersonalEJB getPersonalEJB() {
		return personalEJB;
	}


	public void setPersonalEJB(PersonalEJB personalEJB) {
		this.personalEJB = personalEJB;
	}


	public Ambulancia getAmbulanciaSelec() {
		return ambulanciaSelec;
	}


	public void setAmbulanciaSelec(Ambulancia ambulanciaSelec) {
		this.ambulanciaSelec = ambulanciaSelec;
	}


	public Personal getPersonalSelec() {
		return personalSelec;
	}


	public void setPersonalSelec(Personal personalSelec) {
		this.personalSelec = personalSelec;
	}


	public ReporteUrgencia getReporteSelec() {
		return reporteSelec;
	}


	public void setReporteSelec(ReporteUrgencia reporteSelec) {
		this.reporteSelec = reporteSelec;
	}


	public List<Ambulancia> getListarAmbulancia() {
		return listarAmbulancia;
	}


	public void setListarAmbulancia(List<Ambulancia> listarAmbulancia) {
		this.listarAmbulancia = listarAmbulancia;
	}


	public List<Personal> getListarConductorPersonal() {
		return listarConductorPersonal;
	}


	public void setListarConductorPersonal(List<Personal> listarConductorPersonal) {
		this.listarConductorPersonal = listarConductorPersonal;
	}


	public List<Personal> getListarAuxiliarPersonal() {
		return listarAuxiliarPersonal;
	}


	public void setListarAuxiliarPersonal(List<Personal> listarAuxiliarPersonal) {
		this.listarAuxiliarPersonal = listarAuxiliarPersonal;
	}


	public List<Personal> getListarParamedicoPersonal() {
		return listarParamedicoPersonal;
	}


	public void setListarParamedicoPersonal(List<Personal> listarParamedicoPersonal) {
		this.listarParamedicoPersonal = listarParamedicoPersonal;
	}


	public List<ReporteUrgencia> getListarReporte() {
		return listarReporte;
	}


	public void setListarReporte(List<ReporteUrgencia> listarReporte) {
		this.listarReporte = listarReporte;
	}


	public String getIdEnviarAtencion() {
		return idEnviarAtencion;
	}


	public void setIdEnviarAtencion(String idEnviarAtencion) {
		this.idEnviarAtencion = idEnviarAtencion;
	}


	public ReporteUrgencia getReporteUrgencia() {
		return reporteUrgencia;
	}


	public void setReporteUrgencia(ReporteUrgencia reporteUrgencia) {
		this.reporteUrgencia = reporteUrgencia;
	}


	public Personal getConducto() {
		return Conducto;
	}


	public void setConducto(Personal conducto) {
		Conducto = conducto;
	}


	public Personal getAuxiliar() {
		return auxiliar;
	}


	public void setAuxiliar(Personal auxiliar) {
		this.auxiliar = auxiliar;
	}


	public Personal getParamedico() {
		return paramedico;
	}


	public void setParamedico(Personal paramedico) {
		this.paramedico = paramedico;
	}


	public Ambulancia getAmbulancia() {
		return ambulancia;
	}


	public void setAmbulancia(Ambulancia ambulancia) {
		this.ambulancia = ambulancia;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void crearAtencion (){
		try{
		EnviarAtencionUrgencia atencion = new EnviarAtencionUrgencia();
		
		
		atencion.setIdatencion(idEnviarAtencion);
		atencion.setAuxiliar(auxiliar);
		atencion.setConductor(Conducto);
		atencion.setParamedico(paramedico);
		atencion.setReporteUrgencia(reporteUrgencia);
		
		enviarAtencionEJB.crearEnviarAtencion(atencion);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "La Ambulancia a sido registrada"));
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"No se ha podido crear", e.getMessage().toString() + "."));
	}
	}
	
}
