package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IUrgenciaEvento;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.UrgenciaEvento;

public class controladorUrgenciaEvento {

private IUrgenciaEvento iurgenciaEvento;
	
	
	public controladorUrgenciaEvento() throws NamingException {
		// TODO Auto-generated constructor stub
		iurgenciaEvento = (IUrgenciaEvento) ServiceLocator.buscarEJB("UrgenciaEventoEJB", IUrgenciaEvento.class.getCanonicalName());
	}
	
	public void creaTipodocumento(UrgenciaEvento urgenciaEvento) {
		iurgenciaEvento.crearUrgenciaEvento(urgenciaEvento);;
	}
	
	public UrgenciaEvento buscarUrgenciaEvento (Integer idUrgenciaEvento) {
		return iurgenciaEvento.buscarUrgenciaEvento(idUrgenciaEvento);
	}
}
