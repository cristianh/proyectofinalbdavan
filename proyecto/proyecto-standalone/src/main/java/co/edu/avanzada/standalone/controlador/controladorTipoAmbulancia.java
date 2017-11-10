package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.ITipoAmbulancia;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.TipoAmbulancia;

public class controladorTipoAmbulancia {

private ITipoAmbulancia itipoAmbulancia;
	
	public controladorTipoAmbulancia() throws NamingException{
	itipoAmbulancia = (ITipoAmbulancia) ServiceLocator.buscarEJB("TipoAmbulanciaEJB", ITipoAmbulancia.class.getCanonicalName());	
	}
 
	public void crearTipoAmbulancia(TipoAmbulancia tipoAmbulancia){
		itipoAmbulancia.crearTipoAmbulancia(tipoAmbulancia);
	}
	
	public TipoAmbulancia buscarTipoAmbulancia(String idtipoAmbulancia){
		return itipoAmbulancia.buscarTipoAmbulancia(idtipoAmbulancia);
	}
	
	public void eliminarTipoAmbulancia(String idtipoAmbulancia){
		itipoAmbulancia.eliminarTipoAmbulancia(idtipoAmbulancia);
	}
	
	public List<TipoAmbulancia> listarTipoAmbulancia(){
		return itipoAmbulancia.ListarTipoAmbulancia();
	}
}
