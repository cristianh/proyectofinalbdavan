package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IEnviarAtencionUrgencia;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.EnviarAtencionUrgencia;

public class controladorEnviarAtencionUrgencia {

	private IEnviarAtencionUrgencia iaenviarAtencion;
	
	public controladorEnviarAtencionUrgencia() throws NamingException {
		iaenviarAtencion = (IEnviarAtencionUrgencia) ServiceLocator.buscarEJB("EnviarAtencionUrgenciaEJB", IEnviarAtencionUrgencia.class.getCanonicalName());  
	}
	
	public void crearAtencionUrgencia(EnviarAtencionUrgencia enviarAtencion){
		iaenviarAtencion.crearEnviarAtencion(enviarAtencion);
	}
	
	public EnviarAtencionUrgencia buscarEnviarAtencionUrgencia(String idenviarAtencion){
		return iaenviarAtencion.buscarEnviarAtencion(idenviarAtencion);
	}
	
	public void eliminarEnviarAtencionUrgencia(String idenviarAtencion){
		iaenviarAtencion.eliminarEnviarAtencion(idenviarAtencion);
	}
	
	public List<EnviarAtencionUrgencia> listarEnviarAtencionUrgencia(){
		return iaenviarAtencion.listarEnviarAtencion();
	}
	
	

}
