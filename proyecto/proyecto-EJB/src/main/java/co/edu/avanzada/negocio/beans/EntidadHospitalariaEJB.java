package co.edu.avanzada.negocio.beans;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IEntidadHospitalaria;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.EntidadHospitalaria;

@LocalBean
@Stateless
@Remote (IEntidadHospitalaria.class)
public class EntidadHospitalariaEJB implements IEntidadHospitalaria{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	EntityManager entity;
	
	public void crearEntidadHospitalaria(EntidadHospitalaria entidadHospitalaria){
		
		try {
			entity.persist(entidadHospitalaria);
		} catch (Exception e) {
			// TODO: handle exception
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio(e.getMessage().toString());
		}
	}
	
	/**
	 * 
	 * @param idEntidadHospitalaria
	 * @return
	 */
	public EntidadHospitalaria buscarEntidadHospitalaria(String idEntidadHospitalaria){
		return entity.find(EntidadHospitalaria.class, idEntidadHospitalaria);
	}

	/**
	 * 
	 * @param entidadHospitalaria
	 */
	public void editarEntidadHospitalaria(EntidadHospitalaria entidadHospitalaria){
		entity.merge(entidadHospitalaria);
	}
	

	public void eliminarEntidadHospitalaria(String idEntidadHospitalaria) {
		// TODO Auto-generated method stub
		EntidadHospitalaria busquedaEntidadHospitalaria = buscarEntidadHospitalaria(idEntidadHospitalaria);
		if(busquedaEntidadHospitalaria != null){
			entity.remove(idEntidadHospitalaria);
		}else{
			throw new ExcepcionNegocio("Error al borrar la entidadHospitalaria");
		}
	}

	
	

}
