package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IPersonaremote;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;

public class controladorPersona {

	private IPersonaremote ipersona;

	public controladorPersona() throws NamingException {
		// TODO Auto-generated constructor stub
		ipersona = (IPersonaremote) ServiceLocator.buscarEJB("PersonaEJB", IPersonaremote.class.getCanonicalName());
	}

	public void crearCliente(Persona persona) {
		ipersona.crearPersona(persona);
	}

}
