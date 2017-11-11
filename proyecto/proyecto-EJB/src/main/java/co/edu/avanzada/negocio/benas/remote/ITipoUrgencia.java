package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.TipoUrgencia;

public interface ITipoUrgencia {
	
	public void crearTipoUrgencia(TipoUrgencia tipoUrgencia); 

	public TipoUrgencia  buscarTipoUrgencia(String idTipoUrgencia);
	
	public void editarTipoUrgencia (TipoUrgencia tipoUrgencia);

	public void eliminarTipoUrgencia(String idTipoUrgencia);
	
	public List<TipoUrgencia> listarTipoUrgencia();
	
	public List<TipoUrgencia> BuscarListaTipoUrgencia(String idTipoUrgencia);
	
}
