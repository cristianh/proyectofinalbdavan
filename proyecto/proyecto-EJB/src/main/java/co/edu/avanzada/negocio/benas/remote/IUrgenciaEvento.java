package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.UrgenciaEvento;

public interface IUrgenciaEvento {

	public void crearUrgenciaEvento(UrgenciaEvento urgenciaEvento); 

	public UrgenciaEvento  buscarUrgenciaEvento(Integer idUrgenciaEvento);
	
	public void editarUrgenciaEvento (UrgenciaEvento urgenciaEvento);

	public void eliminarUrgenciaEvento(Integer idUrgenciaEvento);
	
	public List<UrgenciaEvento> listarUrgenciaEvento();
	
	public List<UrgenciaEvento> BuscarListaUrgenciaEvento(Integer idUrgenciaEvento) ;
}
