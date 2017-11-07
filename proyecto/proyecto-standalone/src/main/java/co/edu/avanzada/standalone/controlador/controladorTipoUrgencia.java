package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.ITipoEvento;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.TipoEvento;


public class controladorTipoUrgencia {
	
	private ITipoEvento itipoevento;
	
	public controladorTipoUrgencia() throws NamingException {
		// TODO Auto-generated constructor stub
		itipoevento = (ITipoEvento) ServiceLocator.buscarEJB("TipoEventoEJB", ITipoEvento.class.getCanonicalName());
	}
	
	public void creaTipourgencia(TipoEvento tipoEvento) {
		itipoevento.crearTipoEvento(tipoEvento);
	}
	
	public TipoEvento buscarUrgenciaEvento (Integer idtipoevento) {
		return itipoevento.buscarTipoEvento(idtipoevento);
	}
	
	public List<TipoEvento> listarUrgenciaEvento (){
		return itipoevento.listarTipoEvento();
	}
	
}
