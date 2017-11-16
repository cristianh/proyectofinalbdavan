package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IPersonal;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Personal;

public class controladorPersonal {

private IPersonal ipersonal;
	
	public controladorPersonal() throws NamingException{
	ipersonal = (IPersonal) ServiceLocator.buscarEJB("PersonalEJB", IPersonal.class.getCanonicalName());	
	}
	
	public void crearPersonal(Personal persona){
		ipersonal.crearPersonal(persona);
	}
	
	public Personal buscarPersonal(String idpersona){
		return ipersonal.buscarPersonal(idpersona);
	}
	
	public void eliminarPersonal(String idpersona){
		ipersonal.eliminarPersonal(idpersona);
	}
	
	public List<Personal> listarPersonal(){
		return ipersonal.listarPersonal();
	}
}
