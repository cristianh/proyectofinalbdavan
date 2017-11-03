package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.EpsEJB;
import co.edu.eam.ingesoft.persistencia.entidades.*;

@Named
@FacesConverter(value = "epsConverter", forClass = Eps.class)
public class EpsConverter implements Converter {

	@EJB
	public EpsEJB epsEJB;

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null || arg2.trim().length() == 0 || arg2.equals("Seleccione")) {
			return null;
		}

		final String ideps = arg2;
		Eps eps = epsEJB.buscarEps(ideps);
		return eps;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof Eps) {
			Eps eps = (Eps) arg2;

			// Se obtiene el id de la entidad seleccionada
			final String epsid = eps.getIdeps();
			return epsid;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
