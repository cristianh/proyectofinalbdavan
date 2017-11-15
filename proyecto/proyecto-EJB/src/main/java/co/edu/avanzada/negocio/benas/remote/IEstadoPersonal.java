package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.EstadoPersonal;

public interface IEstadoPersonal {
	
	public void crearEstadoPersonal(EstadoPersonal estadoPersonal);
	
	public EstadoPersonal buscarEstadoPersonal(String idestadoPersonal);
	
	public void editarEstadoPersonal(EstadoPersonal estadoPersonal);
	
	public void eliminarEstadoPersonal(String idestadoPersonal);
	
	public List<EstadoPersonal> listarEstadoPersonal();

	public List<EstadoPersonal> BuscarListaEstadoPersonal(String idestadoPersonal);
	
}
