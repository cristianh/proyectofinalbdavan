package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;
import javax.naming.spi.NamingManager;
import javax.persistence.Id;

import co.edu.avanzada.negocio.benas.remote.IAlbergue;
import co.edu.avanzada.negocio.benas.remote.IPrioridad;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Albergue;

public class controladorAlbergue {

	private IAlbergue idalbergue;

	/**
	 * 
	 */
	public controladorAlbergue() throws NamingException{
	idalbergue = (IAlbergue) ServiceLocator.buscarEJB("AlbergueEJB", IAlbergue.class.getCanonicalName());
	}
	
	public void crearAlbergue(Albergue albergue){
		idalbergue.crearAlbergue(albergue);
	}
	
	public Albergue buscarAlbergue(Integer idAlbergue){
		return idalbergue.buscarAlbergue(idAlbergue);
	}
	
	
	
}
