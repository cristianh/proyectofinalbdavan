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
@FacesConverter(value="auxiliarConverter")
public class AuxiliarPersonalConverter implements Converter {

	@EJB
	private PersonalEJB personalEJB;
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String auxiliar = arg2;
		Personal auxiliarPersonal = personalEJB.buscarPersonal(auxiliar);
		return auxiliarPersonal;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof Personal) {
			Personal auxiliarPersonal = (Personal) arg2;
			// Se obtiene el id de la entidad seleccionada
			final String auxiliarPersonalid = String.valueOf(auxiliarPersonal.getIdPersonal());

			return auxiliarPersonalid;
		} else {

			throw new IllegalArgumentException();
		}
	}
}
