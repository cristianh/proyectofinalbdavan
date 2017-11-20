package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.GradoComplejidadEJB;
import co.edu.avanzada.negocio.beans.TipoCentroMedicoEJB;
import co.edu.eam.ingesoft.persistencia.entidades.GradocomplejidadHospital;
import co.edu.eam.ingesoft.persistencia.entidades.TipoAmbulancia;
import co.edu.eam.ingesoft.persistencia.entidades.TipoCentroMedico;

@Named
@FacesConverter(value="complejidadConverter")
public class ComplejidadCMconverter implements Converter{

	@EJB
	private GradoComplejidadEJB gradocomplejidadEJB;
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		if (value == null
				|| value.trim().length() == 0
				|| value.equals("Seleccione")) {
			return null;
		}

		final String idgradocomplejidad = value;
		GradocomplejidadHospital gradocomplejidadhospital = gradocomplejidadEJB.buscarGrado(idgradocomplejidad);
		return gradocomplejidadhospital;
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		if (value == null) {
			return null;
		}
		if (value instanceof GradocomplejidadHospital) {
			GradocomplejidadHospital gradocomplejidad = (GradocomplejidadHospital) value;
			// Se obtiene el id de la entidad seleccionada
			final String gradocomplejidadid = gradocomplejidad.getIdcomplejidad();

			return gradocomplejidadid;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
