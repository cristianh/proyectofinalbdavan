package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.OperadorPersonal;

public interface IOperadorPersonal {

	public void crearOperadorPersonal(OperadorPersonal operadorPersonal);
	
	public OperadorPersonal buscarOperadorPersonal(String idoperadorPersonal);

	public void editarOperadorPersonal(OperadorPersonal operadorPersonal);

	public void eliminar(String idoperadorPersonal);

	public List<OperadorPersonal> ListarOperadorPersonals();

	public List<OperadorPersonal> BuscarListaOperadorPersonals(Integer idoperadorPersonal);
}
