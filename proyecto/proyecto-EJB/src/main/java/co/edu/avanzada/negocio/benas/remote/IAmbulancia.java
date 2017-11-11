package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Ambulancia;

public interface IAmbulancia {

	public void crearAmbulancia(Ambulancia ambulancia);
	
	public Ambulancia buscarAmbulancia(String idambulancia);
	
	public void editarAmbulancia(Ambulancia ambulancia);
	
	public void eliminarAmbulancia(String idambulancia);
	
	public List<Ambulancia> listarAmbulancia();

	public List<Ambulancia> BuscarListaAmbulancia(String idambulancia);
	
}
