package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.jboss.logging.Param;

import co.edu.avanzada.negocio.beans.OperadorPersonalEJB;
import co.edu.avanzada.negocio.beans.TipoEventoEJB;
import co.edu.avanzada.negocio.beans.UrgenciaAmbulanciaEJB;
import co.edu.avanzada.negocio.beans.UrgenciaEJB;
import co.edu.avanzada.negocio.beans.UrgenciaEventoEJB;
import co.edu.eam.ingesoft.persistencia.entidades.OperadorPersonal;
import co.edu.eam.ingesoft.persistencia.entidades.TipoEvento;
import co.edu.eam.ingesoft.persistencia.entidades.Urgencia;
import co.edu.eam.ingesoft.persistencia.entidades.UrgenciaAmbulancia;
import co.edu.eam.ingesoft.persistencia.entidades.UrgenciaEvento;

public class ControladorUrgenciaEvento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private UrgenciaEventoEJB urgenciaEventoEJB;
	
	@EJB
	private UrgenciaEJB urgenciaEJB;
	
	@EJB
	private TipoEventoEJB tipoEventoEJB;
	
	@EJB
	private OperadorPersonalEJB operadorPersonalEJB;
	
	@EJB
	private UrgenciaAmbulanciaEJB urgenciaAmbulanciaEJB;
	
	private List<UrgenciaEvento> listaUrgenciaEvento;
	private List<Urgencia> listaUrgencia;
	private List<TipoEvento> listaTipoEvento;
	private List<OperadorPersonal> listaOperadorPersonal;
	private List<UrgenciaAmbulancia> listaUrgenciaAmbulancia;
	
	private UrgenciaEvento urgenciaEventoSeleccion;
	private Urgencia urgenciaSeleccion;
	private TipoEvento tipoEventoSeleccion;
	private OperadorPersonal operadorPersonalSeleccion;
	private UrgenciaAmbulancia urgenciaAmbulanciaSeleccion;
	
	@Size(min=1, max=8, message="exede la longitud debe ser entre 1 y 8 caracterez")
	@Pattern(regexp= "[0-9]", message="Formato invalido, no se permiten letras")
	private Integer idUrgenciaEvento;
	
	private TipoEvento tipoevento;
	
	@Size(min = 1, max = 50, message = "la longitud debe se entre 1 y 100 caracteres")
	@Pattern(regexp = "[a-zA-z]*", message = "Formato invalido, no se permiten letras")
	private String lugar;
	
	private Date fechaReporte;
	
	private String estado;
	
	private OperadorPersonal operador;
	
	private String descripcion;
	
	public void initializar(){
		listaUrgencia = urgenciaEJB.listarUrgencia();
		
	}
	
	
	
	
	
}	
