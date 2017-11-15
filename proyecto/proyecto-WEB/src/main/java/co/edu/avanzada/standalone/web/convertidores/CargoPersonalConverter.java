package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.CargoPersonalEJB;
import co.edu.eam.ingesoft.persistencia.entidades.CargoPersonal;


@Named
@FacesConverter(value="cargoPersonaConvert")
public class CargoPersonalConverter  implements Converter{
	@EJB
	private CargoPersonalEJB cargopersonalEJB;
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String idcargoPersonal = arg2;
		CargoPersonal cargoPersonal = cargopersonalEJB.buscarCargoPersonal(idcargoPersonal);
		return cargoPersonal;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof CargoPersonal) {
			CargoPersonal cargoPersonal = (CargoPersonal) arg2;
			// Se obtiene el id de la entidad seleccionada
			final String cargoPersonalid = String.valueOf(cargoPersonal.getIdCargoPersonal());

			return cargoPersonalid;
		} else {

			throw new IllegalArgumentException();
		}
	}
}
