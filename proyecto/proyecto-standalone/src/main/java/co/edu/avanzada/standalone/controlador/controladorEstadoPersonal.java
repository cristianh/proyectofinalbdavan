package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IEstadoPersonal;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.EstadoPersonal;

public class controladorEstadoPersonal {


private IEstadoPersonal iestadoPersonal;
	
	public controladorEstadoPersonal() throws NamingException{
	iestadoPersonal = (IEstadoPersonal) ServiceLocator.buscarEJB("EstadoPersonalEJB", IEstadoPersonal.class.getCanonicalName());	
	}
	
	public void crearEstadoPersonal(EstadoPersonal estadoPersonal){
		iestadoPersonal.crearEstadoPersonal(estadoPersonal);
	}
	
	public EstadoPersonal buscarEstadoPersonal(String idestadoPersonal){
		return iestadoPersonal.buscarEstadoPersonal(idestadoPersonal);
	}
	
	public void eliminarEstadoPersonal(String idestadoPersonal){
		iestadoPersonal.eliminarEstadoPersonal(idestadoPersonal);
	}
	
	public List<EstadoPersonal> listarEstadoPersonal(){
		return iestadoPersonal.listarEstadoPersonal();
	}
	

}
