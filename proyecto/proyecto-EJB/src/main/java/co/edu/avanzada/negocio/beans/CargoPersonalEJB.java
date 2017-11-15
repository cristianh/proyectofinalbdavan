package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.benas.remote.ICargoPersonal;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.CargoPersonal;

@LocalBean
@Stateless
@Remote(ICargoPersonal.class)
public class CargoPersonalEJB implements ICargoPersonal {

	@PersistenceContext
	EntityManager entity;

	/**
	 * 
	 * @param cargoPersonal
	 */
	public void crearCargoPersonal(CargoPersonal cargoPersonal) {
		CargoPersonal busquedaCargoPersonal = buscarCargoPersonal(cargoPersonal.getIdCargoPersonal());
		if (busquedaCargoPersonal == null) {
			entity.persist(cargoPersonal);
			System.out.println("CargoPersonal registrada");
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
	}

	/**
	 * 
	 * @param idCargoPersonal
	 * @return
	 */
	public CargoPersonal buscarCargoPersonal(String idCargoPersonal) {
		return entity.find(CargoPersonal.class, idCargoPersonal);
	}

	/**
	 * 
	 * @param cargoPersonal
	 */
	public void editarCargoPersonal(CargoPersonal cargoPersonal) {
		entity.merge(cargoPersonal);
	}

	public void eliminarCargoPersonal(String idCargoPersonal) {
		CargoPersonal busquedaCargoPersonal = buscarCargoPersonal(idCargoPersonal);
		if (busquedaCargoPersonal != null) {
			entity.remove(idCargoPersonal);
		} else {
			throw new ExcepcionNegocio("Error al borrar la cargoPersonal");
		}
	}

	public List<CargoPersonal> BuscarListaCargoPersonal(String idCargoPersonal) {
		List<CargoPersonal> cargoPersonal = null;

		try {
			Query resultado = entity
					.createQuery("SELECT cpp FROM CargoPersonal cpp where idCargoPersonalcargoPersonal=:estado");
			resultado.setParameter("estado", idCargoPersonal);
			cargoPersonal = resultado.getResultList();
			return cargoPersonal;
		} catch (Exception ex) {
			throw new ExcepcionNegocio("No se encuentra una cargoPersonal con estos parametros de busqueda");
		}

	}

	public List<CargoPersonal> listarCargoPersonal() {
		List<CargoPersonal> result = entity.createQuery("SELECT cpp FROM CargoPersonal cpp").getResultList();
		return result;
	}

}
