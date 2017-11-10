package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.DisponibilidadEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Disponibilidad;

@Named
@FacesConverter(value="disponibilidadConvert")
public class DisponibilidadConverter implements Converter {

	@EJB
	private DisponibilidadEJB disponibleEJB;
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String iddisponibilidad = arg2;
		Disponibilidad disponibilidad = disponibleEJB.buscarDisponibilidad(iddisponibilidad);
		return disponibilidad;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof Disponibilidad) {
			Disponibilidad disponibilidad = (Disponibilidad) arg2;
			// Se obtiene el id de la entidad seleccionada
			final String disponibilidadid = String.valueOf(disponibilidad.getIdDisponibilidad());

			return disponibilidadid;
		} else {

			throw new IllegalArgumentException();
		}
	}
	
}
