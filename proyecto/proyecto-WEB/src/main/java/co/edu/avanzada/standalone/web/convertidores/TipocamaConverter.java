package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.CamaEJB;
import co.edu.avanzada.negocio.beans.CiudadEJB;
import co.edu.avanzada.negocio.beans.TipoCamaEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Cama;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;
import co.edu.eam.ingesoft.persistencia.entidades.TipoCama;


@Named
@FacesConverter(value="tipocamaConverter", forClass= TipoCama.class)
public class TipocamaConverter implements Converter{
	
	@EJB
	private TipoCamaEJB tipocamaejb;
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		if (value == null
				|| value.trim().length() == 0
				|| value.equals("Seleccione")) {
			return null;
		}

		final String idtipocama = value;
		TipoCama tipocama = tipocamaejb.buscarTipocama(String.valueOf(idtipocama));
		return tipocama;
	}

	public String getAsString(FacesContext context, UIComponent component, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof TipoCama) {
			TipoCama tipocama = (TipoCama) arg2;

			// Se obtiene el id de la entidad seleccionada
			final String idcama = String.valueOf(tipocama.getIdtipocama());

			return idcama;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
