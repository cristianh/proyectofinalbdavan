import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.EpsEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;

@ViewScoped
@Named("controladorEps")
public class Controladoreps implements Serializable{
	
	@EJB
	private EpsEJB epsejb;
	
	private String ideps;
	
	private String nombre;
	
	@PostConstruct
	public void initializar() {
		
	}

	public EpsEJB getEpsejb() {
		return epsejb;
	}

	public void setEpsejb(EpsEJB epsejb) {
		this.epsejb = epsejb;
	}

	public String getIdeps() {
		return ideps;
	}

	public void setIdeps(String ideps) {
		this.ideps = ideps;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void crearEps() {	
		Eps eps = new Eps(getIdeps(),getNombre());
		
		try {
			epsejb.crearEps(eps);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Eps creada",null));
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,e.getMessage().toString(),null));
		}
	}
	
	

}
