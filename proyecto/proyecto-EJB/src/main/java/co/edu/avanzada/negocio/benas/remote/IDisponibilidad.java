package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Disponibilidad;

public interface IDisponibilidad {

	public void crearDisponibilidad(Disponibilidad disponibilidad);

	public Disponibilidad buscarDisponibilidad(String iddisponibilidad);

	public void editarDisponibilidad(Disponibilidad disponibilidad);

	public void eliminarDisponibilidad(String iddisponibilidad);

	public List<Disponibilidad> ListarDisponibilidad();
	
	public List<Disponibilidad> BuscarListaDisponibilidad(String iddisponibilidad);
}
