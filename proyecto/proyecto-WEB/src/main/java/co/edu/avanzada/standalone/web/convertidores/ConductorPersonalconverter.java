package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.PersonalEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Personal;



@Named
@FacesConverter(value="conductorConverter")
public class ConductorPersonalconverter implements Converter{

	@EJB
	private PersonalEJB conductorEJB;
	
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String conductor = arg2;
		Personal conductorPersonal = conductorEJB.buscarPersonal(conductor);
		return conductorPersonal;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof Personal) {
			Personal conductorPersonal = (Personal) arg2;
			// Se obtiene el id de la entidad seleccionada
			final String conductorPersonalid = String.valueOf(conductorPersonal.getIdPersonal());

			return conductorPersonalid;
		} else {

			throw new IllegalArgumentException();
		}
	}
}
