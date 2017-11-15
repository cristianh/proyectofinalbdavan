package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.EstadoPersonalEJB;
import co.edu.eam.ingesoft.persistencia.entidades.EstadoPersonal;

@Named
@FacesConverter(value="estadoPersonaConvert")
public class EstadoPersonalConverter implements Converter{

	@EJB
	private EstadoPersonalEJB estadoPersonalEJB;
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String idestadoPersonal = arg2;
		EstadoPersonal estadoPersonal = estadoPersonalEJB.buscarEstadoPersonal(idestadoPersonal);
		return estadoPersonal;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof EstadoPersonal) {
			EstadoPersonal estadoPersonal = (EstadoPersonal) arg2;
			// Se obtiene el id de la entidad seleccionada
			final String estadoPersonalid = String.valueOf(estadoPersonal.getIdEstadoPersonal());

			return estadoPersonalid;
		} else {

			throw new IllegalArgumentException();
		}
	}
}
