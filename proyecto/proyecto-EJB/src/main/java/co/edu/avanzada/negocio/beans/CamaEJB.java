package co.edu.avanzada.negocio.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.ICama;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Cama;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;

@LocalBean
@Stateless
@Remote(ICama.class)
public class CamaEJB implements ICama {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager entity;

	public void crearCama(Cama cama) {

		try {
			entity.persist(cama);
		} catch (Exception e) {
			// TODO: handle exception
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}

	}

	/**
	 * 
	 * @param string
	 */
	public Cama buscarCama(Integer id) {
		return entity.find(Cama.class, id);
	}

	/**
	 * 
	 * @param cama
	 */
	public void editarCama(Cama cama) {
		entity.merge(cama);
	}

	/**
	 * 
	 * @param idcama
	 */
	public void eliminarCama(Cama idcama) {
		Cama buscarcama = buscarCama(idcama.getIdcama());
		if (buscarcama != null) {
			entity.remove(buscarcama);
		} else {
			throw new ExcepcionNegocio("Error al borrar la especialidad");
		}
	}

	public List<Cama> BuscarListarCamas(Integer idCama) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cama> listarCamas() {
		// TODO Auto-generated method stub
		List<Cama> result = null;
		try {
			result = entity.createNamedQuery("Cama.listarcamas").getResultList();
			System.out.println(result);
		} catch (Exception ex) {
			System.out.println(ex.getMessage().toString());
		}
		return result;
	}
}
