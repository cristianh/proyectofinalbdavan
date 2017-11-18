package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.EpsEJB;
import co.edu.avanzada.negocio.beans.EspecialidadEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;

@Named
@FacesConverter(value = "especialidadConverter", forClass = Especialidad.class)
public class EspecialidadConverter implements Converter{

	@EJB
	public EspecialidadEJB especialidadEJB;
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		if (value == null || value.trim().length() == 0 || value.equals("Seleccione")) {
			return null;
		}

		final String idespecialidad = value;
		Especialidad especialidad = especialidadEJB.buscarEspecialidad(idespecialidad);
		return especialidad;
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		if (value == null) {
			return null;
		}
		if (value instanceof Especialidad) {
			Especialidad especialidad = (Especialidad) value;

			// Se obtiene el id de la entidad seleccionada
			final String especialidadid = especialidad.getCodigo();
			return especialidadid;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
