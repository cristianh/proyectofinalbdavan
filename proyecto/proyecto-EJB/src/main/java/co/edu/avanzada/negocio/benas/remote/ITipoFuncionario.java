package co.edu.avanzada.negocio.benas.remote;

import java.util.List;


import co.edu.eam.ingesoft.persistencia.entidades.TipoFuncionario;

public interface ITipoFuncionario {

	public void crearTipoFuncionario(TipoFuncionario tipoFuncionario); 

	public TipoFuncionario  buscarTipoFuncionario(String idTipoFuncionario);
	
	public void editarTipoFuncionario (TipoFuncionario tipoFuncionario);

	public void eliminarTipoFuncionario(String idTipoFuncionario);
	
	public List<TipoFuncionario> listarTipoFuncionario(String codigotipofuncionario);
}
