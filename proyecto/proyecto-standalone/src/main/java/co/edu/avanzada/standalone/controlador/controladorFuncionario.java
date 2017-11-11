package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IEspecialidad;
import co.edu.avanzada.negocio.benas.remote.IFuncionario;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;
import co.edu.eam.ingesoft.persistencia.entidades.Funcionario;

public class controladorFuncionario {
	
	public IFuncionario ifuncionario;
	
	public controladorFuncionario() throws NamingException{
		// TODO Auto-generated constructor stub
		ifuncionario = (IFuncionario) ServiceLocator.buscarEJB("FuncionarioEJB", IFuncionario.class.getCanonicalName());
	}

	
	public void crearFuncionario(Funcionario funcionario) {
		ifuncionario.crearFuncionario(funcionario);
	}

	public Funcionario buscarFuncionario(String codigofuncionario) {
		return ifuncionario.buscarFuncionario(codigofuncionario);
	}
	
	public void eliminarFuncionario(String codigofuncionario) {
		ifuncionario.eliminarFuncionario(codigofuncionario);
	}
	
	public List<Funcionario> listarfuncionario(String codigofuncionario){
		return ifuncionario.listarFuncionario(codigofuncionario);
	}

}
