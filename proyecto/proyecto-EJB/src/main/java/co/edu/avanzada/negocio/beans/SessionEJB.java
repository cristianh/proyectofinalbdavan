package co.edu.avanzada.negocio.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.eam.ingesoft.persistencia.entidades.LoginUsuario;

@Stateless
@LocalBean
public class SessionEJB {

	@PersistenceContext
	EntityManager manager;
	
	public LoginUsuario consultarUsuarioPorLLave(String user){
		return manager.find(LoginUsuario.class, user);
		
	}
}
