package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IUrgencia;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Urgencia;

@LocalBean
@Stateless
@Remote(IUrgencia.class)
public class UrgenciaEJB implements IUrgencia{

	
	@PersistenceContext
	private EntityManager em;
	
	public void crearUrgencia(Urgencia urgencia) {
		// TODO Auto-generated method stub
		Urgencia buscurgencia = buscarUrgencia(urgencia.getIdurgencia());
		// no existe, se puede crear...
		if (buscurgencia == null) {
			em.persist(urgencia);
		} else {
			throw new ExcepcionNegocio("Ya existe esta urgencia");
		}
	}

	public Urgencia buscarUrgencia(String codigoreporteurgencia) {
		// TODO Auto-generated method stub
		return em.find(Urgencia.class, codigoreporteurgencia);
	}

	public void editarUrgencia(Urgencia urgencia) {
		// TODO Auto-generated method stub
		em.merge(urgencia);

	}

	public void eliminarUrgencia(String codigoreporteurgencia) {
		// TODO Auto-generated method stub
		Urgencia busqUrgencia = buscarUrgencia(codigoreporteurgencia);
		if (busqUrgencia != null) {
			em.remove(codigoreporteurgencia);
		} else {
			throw new ExcepcionNegocio("Error al borrar la urgencia");
		}
	}

	public List<Urgencia> listarUrgencia() {
		// TODO Auto-generated method stub
		List<Urgencia> resultadoTransaccion = null;
		try {
			resultadoTransaccion = em.createNamedQuery("ReporteUrgencia.listarreportesurgencia").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
		return resultadoTransaccion;
	}

	public List<Urgencia> BuscarListaUrgencias(Integer idUrgencia) {
		// TODO Auto-generated method stub
		return null;
	}

}
