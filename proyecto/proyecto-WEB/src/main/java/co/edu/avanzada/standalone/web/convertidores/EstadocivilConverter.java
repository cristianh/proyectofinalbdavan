package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.EstadocivilEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Estadocivil;

@Named
@FacesConverter(value="estadocivilConverter", forClass= Estadocivil.class)
public class EstadocivilConverter implements Converter {

	@EJB
	private EstadocivilEJB estadocivilEJB;
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String idestadocivil = arg2;
		Estadocivil estadocivil = estadocivilEJB.buscarEstadocivil(idestadocivil);
		return estadocivil;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof Estadocivil) {
			Estadocivil estadocivil = (Estadocivil) arg2;

			// Se obtiene el id de la entidad seleccionada
			final String Estadocivilid = estadocivil.getIdestadocivil();

			return Estadocivilid;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
