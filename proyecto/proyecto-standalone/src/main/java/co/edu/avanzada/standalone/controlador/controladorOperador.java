package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IOperadorPersonal;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.OperadorPersonal;

public class controladorOperador {

	private IOperadorPersonal ioperadorPersona;
	
	public controladorOperador() throws NamingException {
		// TODO Auto-generated constructor stub
		ioperadorPersona = (IOperadorPersonal) ServiceLocator.buscarEJB("OperardorPersonalEJB", IOperadorPersonal.class.getCanonicalName());
	}

	public void crearOperardorPersona(OperadorPersonal operardorPersonal) {
		ioperadorPersona.crearOperadorPersonal(operardorPersonal);
	}
	
	public OperadorPersonal buscarOperardorPersona(Integer idOperadorPersonal) {
		return ioperadorPersona.buscarOperadorPersonal(idOperadorPersonal);
	}
	
	public List<OperadorPersonal> listaroperardorPersonas(){
		return ioperadorPersona.ListarOperadorPersonals();
	}
}
