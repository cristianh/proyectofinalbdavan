package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.TipoAmbulancia;

public interface ITipoAmbulancia {
	
	public void crearTipoAmbulancia(TipoAmbulancia tipoAmbulancia);

	public TipoAmbulancia buscarTipoAmbulancia(String idtipoAmbulancia);

	public void editarTipoAmbulancia(TipoAmbulancia tipoAmbulancia);

	public void eliminarTipoAmbulancia(String idtipoAmbulancia);

	public List<TipoAmbulancia> ListarTipoAmbulancia();

	public List<TipoAmbulancia> BuscarListaTipoAmbulancia(String idtipoAmbulancia);
}
