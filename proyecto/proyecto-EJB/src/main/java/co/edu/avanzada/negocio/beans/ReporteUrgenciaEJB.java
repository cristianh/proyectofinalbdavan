package co.edu.avanzada.negocio.beans;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.benas.remote.IReporteUrgencia;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;
import co.edu.eam.ingesoft.persistencia.entidades.ReporteUrgencia;

@LocalBean
@Stateless
@Remote(IReporteUrgencia.class)
public class ReporteUrgenciaEJB implements IReporteUrgencia
{

	@PersistenceContext
	EntityManager em;
	
	public void crearReporteUrgencia(ReporteUrgencia reporteUrgencia) {
		// TODO Auto-generated method stub
		em.persist(reporteUrgencia);
	}

	public ReporteUrgencia buscarreporteUrgencia(String idUrgencia) {
		// TODO Auto-generated method stub
		return em.find(ReporteUrgencia.class, idUrgencia);
	}

	public void editarreporteurgencias(ReporteUrgencia reporteUrgencia) {
		// TODO Auto-generated method stub
		em.merge(reporteUrgencia);
	}

	public void eliminar(String idUrgencia) {
		// TODO Auto-generated method stub
		ReporteUrgencia busqreporte = buscarreporteUrgencia(idUrgencia);
		if (busqreporte != null) {
			em.remove(idUrgencia);
		} else {
			throw new ExcepcionNegocio("Error al borrar la persona");
		}
	}

	public List<ReporteUrgencia> ListarreporteUrgencias() {
		// TODO Auto-generated method stub
		List<ReporteUrgencia> resultadoTransaccion = null;
		try {
			resultadoTransaccion = em.createNamedQuery("ReporteUrgencia.listarpersonas").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
		return resultadoTransaccion;
	}

	public List<ReporteUrgencia> BuscarListaUrgencias(String idUrgencia) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ReporteUrgencia> listarreporteUrgenciasOrdenado() {
		// TODO Auto-generated method stub
		List<ReporteUrgencia> resultadoTransaccion = null;
		try {
			resultadoTransaccion = em.createNamedQuery("ReporteUrgencia.listarordenar").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
		return resultadoTransaccion;
	}
	
	public ArrayList<ReporteUrgencia> reporteUrgencia(){
		/*Query resultado = em.createNamedQuery("ReporteUrgencia.reporte");
		resultado.setParameter("ano", fecha);
		ArrayList<ReporteUrgencia> result = (ArrayList<ReporteUrgencia>) resultado.getResultList();
		return result;*
		/*Query resultado = em.createNamedQuery("ReporteUrgencia.reporte");
		resultado.setParameter("ano","2017");
		ArrayList<ReporteUrgencia> result = (ArrayList<ReporteUrgencia>) resultado.getResultList();
		System.out.println(result);
		return  result;*/
		ArrayList<ReporteUrgencia> result = (ArrayList<ReporteUrgencia>) em.createNamedQuery("ReporteUrgencia.listarreporte").getResultList();
		return (ArrayList<ReporteUrgencia>) result;
	}

}
