package co.edu.avanzada.negocio.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import co.edu.avanzada.negocio.benas.remote.ITipoAmbulancia;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.TipoAmbulancia;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;

@LocalBean
@Stateless
@Remote(ITipoAmbulancia.class)
public class TipoAmbulanciaEJB implements ITipoAmbulancia{

	@PersistenceContext
	private EntityManager manager;

	public void crearTipoAmbulancia(TipoAmbulancia tipoAmbulancia) {
		// TODO Auto-generated method stub
		TipoAmbulancia buscarTipoAmbulancia = buscarTipoAmbulancia(tipoAmbulancia.getIdTipoAmbulancia());
		if (buscarTipoAmbulancia == null) {
			manager.persist(tipoAmbulancia);
			System.out.println("el tipoAmbulancia se ha creado");
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe registro asociado");
		}
	}

	public TipoAmbulancia buscarTipoAmbulancia(String codigotipoAmbulancia) {
		// TODO Auto-generated method stub
		return manager.find(TipoAmbulancia.class, codigotipoAmbulancia);
	}
	

	public void editarTipoAmbulancia(TipoAmbulancia idtipoAmbulancia) {
		// TODO Auto-generated method stub
		manager.merge(idtipoAmbulancia);
	}

	public void eliminarTipoAmbulancia(String codigotipoAmbulancia) {
		// TODO Auto-generated method stub
		TipoAmbulancia buscarTipoAmbulancia = buscarTipoAmbulancia(codigotipoAmbulancia);
		if (buscarTipoAmbulancia != null) {
			manager.remove(buscarTipoAmbulancia);
		} else {
			throw new ExcepcionNegocio("Error al borrar la tipoAmbulancia");
		}
	}

	public List<TipoAmbulancia> ListarTipoAmbulancia() {
		List<TipoAmbulancia> resultadoTransaccion = null;
		try {
			resultadoTransaccion = manager.createNamedQuery("TipoAmbulancia.listartipoAmbulancia").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
		return resultadoTransaccion;
	}

	public List<TipoAmbulancia> BuscarListaTipoAmbulancia(String idTipoAmbulancia) {
		return null;
	}

}
