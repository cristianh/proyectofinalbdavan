package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IUrgenciaAmbulancia;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.UrgenciaAmbulancia;

public class controladorUrgenciaAmbulancia {

	private IUrgenciaAmbulancia iUrgenciaAmbulancia;

	public controladorUrgenciaAmbulancia() throws NamingException {
		// TODO Auto-generated constructor stub
		iUrgenciaAmbulancia = (IUrgenciaAmbulancia) ServiceLocator.buscarEJB("UrgenciaAmbulanciaEJB", IUrgenciaAmbulancia.class.getCanonicalName());
	}

	public void crearUrgenciaAmbulancia(UrgenciaAmbulancia urgenciaAmbulancia) {
		iUrgenciaAmbulancia.crearUrgenciaAmbulancia(urgenciaAmbulancia);
	}
	
	public UrgenciaAmbulancia buscarUrgenciaAmbulancia(Integer idurgenciaambulacia) {
		return iUrgenciaAmbulancia.buscarUrgenciaAmbulancia(idurgenciaambulacia);
	}
	
	public List<UrgenciaAmbulancia> listarurgenciaAmbulancia(){
		return iUrgenciaAmbulancia.listarUrgenciaAmbulancia();
	}
	
}
