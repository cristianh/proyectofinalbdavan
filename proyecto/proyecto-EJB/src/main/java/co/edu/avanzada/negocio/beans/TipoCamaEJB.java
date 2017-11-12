package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.ITipoCama;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;
import co.edu.eam.ingesoft.persistencia.entidades.TipoCama;
import co.edu.eam.ingesoft.persistencia.entidades.TipoFuncionario;

@LocalBean
@Stateless
@Remote(ITipoCama.class)
public class TipoCamaEJB implements ITipoCama {

	@PersistenceContext
	EntityManager em;

	public void crearTipocama(TipoCama tipocama) {
		// TODO Auto-generated method stub
		TipoCama busquedaTipoCama = buscarTipocama(tipocama.getIdtipocama());
		if (busquedaTipoCama == null) {
			em.persist(tipocama);
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
	}

	public TipoCama buscarTipocama(String codigotipocama) {
		// TODO Auto-generated method stub
		return em.find(TipoCama.class, codigotipocama);
	}

	public List<TipoCama> ListarTipocama() {
		// TODO Auto-generated method stub
		List<TipoCama> resultList = em.createQuery("Select tc from TipoCama tc").getResultList();
		return resultList;
	}

	
}
