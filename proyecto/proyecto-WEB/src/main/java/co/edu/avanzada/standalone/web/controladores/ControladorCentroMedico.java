package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.CamaEJB;
import co.edu.avanzada.negocio.beans.EspecialidadEJB;
import co.edu.avanzada.negocio.beans.GradoComplejidadEJB;
import co.edu.avanzada.negocio.beans.TipoCamaEJB;
import co.edu.avanzada.negocio.beans.TipoCentroMedicoEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Cama;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;
import co.edu.eam.ingesoft.persistencia.entidades.GradocomplejidadHospital;
import co.edu.eam.ingesoft.persistencia.entidades.TipoCama;
import co.edu.eam.ingesoft.persistencia.entidades.TipoCentroMedico;

@ViewScoped
@Named("concentromedico")
public class ControladorCentroMedico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// EJBS

	@EJB
	private TipoCamaEJB tipocamaEJB;

	@EJB
	private CamaEJB camaEJB;

	@EJB
	private EspecialidadEJB especialidadEJB;

	// private TipoC tipocentromedicoEJB;

	@EJB
	private GradoComplejidadEJB gradocomplejidadhospitalEJB;

	@EJB
	private TipoCentroMedicoEJB tipocentromedicoEJB;

	// Entitys

	private Cama cama;

	private Especialidad especialidad;

	private GradocomplejidadHospital complejidadcentromedico;

	private TipoCentroMedico tipocentromedico;

	// seleccion items

	private TipoCama tipocamaseleccionado;
	
	private TipoCama tipocamaseleccionadoeditado;

	private GradocomplejidadHospital nivelcentromedicoseleccionado;
	
	private Cama camaitemseleccionado;
	
	

	// List


	private List<Cama> listarcamas;

	private List<Especialidad> listarespecialidades;

	private List<GradocomplejidadHospital> listarnivelCentromedico;

	private List<TipoCentroMedico> listarTipocentroMedico;

	private List<TipoCama> listarTipocamas;

	// Varibales

	private String nombreCentromedico;

	private String codigoCentromedico;

	private String tipoCentromedico;

	private String direccionCentromedico;

	private String estadocama;
	
	//editado
	private String estadocamaedotado;

	@PostConstruct
	public void initializar() {
		listarTipocamas = tipocamaEJB.ListarTipocama();
		System.out.println(listarTipocentroMedico);
		listarnivelCentromedico = gradocomplejidadhospitalEJB.ListarGradocomplejidadhospital();
		listarcamas = camaEJB.listarCamas();
		listarespecialidades = especialidadEJB.ListarEspecialidad();
		listarTipocentroMedico = tipocentromedicoEJB.ListarTipocentromedico();
		System.out.println(listarTipocentroMedico);
		estadocama = "Activa";
	}

	public CamaEJB getCamaEJB() {
		return camaEJB;
	}

	public void setCamaEJB(CamaEJB camaEJB) {
		this.camaEJB = camaEJB;
	}

	public EspecialidadEJB getEspecialidadEJB() {
		return especialidadEJB;
	}

	public void setEspecialidadEJB(EspecialidadEJB especialidadEJB) {
		this.especialidadEJB = especialidadEJB;
	}

	public Cama getCama() {
		return cama;
	}

	public void setCama(Cama cama) {
		this.cama = cama;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public GradocomplejidadHospital getComplejidadcentromedico() {
		return complejidadcentromedico;
	}

	public void setComplejidadcentromedico(GradocomplejidadHospital complejidadcentromedico) {
		this.complejidadcentromedico = complejidadcentromedico;
	}

	public TipoCentroMedico getTipocentromedico() {
		return tipocentromedico;
	}

	public void setTipocentromedico(TipoCentroMedico tipocentromedico) {
		this.tipocentromedico = tipocentromedico;
	}

	public List<Cama> getListarcamas() {
		return listarcamas;
	}

	public void setListarcamas(List<Cama> listarcamas) {
		this.listarcamas = listarcamas;
	}

	public List<Especialidad> getListarespecialidades() {
		return listarespecialidades;
	}

	public void setListarespecialidades(List<Especialidad> listarespecialidades) {
		this.listarespecialidades = listarespecialidades;
	}

	public List<GradocomplejidadHospital> getListarnivelCentromedico() {
		return listarnivelCentromedico;
	}

	public void setListarnivelCentromedico(List<GradocomplejidadHospital> listarnivelCentromedico) {
		this.listarnivelCentromedico = listarnivelCentromedico;
	}

	public List<TipoCentroMedico> getListarTipocentroMedico() {
		return listarTipocentroMedico;
	}

	public void setListarTipocentroMedico(List<TipoCentroMedico> listarTipocentroMedico) {
		this.listarTipocentroMedico = listarTipocentroMedico;
	}

	public String getNombreCentromedico() {
		return nombreCentromedico;
	}

	public void setNombreCentromedico(String nombreCentromedico) {
		this.nombreCentromedico = nombreCentromedico;
	}

	public String getCodigoCentromedico() {
		return codigoCentromedico;
	}

	public void setCodigoCentromedico(String codigoCentromedico) {
		this.codigoCentromedico = codigoCentromedico;
	}

	public String getTipoCentromedico() {
		return tipoCentromedico;
	}

	public void setTipoCentromedico(String tipoCentromedico) {
		this.tipoCentromedico = tipoCentromedico;
	}

	public String getDireccionCentromedico() {
		return direccionCentromedico;
	}

	public void setDireccionCentromedico(String direccionCentromedico) {
		this.direccionCentromedico = direccionCentromedico;
	}

	public String getestadocama() {
		return estadocama;
	}

	public void setestadocama(String estadocama) {
		this.estadocama = estadocama;
	}

	public GradoComplejidadEJB getGradocomplejidadhospitalEJB() {
		return gradocomplejidadhospitalEJB;
	}

	public void setGradocomplejidadhospitalEJB(GradoComplejidadEJB gradocomplejidadhospitalEJB) {
		this.gradocomplejidadhospitalEJB = gradocomplejidadhospitalEJB;
	}

	public GradocomplejidadHospital getNivelcentromedicoseleccionado() {
		return nivelcentromedicoseleccionado;
	}

	public void setNivelcentromedicoseleccionado(GradocomplejidadHospital nivelcentromedicoseleccionado) {
		this.nivelcentromedicoseleccionado = nivelcentromedicoseleccionado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TipoCamaEJB getTipocamaEJB() {
		return tipocamaEJB;
	}

	public void setTipocamaEJB(TipoCamaEJB tipocamaEJB) {
		this.tipocamaEJB = tipocamaEJB;
	}

	public List<TipoCama> getListarTipocamas() {
		return listarTipocamas;
	}

	public void setListarTipocamas(List<TipoCama> listarTipocamas) {
		this.listarTipocamas = listarTipocamas;
	}

	public String getEstadocama() {
		return estadocama;
	}

	public void setEstadocama(String estadocama) {
		this.estadocama = estadocama;
	}

	public TipoCama getTipocamaseleccionado() {
		return tipocamaseleccionado;
	}

	public void setTipocamaseleccionado(TipoCama tipocamaseleccionado) {
		this.tipocamaseleccionado = tipocamaseleccionado;
	}
	
	

	public TipoCentroMedicoEJB getTipocentromedicoEJB() {
		return tipocentromedicoEJB;
	}

	public void setTipocentromedicoEJB(TipoCentroMedicoEJB tipocentromedicoEJB) {
		this.tipocentromedicoEJB = tipocentromedicoEJB;
	}


	public Cama getCamaitemseleccionado() {
		return camaitemseleccionado;
	}

	public void setCamaitemseleccionado(Cama camaitemseleccionado) {
		this.camaitemseleccionado = camaitemseleccionado;
	}
	
	
	

	public TipoCama getTipocamaseleccionadoeditado() {
		return tipocamaseleccionadoeditado;
	}

	public void setTipocamaseleccionadoeditado(TipoCama tipocamaseleccionadoeditado) {
		this.tipocamaseleccionadoeditado = tipocamaseleccionadoeditado;
	}
	
	

	public String getEstadocamaedotado() {
		return estadocamaedotado;
	}

	public void setEstadocamaedotado(String estadocamaedotado) {
		this.estadocamaedotado = estadocamaedotado;
	}

	public void crearcentromedico() {

	}

	public void editarmedico() {

	}

	// Cama metodos
	public void crearcama() {

		try {
			cama = new Cama(estadocama, tipocamaseleccionado);
			camaEJB.crearCama(cama);
			listarcamas = camaEJB.listarCamas();
			setListarcamas(listarcamas);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void guardarCamaEditado(Integer codigo) {
		try {
			System.out.println("encontrado"+codigo);
			Cama buscarcama=camaEJB.buscarCama(codigo);
			setTipocamaseleccionado(tipocamaseleccionado);
			buscarcama.setTipocama(tipocamaseleccionado);
			System.out.println("encontrado"+tipocamaseleccionado);
			setTipocamaseleccionado(tipocamaseleccionado);
			buscarcama.setEstadocama(estadocama);
			System.out.println("encontrado"+estadocama);

			camaEJB.crearCama(buscarcama);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}	
	public void editarCama() {
		
	}	

	public void eliminar(Cama cama) {
		camaEJB.eliminarCama(cama);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "La cama a sido eliminada", "La cama a sido eliminada."));
		listarcamas = camaEJB.listarCamas();
		setListarcamas(listarcamas);
		return;
	}

}
