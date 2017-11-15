package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.GradocomplejidadHospital;

public interface IgradoComplejidad {

	public void creargrado(GradocomplejidadHospital gradocomplejidad);

	public GradocomplejidadHospital buscarGrado(String igradocomplejidad);
	
	public List<GradocomplejidadHospital> ListarGradocomplejidadhospital();
	
}
