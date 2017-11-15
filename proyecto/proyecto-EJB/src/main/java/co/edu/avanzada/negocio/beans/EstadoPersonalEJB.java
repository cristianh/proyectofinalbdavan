package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.benas.remote.IEstadoPersonal;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.EstadoPersonal;


@LocalBean
@Stateless
@Remote(IEstadoPersonal.class)
public class EstadoPersonalEJB implements IEstadoPersonal{

	@PersistenceContext
	EntityManager entity;
	
	/**
	 * 
	 * @param estadoPersonal
	 */
	public void crearEstadoPersonal(EstadoPersonal estadoPersonal){
		EstadoPersonal busquedaEstadoPersonal = buscarEstadoPersonal(estadoPersonal.getIdEstadoPersonal());
		if(busquedaEstadoPersonal == null){
			entity.persist(estadoPersonal);
			System.out.println("EstadoPersonal registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");	
		}
	}
	
	/**
	 * 
	 * @param idEstadoPersonal
	 * @return
	 */
	public EstadoPersonal buscarEstadoPersonal(String idEstadoPersonal){
		return entity.find(EstadoPersonal.class, idEstadoPersonal);
	}

	/**
	 * 
	 * @param estadoPersonal
	 */
	public void editarEstadoPersonal(EstadoPersonal estadoPersonal){
		entity.merge(estadoPersonal);
	}
	
	public void eliminarEstadoPersonal(String idEstadoPersonal){
		EstadoPersonal busquedaEstadoPersonal = buscarEstadoPersonal(idEstadoPersonal);
		if(busquedaEstadoPersonal != null){
			entity.remove(idEstadoPersonal);
		}else{
			throw new ExcepcionNegocio("Error al borrar la estadoPersonal");
		}
	}
	
	
	public List<EstadoPersonal>  BuscarListaEstadoPersonal(String idEstadoPersonal) {
		List<EstadoPersonal> estadoPersonal = null;
		
		try{
			Query resultado = entity.createQuery("SELECT stp FROM EstadoPersonal stp where idEstadoPersonalestadoPersonal=:estado");
			resultado.setParameter("estado", idEstadoPersonal);
			estadoPersonal = resultado.getResultList();
			return estadoPersonal;
		} catch (Exception ex){
			throw new ExcepcionNegocio("No se encuentra una estadoPersonal con estos parametros de busqueda");
		}
		
	}

	public List<EstadoPersonal> listarEstadoPersonal(){
		List<EstadoPersonal> result = entity.createQuery("SELECT stp FROM EstadoPersonal stp").getResultList();
		return result;
	}
	
}


