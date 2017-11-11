package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.ITipoUrgencia;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;
import co.edu.eam.ingesoft.persistencia.entidades.TipoUrgencia;

@LocalBean
@Stateless
@Remote(ITipoUrgencia.class)
public class TipoUrgenciaEJB implements ITipoUrgencia {

	@PersistenceContext
	EntityManager entity;

	public void crearTipoUrgencia(TipoUrgencia tipoUrgencia) {
		// TODO Auto-generated method stub
		TipoUrgencia busquedaTipoEvento = buscarTipoUrgencia(tipoUrgencia.getIdTipoUrgencia());
		if (busquedaTipoEvento == null) {
			entity.persist(tipoUrgencia);
			System.out.println("TipoUrgencia registrado");
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un Tipo urgencia asociado");
		}
	}

	public TipoUrgencia buscarTipoUrgencia(String idTipoUrgencia) {
		// TODO Auto-generated method stub
		return entity.find(TipoUrgencia.class, idTipoUrgencia);
	}

	public void editarTipoUrgencia(TipoUrgencia tipoUrgencia) {
		// TODO Auto-generated method stub
		entity.merge(tipoUrgencia);
	}

	public void eliminarTipoUrgencia(String idTipoUrgencia) {
		// TODO Auto-generated method stub
		TipoUrgencia busquedaTipoUrgencia = buscarTipoUrgencia(idTipoUrgencia);
		if (busquedaTipoUrgencia != null) {
			entity.remove(idTipoUrgencia);
		} else {
			throw new ExcepcionNegocio("Error al borrar la tipo urgencia");
		}
	}

	public List<TipoUrgencia> listarTipoUrgencia() {
		// TODO Auto-generated method stub
		List<TipoUrgencia> resultadoTransaccion = null;
		try {
			resultadoTransaccion = entity.createNamedQuery("TipoUrgencia.listartipoUrgencia").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
		return resultadoTransaccion;
	}

	public List<TipoUrgencia> BuscarListaTipoUrgencia(String idTipoUrgencia) {
		// TODO Auto-generated method stub
		return null;
	}

}
