package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.ITipoEvento;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.TipoEvento;

public class controladorTipoEvento {


private ITipoEvento itipoUrgencia;
	
	
	public controladorTipoEvento() throws NamingException {
		// TODO Auto-generated constructor stub
		itipoUrgencia = (ITipoEvento) ServiceLocator.buscarEJB("TipoEventoEJB", ITipoEvento.class.getCanonicalName());
	}
	
	public void creaTipoEvento(TipoEvento tipoEvento) {
		itipoUrgencia.crearTipoEvento(tipoEvento);
	}
	
	public TipoEvento buscarCodigo(Integer idTipoEvento) {
		return itipoUrgencia.buscarTipoEvento(idTipoEvento);
	}
	
}
