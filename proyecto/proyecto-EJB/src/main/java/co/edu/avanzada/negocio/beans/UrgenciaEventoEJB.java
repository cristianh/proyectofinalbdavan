package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import co.edu.avanzada.negocio.benas.remote.IUrgenciaEvento;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.UrgenciaEvento;

@LocalBean
@Stateless
@Remote(IUrgenciaEvento.class)
public class UrgenciaEventoEJB {

	@PersistenceContext
	EntityManager entity;
	

public void crearUrgenciaEvento(UrgenciaEvento urgenciaEvento){
		UrgenciaEvento busquedaUrgenciaEvento = buscarUrgenciaEvento(urgenciaEvento.getIdurgenciaevento());
		if(busquedaUrgenciaEvento == null){
			entity.persist(urgenciaEvento);
			System.out.println("UrgenciaEvento registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idUrgenciaEvento
	 * @return
	 */
	public UrgenciaEvento buscarUrgenciaEvento(Integer idUrgenciaEvento){
		return entity.find(UrgenciaEvento.class, idUrgenciaEvento);
	}

	/**
	 * 
	 * @param urgenciaEvento
	 */
	public void editarUrgenciaEvento(UrgenciaEvento urgenciaEvento){
		entity.merge(urgenciaEvento);
	}
	
	public void eliminarUrgenciaEvento(Integer idUrgenciaEvento){
		UrgenciaEvento busquedaUrgenciaEvento = buscarUrgenciaEvento(idUrgenciaEvento);
		if(busquedaUrgenciaEvento != null){
			entity.remove(idUrgenciaEvento);
		}else{
			throw new ExcepcionNegocio("Error al borrar la urgenciaEvento");
		}
	}
	
	
	public List<UrgenciaEvento> listarUrgenciaEvento(){
		List<UrgenciaEvento> resultado = null;
		
		try{
			resultado = entity.createQuery("UrgenciaEvento.listarUrgenciaEvento").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
	
	
	public List<UrgenciaEvento> BuscarListaUrgenciaEvento(Integer idUrgenciaEvento){
	return null;	
	}
}
