package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Genero;
import co.edu.eam.ingesoft.persistencia.entidades.TipoCentroMedico;

public interface ITipoCentroMedico {
	
	public void crearTipocentromedico(TipoCentroMedico tipocentromedico);

	public TipoCentroMedico buscarTipocentromedico(String codigotipocentromedico);
	
	public List<TipoCentroMedico> ListarTipocentromedico();

}
