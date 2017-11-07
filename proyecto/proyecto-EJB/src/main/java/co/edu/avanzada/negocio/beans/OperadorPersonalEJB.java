package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IOperadorPersonal;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.OperadorPersonal;

@LocalBean
@Stateless
@Remote(IOperadorPersonal.class)
public class OperadorPersonalEJB {

	@PersistenceContext
	private EntityManager em;
	
public void crearOperadorPersonal(OperadorPersonal operadorPersonal) {
		
		OperadorPersonal buscoperadorPersonal = buscarOperadorPersonal(operadorPersonal.getIdpersonal());
		// no existe, se puede crear...
		if (buscoperadorPersonal == null) {
			em.persist(operadorPersonal);
		} else {
			throw new ExcepcionNegocio("Ya existe este Cliente");
		}
	}

	public OperadorPersonal buscarOperadorPersonal(Integer idoperador) {
		return em.find(OperadorPersonal.class, idoperador);
	}

	public void editarOperadorPersonal(OperadorPersonal operadorPersonal) {
		em.merge(operadorPersonal);

	}

	public void eliminar(Integer idoperador) {
		OperadorPersonal busqOperadorPersonal = buscarOperadorPersonal(idoperador);
		if (busqOperadorPersonal != null) {
			em.remove(idoperador);
		} else {
			throw new ExcepcionNegocio("Error al borrar la operadorPersonal");
		}

	}

	public List<OperadorPersonal> ListarOperadorPersonals() {
		List<OperadorPersonal> resultadoTransaccion = null;
		try {
			resultadoTransaccion = em.createNamedQuery("OperadorPersonal.listaroperadorPersonal").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
		return resultadoTransaccion;
	}

	public List<OperadorPersonal> BuscarListaOperadorPersonals(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

}

