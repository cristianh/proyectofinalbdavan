package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.benas.remote.IEnviarAtencionUrgencia;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.EnviarAtencionUrgencia;

@LocalBean
@Stateless
@Remote(IEnviarAtencionUrgencia.class)
public class EnviarAtencionUrgenciaEJB implements IEnviarAtencionUrgencia {

	
	@PersistenceContext
	EntityManager entity;
	
	
	
	public void crearEnviarAtencion (EnviarAtencionUrgencia enviarAtencionUrgencia){
		EnviarAtencionUrgencia busquedaEnviarAtencionUrgencia = buscarEnviarAtencion(enviarAtencionUrgencia.getIdatencion());
		if(busquedaEnviarAtencionUrgencia == null){
			entity.persist(enviarAtencionUrgencia);
			System.out.println("EnviarAtencionUrgencia registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");	
		}
	}
	
	/**
	 * 
	 * @param idEnviarAtencion
	 * @return
	 */
	public EnviarAtencionUrgencia buscarEnviarAtencion (String idEnviarAtencion){
		return entity.find(EnviarAtencionUrgencia.class, idEnviarAtencion);
	}

	/**
	 * 
	 * @param enviarAtencionUrgencia
	 */
	public void editarEnviarAtencion (EnviarAtencionUrgencia enviarAtencionUrgencia){
		entity.merge(enviarAtencionUrgencia);
	}
	
	public void eliminarEnviarAtencion (String idEnviarAtencion){
		EnviarAtencionUrgencia busquedaEnviarAtencionUrgencia = buscarEnviarAtencion(idEnviarAtencion);
		if(busquedaEnviarAtencionUrgencia != null){
			entity.remove(idEnviarAtencion);
		}else{
			throw new ExcepcionNegocio("Error al borrar la enviarAtencionUrgencia");
		}
	}
	
	
	public List<EnviarAtencionUrgencia> listarEnviarAtencion (){
		List<EnviarAtencionUrgencia> result = entity.createNamedQuery("EnviarAtencionUrgencia.listarenviarAtencionUrgencia").getResultList();
		return result;
	}
	
	public List<EnviarAtencionUrgencia>  BuscarListaEnviarAtencion(String placa) {
		List<EnviarAtencionUrgencia> enviarAtencionUrgencia = null;
		
		try{
			Query resultado = entity.createNamedQuery("EnviarAtencionUrgencia.listarbuscarenviarAtencionUrgencia");
			resultado.setParameter("estado", placa);
			enviarAtencionUrgencia = resultado.getResultList();
			return enviarAtencionUrgencia;
		} catch (Exception ex){
			throw new ExcepcionNegocio("No se encuentra una enviarAtencionUrgencia con estos parametros de busqueda");
		}	
	}

	
}