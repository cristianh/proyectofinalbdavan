package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Funcionario;

public interface IFuncionario {

	public void crearFuncionario(Funcionario funcionario);
	
	public Funcionario buscarFuncionario(String idFuncionario);
	
	public void editarFuncionario(Funcionario funcionario);
	
	public void eliminarFuncionario(String idFuncionario);
	
	public List<Funcionario> listarFuncionario(String codigofuncionario);
}
