package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.TipoCama;

public interface ITipoCama {
	
	public void crearTipocama(TipoCama tipocama);

	public TipoCama buscarTipocama(String codigotipocama);
	
	public List<TipoCama> ListarTipocama();

}
