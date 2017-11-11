package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IPersonaremote;
import co.edu.avanzada.negocio.benas.remote.ITipoFuncionario;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;
import co.edu.eam.ingesoft.persistencia.entidades.TipoFuncionario;

public class controladorTipofuncionario {

	private ITipoFuncionario itipofuncionario;
	
	public controladorTipofuncionario() throws NamingException{
		// TODO Auto-generated constructor stub
		itipofuncionario = (ITipoFuncionario) ServiceLocator.buscarEJB("TipoFuncionarioEJB", ITipoFuncionario.class.getCanonicalName());
	}
	
	

	public void crearTipofuncionario(TipoFuncionario tipofuncionario) {
		itipofuncionario.crearTipoFuncionario(tipofuncionario);
	}
	
	public TipoFuncionario buscartipofuncionario(String codigotipofuncionario) {
		return itipofuncionario.buscarTipoFuncionario(codigotipofuncionario);
	}
	
	public List<TipoFuncionario> listartipofuncionario(String codigofuncionario){
		return itipofuncionario.listarTipoFuncionario(codigofuncionario);
	}
}
