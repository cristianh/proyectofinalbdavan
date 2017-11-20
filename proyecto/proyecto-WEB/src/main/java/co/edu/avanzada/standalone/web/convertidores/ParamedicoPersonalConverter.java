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
@FacesConverter(value="paramedicoCnverter")
public class ParamedicoPersonalConverter implements Converter {

	@EJB
	private PersonalEJB paramdicoEJB;
	
	
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String paramedico = arg2;
		Personal paramedicoPersonal = paramdicoEJB.buscarPersonal(paramedico);
		return paramedicoPersonal;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof Personal) {
			Personal paramedicoPersonal = (Personal) arg2;
			// Se obtiene el id de la entidad seleccionada
			final String paramedicoPersonalid = String.valueOf(paramedicoPersonal.getIdPersonal());

			return paramedicoPersonalid;
		} else {

			throw new IllegalArgumentException();
		}
	}
	
}
