package co.edu.avanzada.negocio.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.benas.remote.IAmbulancia;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Ambulancia;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;

@LocalBean
@Stateless
@Remote(IAmbulancia.class)
public class AmbulanciaEJB implements IAmbulancia {

	
	@PersistenceContext
	EntityManager entity;
	
	/**
	 * 
	 * @param ambulancia
	 */
	public void crearAmbulancia(Ambulancia ambulancia){
		Ambulancia busquedaAmbulancia = buscarAmbulancia(ambulancia.getIdambulancia());
		if(busquedaAmbulancia == null){
			entity.persist(ambulancia);
			System.out.println("Ambulancia registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");	
		}
	}
	
	/**
	 * 
	 * @param idAmbulancia
	 * @return
	 */
	public Ambulancia buscarAmbulancia(String idAmbulancia){
		return entity.find(Ambulancia.class, idAmbulancia);
	}

	/**
	 * 
	 * @param ambulancia
	 */
	public void editarAmbulancia(Ambulancia ambulancia){
		entity.merge(ambulancia);
	}
	
	public void eliminarAmbulancia(String idAmbulancia){
		Ambulancia busquedaAmbulancia = buscarAmbulancia(idAmbulancia);
		if(busquedaAmbulancia != null){
			entity.remove(idAmbulancia);
		}else{
			throw new ExcepcionNegocio("Error al borrar la ambulancia");
		}
	}
	
	
	public List<Ambulancia> listarAmbulancia(){
		List<Ambulancia> result = entity.createNamedQuery("Ambulancia.listarambulancia").getResultList();
		return result;
	}
	
	public List<Ambulancia>  BuscarListaAmbulancia(String placa) {
		List<Ambulancia> ambulancia = null;
		
		try{
			Query resultado = entity.createNamedQuery("Ambulancia.listarbuscarambulancia");
			resultado.setParameter("estado", placa);
			ambulancia = resultado.getResultList();
			return ambulancia;
		} catch (Exception ex){
			throw new ExcepcionNegocio("No se encuentra una ambulancia con estos parametros de busqueda");
		}	
	}
	
	
	public ArrayList<Ambulancia> reporteAmbulancia(){
		ArrayList<Ambulancia> result = (ArrayList<Ambulancia>) entity.createNamedQuery("Ambulancia.listarambulancia").getResultList();
		return (ArrayList<Ambulancia>) result;
	}
}
