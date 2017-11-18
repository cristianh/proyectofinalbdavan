package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.benas.remote.IEspecialidad;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;

@LocalBean
@Stateless
@Remote(IEspecialidad.class)
public class EspecialidadEJB implements IEspecialidad {

	@PersistenceContext
	private EntityManager manager;

	public void crearEspecialidad(Especialidad especialidad) {
		// TODO Auto-generated method stub
		Especialidad buscarEspecialidad = buscarEspecialidad(especialidad.getCodigo());
		if (buscarEspecialidad == null) {
			manager.persist(especialidad);
			System.out.println("La especialidad se ha creado");
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe registro asociado");
		}
	}

	public Especialidad buscarEspecialidad(String codigoespecialidad) {
		// TODO Auto-generated method stub
		return manager.find(Especialidad.class, codigoespecialidad);
	}

	public void editarEspecialidad(Especialidad idespecialidad) {
		// TODO Auto-generated method stub
		manager.merge(idespecialidad);
	}

	public void eliminar(String codigoespecialidad) {
		// TODO Auto-generated method stub
		Especialidad buscarEspecialidad = buscarEspecialidad(codigoespecialidad);
		if (buscarEspecialidad != null) {
			manager.remove(buscarEspecialidad);
		} else {
			throw new ExcepcionNegocio("Error al borrar la especialidad");
		}
	}

	public List<Especialidad> ListarEspecialidad() {
		List<Especialidad> resultList = manager.createQuery("Select esp from Especialidad esp where estadoespecialidad='Activa'").getResultList();
		return resultList;
	}

	public List<Especialidad> BuscarListaEspecialidad(String codigoestadoespecialidad) {
		// TODO Auto-generated method stub
		List<Especialidad> especialidad = null;
		try {
			System.out.println("mi salida:" + codigoestadoespecialidad);
			Query resultList = manager.createQuery("Select esp from Especialidad esp where esp.codigo=:numero");
			resultList.setParameter("numero", codigoestadoespecialidad);
			especialidad = resultList.getResultList();
			return especialidad;

		} catch (Exception e) {
			// TODO: handle exception
			throw new ExcepcionNegocio("No se encuentra una especialdad con estos parametros de busqueda");
		}

	}

}
