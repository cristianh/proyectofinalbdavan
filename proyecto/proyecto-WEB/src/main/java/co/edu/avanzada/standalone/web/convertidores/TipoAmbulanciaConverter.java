package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.TipoAmbulanciaEJB;
import co.edu.eam.ingesoft.persistencia.entidades.TipoAmbulancia;

@Named
@FacesConverter(value="tipoAmbulanciaConverter")
public class TipoAmbulanciaConverter implements Converter{

	@EJB
	private TipoAmbulanciaEJB tipoAmbulanciaEJB;
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String idtipoAmbulancia = arg2;
		TipoAmbulancia tipoAmbulancia = tipoAmbulanciaEJB.buscarTipoAmbulancia(idtipoAmbulancia);
		return tipoAmbulancia;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof TipoAmbulancia) {
			TipoAmbulancia tipoAmbulancia = (TipoAmbulancia) arg2;
			// Se obtiene el id de la entidad seleccionada
			final String tipoAmbulanciaid = String.valueOf(tipoAmbulancia.getIdTipoAmbulancia());

			return tipoAmbulanciaid;
		} else {

			throw new IllegalArgumentException();
		}
	}
	
}
