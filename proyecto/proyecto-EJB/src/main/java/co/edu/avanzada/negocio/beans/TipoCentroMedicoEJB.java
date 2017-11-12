package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.ITipoCentroMedico;
import co.edu.eam.ingesoft.persistencia.entidades.Cama;
import co.edu.eam.ingesoft.persistencia.entidades.TipoCama;
import co.edu.eam.ingesoft.persistencia.entidades.TipoCentroMedico;

@LocalBean
@Stateless
@Remote(ITipoCentroMedico.class)
public class TipoCentroMedicoEJB implements ITipoCentroMedico {

	@PersistenceContext
	EntityManager em;
	
	public void crearTipocentromedico(TipoCentroMedico tipocentromedico) {
		// TODO Auto-generated method stub
		TipoCentroMedico busquedatipoCentromedico = buscarTipocentromedico(tipocentromedico.getIdtipoCentromedico());
		if (busquedatipoCentromedico == null) {
			em.persist(tipocentromedico);
			System.out.println("cama registrada con exito");
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}

	public TipoCentroMedico buscarTipocentromedico(String codigotipocentromedico) {
		// TODO Auto-generated method stub
		return em.find(TipoCentroMedico.class, codigotipocentromedico);
	}

	public List<TipoCentroMedico> ListarTipocentromedico() {
		// TODO Auto-generated method stub
		List<TipoCentroMedico> resultList = em.createQuery("Select tpc  from TipoCentroMedico tpc").getResultList();
		return resultList;
	}

}
