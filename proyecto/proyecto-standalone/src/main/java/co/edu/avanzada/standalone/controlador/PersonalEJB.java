package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.benas.remote.IPersonal;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Personal;

@LocalBean
@Stateless
@Remote(IPersonal.class)
public class PersonalEJB implements IPersonal{

	@PersistenceContext
	EntityManager entity;

	/**
	 * 
	 * @param personal
	 */
	public void crearPersonal(Personal personal) {
		Personal busquedaPersonal = buscarPersonal(personal.getIdPersonal());
		if (busquedaPersonal == null) {
			entity.persist(personal);
			System.out.println("Personal registrada");
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
	}

	/**
	 * 
	 * @param idPersonal
	 * @return
	 */
	public Personal buscarPersonal(String idPersonal) {
		return entity.find(Personal.class, idPersonal);
	}

	/**
	 * 
	 * @param personal
	 */
	public void editarPersonal(Personal personal) {
		entity.merge(personal);
	}

	public void eliminarPersonal(String idPersonal) {
		Personal busquedaPersonal = buscarPersonal(idPersonal);
		if (busquedaPersonal != null) {
			entity.remove(idPersonal);
		} else {
			throw new ExcepcionNegocio("Error al borrar la personal");
		}
	}

	public List<Personal> BuscarListaPersonal(String nombre, String cedula ) {
		List<Personal> personal = null;

		try {
			Query resultado = entity.createQuery("SELECT pa FROM Personal pa where pa.nombre=:nombre and pa.cedula=:cedula");
			resultado.setParameter("nombre", nombre);
			resultado.setParameter("cedula", cedula);
			personal = resultado.getResultList();
			return personal;
		} catch (Exception ex) {
			throw new ExcepcionNegocio("No se encuentra una personal con estos parametros de busqueda");
		}

	}

	public List<Personal> listarPersonal() {
		List<Personal> result = entity.createQuery("SELECT per FROM Personal per").getResultList();
		return result;
	}

}
