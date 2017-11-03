package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.TipodocumentoEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Departamento;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Tipodocumento;

@Named
@FacesConverter(value = "tipodocumentoConverter", forClass = Tipodocumento.class)
public class tipodocumentoConvertir implements Converter{

	
	@EJB
	private TipodocumentoEJB tipodocumentoEJB;
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null || arg2.trim().length() == 0 || arg2.equals("Seleccione")) {
			return null;
		}

		final String idtipodocumento = arg2;
		Tipodocumento tipodocumento = tipodocumentoEJB.buscarTipodocumento(idtipodocumento);
		return tipodocumento;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof Tipodocumento) {
			Tipodocumento tipodocumento = (Tipodocumento) arg2;

			// Se obtiene el id de la entidad seleccionada
			final String tipodocumentoid = tipodocumento.getIdtipodocumento();

			return tipodocumentoid;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
