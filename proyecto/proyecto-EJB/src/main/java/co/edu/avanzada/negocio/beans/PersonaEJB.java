package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IPersonaremote;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;

import co.edu.eam.ingesoft.persistencia.entidades.Persona;

@LocalBean
@Stateless
@Remote(IPersonaremote.class)
public class PersonaEJB implements IPersonaremote{

	@PersistenceContext
	private EntityManager em;

	public void crearPersona(Persona persona) {
		// TODO Auto-generated method stub
		Persona buscpersona = buscarPersona(persona.getNumeroDocumento());
		// no existe, se puede crear...
		if (buscpersona == null) {
			em.persist(persona);
		} else {
			throw new ExcepcionNegocio("Ya existe este Cliente");
		}
	}

	public Persona buscarPersona(String cedula) {
		// TODO Auto-generated method stub
		return em.find(Persona.class, cedula);
	}

	public void editarPersona(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	public List<Persona> ListarPerosonas() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Persona> BuscarListaPersonas(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}
