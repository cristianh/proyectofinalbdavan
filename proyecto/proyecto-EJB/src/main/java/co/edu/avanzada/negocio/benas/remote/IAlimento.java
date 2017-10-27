package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Alimento;

public interface IAlimento  {
	
	public void crearAlimento(Alimento persona);

	public Alimento buscarPersona(Integer idAlimento);

	public void editarPersona(Alimento persona);

	public void eliminar(Integer idAlimento);

	public List<Alimento> ListarPersonas();

	public List<Alimento> BuscarListaPersonas(Integer idAlimento);
}
