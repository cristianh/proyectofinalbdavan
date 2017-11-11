package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Urgencia;

public interface IUrgencia {
	
	public void crearUrgencia(Urgencia urgencia); 

	public Urgencia buscarUrgencia(String codigoreporteurgencia);
	
	public void editarUrgencia (Urgencia urgencia);

	public void eliminarUrgencia(String codigoreporteurgencia);
	
	public List<Urgencia> listarUrgencia();
	
	public List<Urgencia> BuscarListaUrgencias(Integer idUrgencia);
}
