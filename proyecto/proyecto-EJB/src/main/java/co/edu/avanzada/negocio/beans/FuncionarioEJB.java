package co.edu.avanzada.negocio.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IFuncionario;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Funcionario;

@LocalBean
@Stateless
@Remote(IFuncionario.class)
public class FuncionarioEJB implements IFuncionario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager entity;

	public void editarFuncionario(Funcionario funcionario) {
		entity.merge(funcionario);
	}

	public void eliminarFuncionario(String idFuncionario) {
		Funcionario busqFuncionario = buscarFuncionario(idFuncionario);

		if (busqFuncionario != null) {
			entity.remove(idFuncionario);
			System.out.println("Funcionario eliminado con exito");
		} else {
			throw new ExcepcionNegocio("Error al borrar el funcionario");
		}
	}

	public void crearFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		Funcionario busquedaFuncionario = buscarFuncionario(String.valueOf(funcionario.getIdfuncionario()));
		if (busquedaFuncionario == null) {
			entity.persist(funcionario);
		}
		else
		{
			throw new ExcepcionNegocio("Ya existe este Cliente");
		}
		
	}

	public Funcionario buscarFuncionario(String idFuncionario) {
		// TODO Auto-generated method stub
		return entity.find(Funcionario.class, idFuncionario);
	}


	public List<Funcionario> listarFuncionario(String codigofuncionario) {
		// TODO Auto-generated method stub
		return null;
	}

}
