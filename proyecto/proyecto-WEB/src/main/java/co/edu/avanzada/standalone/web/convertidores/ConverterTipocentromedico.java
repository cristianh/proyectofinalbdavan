package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.TipoAmbulanciaEJB;
import co.edu.avanzada.negocio.beans.TipoCentroMedicoEJB;
import co.edu.eam.ingesoft.persistencia.entidades.TipoAmbulancia;
import co.edu.eam.ingesoft.persistencia.entidades.TipoCentroMedico;

@Named
@FacesConverter(value="tipoCentroMedicoConverter")
public class ConverterTipocentromedico implements Converter{

	@EJB
	private TipoCentroMedicoEJB tipoCentroMedicoEJB;
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		if (value == null
				|| value.trim().length() == 0
				|| value.equals("Seleccione")) {
			return null;
		}

		final String idtipocentromedico = value;
		TipoCentroMedico tipoAmbulancia = tipoCentroMedicoEJB.buscarTipocentromedico(idtipocentromedico);
		return tipoAmbulancia;
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		if (value == null) {
			return null;
		}
		if (value instanceof TipoCentroMedico) {
			TipoCentroMedico tipocentromedico = (TipoCentroMedico) value;
			// Se obtiene el id de la entidad seleccionada
			final String tipocentromedicoid = tipocentromedico.getIdtipoCentromedico();

			return tipocentromedicoid;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
