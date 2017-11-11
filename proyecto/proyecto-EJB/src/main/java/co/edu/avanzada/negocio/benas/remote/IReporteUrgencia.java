package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.ReporteUrgencia;

public interface IReporteUrgencia {

	public void crearReporteUrgencia(ReporteUrgencia reporteUrgencia);

	public ReporteUrgencia buscarreporteUrgencia(String idUrgencia);

	public void editarreporteurgencias(ReporteUrgencia reporteUrgencia);

	public void eliminar(String idUrgencia);

	public List<ReporteUrgencia> ListarreporteUrgencias();

	public List<ReporteUrgencia> BuscarListaUrgencias(String idUrgencia);
	
	public List<ReporteUrgencia> listarreporteUrgenciasOrdenado();
}
