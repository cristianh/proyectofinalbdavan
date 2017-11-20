package co.edu.avanzada.negocio.beans;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.EntidadHospitalaria;

@LocalBean
@Stateless
public class EspecialidadHospitalEJB {

	@PersistenceContext
	EntityManager entity;

	public void crearEntidadHospitalaria(EntidadHospitalaria entidadHospitalaria) {
		EntidadHospitalaria busquedaEntidadHospitalaria = buscarEntidadHospitalaria(entidadHospitalaria.getIdentidadhospitalaria());
		if (busquedaEntidadHospitalaria == null) {
			entity.persist(entidadHospitalaria);
			System.out.println("EntidadHospitalaria registrada");
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}

	}

	/**
	 * 
	 * @param string
	 * @return
	 */
	public EntidadHospitalaria buscarEntidadHospitalaria(String string) {
		return entity.find(EntidadHospitalaria.class, string);
	}

	/**
	 * 
	 * @param entidadHospitalaria
	 */
	public void editarEntidadHospitalaria(EntidadHospitalaria entidadHospitalaria) {
		entity.merge(entidadHospitalaria);
	}

	public void eliminarEntidadHospitalaria(String idEntidadHospitalaria) {
		EntidadHospitalaria busquedaEntidadHospitalaria = buscarEntidadHospitalaria(idEntidadHospitalaria);
		if (busquedaEntidadHospitalaria != null) {
			entity.remove(idEntidadHospitalaria);
		} else {
			throw new ExcepcionNegocio("Error al borrar la entidadHospitalaria");
		}
	}

}
