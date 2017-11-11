package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;


import co.edu.avanzada.negocio.beans.TipoUrgenciaEJB;
import co.edu.eam.ingesoft.persistencia.entidades.TipoUrgencia;


@Named
@FacesConverter(value="reporteurgenciaConverter", forClass= TipoUrgenciaEJB.class)
public class tipourgenciareporteConverter implements Converter{

	@EJB
	private TipoUrgenciaEJB tipoUrgenciaEJB;
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		if (value == null
				|| value.trim().length() == 0
				|| value.equals("Seleccione")) {
			return null;
		}

		final String idtipourgencia = value;
		TipoUrgencia tipourgencia = tipoUrgenciaEJB.buscarTipoUrgencia(idtipourgencia);
		return tipourgencia;
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		if (value == null) {
			return null;
		}
		if (value instanceof TipoUrgencia) {
			TipoUrgencia tipourgencia = (TipoUrgencia) value;

			// Se obtiene el id de la entidad seleccionada
			final String codigotipourgencia = String.valueOf(tipourgencia.getIdTipoUrgencia());

			return codigotipourgencia;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
