package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.ITipoUrgencia;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.TipoUrgencia;


public class controladorTipoUrgencia {
	
	private ITipoUrgencia itipourgencia;
	
	public controladorTipoUrgencia() throws NamingException {
		// TODO Auto-generated constructor stub
		itipourgencia = (ITipoUrgencia) ServiceLocator.buscarEJB("TipoUrgenciaEJB", ITipoUrgencia.class.getCanonicalName());
	}
	
	public void creaTipourgencia(TipoUrgencia tipourgencia) {
		itipourgencia.crearTipoUrgencia(tipourgencia);
	}
	
	public TipoUrgencia buscartipourgencia (String idtipourgencia) {
		return itipourgencia.buscarTipoUrgencia(idtipourgencia);
	}
	
	public List<TipoUrgencia> listartipourgencia(){
		return itipourgencia.listarTipoUrgencia();
	}
	
}
