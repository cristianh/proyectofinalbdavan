package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IEspecialidad;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;


public class controladorEspecialidad {
	
	private IEspecialidad iespecialidad;
	
	public controladorEspecialidad() throws NamingException{
		// TODO Auto-generated constructor stub
		iespecialidad = (IEspecialidad) ServiceLocator.buscarEJB("EspecialidadEJB", IEspecialidad.class.getCanonicalName());
	}
	
	public void crearEspecialidad(Especialidad especialidad) {
		iespecialidad.crearEspecialidad(especialidad);
	}

	public Especialidad buscarEspecialidad(String codigoespecialidad) {
		return iespecialidad.buscarEspecialidad(codigoespecialidad);
	}
	
	public void eliminarEspecialidad(String codigoespecialidad) {
			iespecialidad.eliminar(codigoespecialidad);
	}
	
	public List<Especialidad> listarEspecialidad(){
		return iespecialidad.ListarEspecialidad();
	}
}
