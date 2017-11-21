package co.edu.avanzada.standalone.web.controladores;



import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import co.edu.avanzada.negocio.beans.PersonalEJB;
import co.edu.avanzada.negocio.beans.SessionEJB;
import co.edu.eam.ingesoft.persistencia.entidades.LoginUsuario;




@Named("sessionControler")
@SessionScoped
public class ControladorSession implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private PersonalEJB Personal;
	
	@EJB
	private SessionEJB sessionEJB;
	
	private String user;

	private String password;

	private LoginUsuario usuario;

	

	@PostConstruct
	public void inicializar() {
	
	}

	public String login() {
		LoginUsuario usuarioConsultado = sessionEJB.consultarUsuarioPorLLave(user);
		System.out.println("usuarioConsultado"+usuarioConsultado);
		if (usuarioConsultado == null) {
			Messages.addGlobalError("El usuario o la contraseña son incorrectos");
		} else {
			if (usuarioConsultado.getPassword().equals(password)) {
				usuario = usuarioConsultado;
				return "/paginas/seguro/inicio?faces-redirect=true";

			} else {
				Messages.addGlobalError("El usuario o la contraseña son incorrectos");
			}
		}

		return null;

	}

	public String logout() {

		HttpSession session;
		session = (HttpSession) Faces.getSession();
		session.invalidate();
		usuario = null;

		return "/paginas/publico/login?faces-redirect=true";

	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(LoginUsuario usuario) {
		this.usuario = usuario;
	}

	public PersonalEJB getPersonal() {
		return Personal;
	}

	public void setPersonal(PersonalEJB personal) {
		Personal = personal;
	}

	public SessionEJB getSessionEJB() {
		return sessionEJB;
	}

	public void setSessionEJB(SessionEJB sessionEJB) {
		this.sessionEJB = sessionEJB;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
