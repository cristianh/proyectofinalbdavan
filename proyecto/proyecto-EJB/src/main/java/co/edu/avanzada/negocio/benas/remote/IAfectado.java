package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Afectado;
import co.edu.eam.ingesoft.persistencia.entidades.Albergue;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;

public interface IAfectado {

	public void crearAfectado(Afectado afectado); 

	public Afectado  buscarAfectado(Integer idAfectado);
	
	public void editarAfectado (Afectado afectado);

	public void eliminarAfectado(Integer idAfectado);
	
	public List<Albergue> listarAfectado();

	public List<Albergue> buscarListaAfectado(Integer idAfectado);
	
}
