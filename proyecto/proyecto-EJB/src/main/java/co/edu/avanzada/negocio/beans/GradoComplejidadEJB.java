package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IgradoComplejidad;
import co.edu.eam.ingesoft.persistencia.entidades.Cama;
import co.edu.eam.ingesoft.persistencia.entidades.GradocomplejidadHospital;


@LocalBean
@Stateless
@Remote(IgradoComplejidad.class)
public class GradoComplejidadEJB implements IgradoComplejidad{

	@PersistenceContext
	EntityManager em;
	
	public void creargrado(GradocomplejidadHospital gradocomplejidad) {
		// TODO Auto-generated method stub
		GradocomplejidadHospital busquedagradocomplejidad = buscarGrado(gradocomplejidad.getIdcomplejidad());
		if (busquedagradocomplejidad == null) {
			em.persist(gradocomplejidad);
			System.out.println("registrada con exito");
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
	}

	public GradocomplejidadHospital buscarGrado(String igradocomplejidad) {
		// TODO Auto-generated method stub
		return em.find(GradocomplejidadHospital.class, igradocomplejidad);
	}

	public List<GradocomplejidadHospital> ListarGradocomplejidadhospital() {
		// TODO Auto-generated method stub
		List<GradocomplejidadHospital> result = null;
		try{
			result = em.createNamedQuery("ComplejidadHospital.listarcomplejidadhospital").getResultList();
			System.out.println(result);			
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return result;
	}

}
