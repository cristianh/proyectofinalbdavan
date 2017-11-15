package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Personal;

public interface IPersonal {

	public void crearPersonal(Personal personal);
	
	public Personal buscarPersonal(String idpersonal);
	
	public void editarPersonal(Personal personal);
	
	public void eliminarPersonal(String idpersonal);
	
	public List<Personal> listarPersonal();

	public List<Personal> BuscarListaPersonal(String nombre, String cedula);
	
}
