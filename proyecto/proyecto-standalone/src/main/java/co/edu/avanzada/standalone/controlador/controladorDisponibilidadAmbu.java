package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IDisponibilidad;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Disponibilidad;

public class controladorDisponibilidadAmbu {

	private IDisponibilidad idisponibilidad;
	
	public controladorDisponibilidadAmbu() throws NamingException{
	idisponibilidad = (IDisponibilidad) ServiceLocator.buscarEJB("DisponibilidadEJB", IDisponibilidad.class.getCanonicalName());	
	}
	
	public void crearDisponibilidad(Disponibilidad disponibilidad){
		idisponibilidad.crearDisponibilidad(disponibilidad);
	}
	
	public Disponibilidad buscarDisponibilidad(String iddisponibilidad){
		return idisponibilidad.buscarDisponibilidad(iddisponibilidad);
	}
	
	public void eliminarDisponibilidad(String iddisponibilidad){
		idisponibilidad.eliminarDisponibilidad(iddisponibilidad);
	}
	
	public List<Disponibilidad> listarDisponibilidad(){
		return idisponibilidad.ListarDisponibilidad();
	}
}
