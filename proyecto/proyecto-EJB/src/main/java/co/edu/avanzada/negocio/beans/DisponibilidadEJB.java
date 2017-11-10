package co.edu.avanzada.negocio.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.benas.remote.IDisponibilidad;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Disponibilidad;

@LocalBean
@Stateless
@Remote(IDisponibilidad.class)
public class DisponibilidadEJB implements IDisponibilidad{
	@PersistenceContext
	private EntityManager manager;

	public void crearDisponibilidad(Disponibilidad disponibilidad) {
		// TODO Auto-generated method stub
		Disponibilidad buscarDisponibilidad = buscarDisponibilidad(disponibilidad.getIdDisponibilidad());
		if (buscarDisponibilidad == null) {
			manager.persist(disponibilidad);
			System.out.println("La disponibilidad se ha creado");
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe registro asociado");
		}
	}

	public Disponibilidad buscarDisponibilidad(String iddisponibilidad) {
		// TODO Auto-generated method stub
		return manager.find(Disponibilidad.class, iddisponibilidad);
	}

	public void editarDisponibilidad(Disponibilidad iddisponibilidad) {
		// TODO Auto-generated method stub
		manager.merge(iddisponibilidad);
	}

	public void eliminarDisponibilidad(String iddisponibilidad) {
		// TODO Auto-generated method stub
		Disponibilidad buscarDisponibilidad = buscarDisponibilidad(iddisponibilidad);
		if (buscarDisponibilidad != null) {
			manager.remove(buscarDisponibilidad);
		} else {
			throw new ExcepcionNegocio("Error al borrar la disponibilidad");
		}
	}

	public List<Disponibilidad> ListarDisponibilidad() {
		List<Disponibilidad> resultadoTransaccion = null;
		try {
			resultadoTransaccion = manager.createNamedQuery("Disponibilidad.listardisponibilidad"). getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
		return resultadoTransaccion;
	}

	public List<Disponibilidad> BuscarListaDisponibilidad(String idDisponibilidad) {
		return null;
	}
}
