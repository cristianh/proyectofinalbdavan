package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;

public interface IEspecialidad {
	
	public void crearEspecialidad(Especialidad especialidad);

	public Especialidad buscarEspecialidad(String codigoespecialidad);

	public void editarEspecialidad(Especialidad idespecialidad);

	public void eliminar(String codigoespecialidad);

	public List<Especialidad> ListarEspecialidad();

	public List<Especialidad> BuscarListaEspecialidad(String codigoestadoespecialidad);
	
}
