package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.GeneroEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;
import co.edu.eam.ingesoft.persistencia.entidades.Genero;

@Named
@FacesConverter(value="generoConverter", forClass= Genero.class)
public class GeneroConverter implements Converter{

	@EJB
	private GeneroEJB generoEJB;
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String idgenero = arg2;
		Genero genero = generoEJB.buscarGenero(idgenero);
		return genero;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof Genero) {
			Genero genero = (Genero) arg2;
			// Se obtiene el id de la entidad seleccionada
			final String generoid = String.valueOf(genero.getIdgenero());

			return generoid;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
