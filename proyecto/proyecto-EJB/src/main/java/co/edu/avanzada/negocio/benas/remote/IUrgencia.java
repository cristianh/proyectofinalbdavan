package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Urgencia;

public interface IUrgencia {
	
	public void crearUrgencia(Urgencia urgencia); 

	public Urgencia buscarUrgencia(Integer idUrgencia);
	
	public void editarUrgencia (Urgencia urgencia);

	public void eliminarUrgencia(Integer idUrgencia);
	
	public List<Urgencia> ListarUrgencias();
	
	public List<Urgencia> BuscarListaUrgencias(Integer idUrgencia);
}
