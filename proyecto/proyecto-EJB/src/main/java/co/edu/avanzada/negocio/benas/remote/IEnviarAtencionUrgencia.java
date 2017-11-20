package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Ambulancia;
import co.edu.eam.ingesoft.persistencia.entidades.EnviarAtencionUrgencia;

public interface IEnviarAtencionUrgencia {

	public void crearEnviarAtencion (EnviarAtencionUrgencia enviarAtencion);
	
	public EnviarAtencionUrgencia buscarEnviarAtencion(String idenviarAtencion);
	
	public void editarEnviarAtencion(EnviarAtencionUrgencia enviarAtencion);
	
	public void eliminarEnviarAtencion(String idenviarAtencion);
	
	public List<EnviarAtencionUrgencia> listarEnviarAtencion();

	public List<EnviarAtencionUrgencia> BuscarListaEnviarAtencion(String idenviarAtencion);
	
	
}
