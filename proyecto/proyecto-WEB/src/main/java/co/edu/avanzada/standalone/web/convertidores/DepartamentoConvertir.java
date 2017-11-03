package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.DepartamentoEJB;
import co.edu.eam.ingesoft.persistencia.entidades.*;

@Named
@FacesConverter(value="departamentoConverter", forClass= Departamento.class)
public class DepartamentoConvertir implements Converter{
	
	@EJB
	public DepartamentoEJB departementoEJB;

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String iddepartamento = arg2;
		Departamento departamento = departementoEJB.buscarDepartamento(iddepartamento);
		System.out.println(departamento);
		return departamento;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof Departamento) {
			Departamento departamento = (Departamento) arg2;

			// Se obtiene el id de la entidad seleccionada
			final String departamentoid = String.valueOf(departamento.getId_departamento());
			System.out.println(departamentoid);
			return departamentoid;
		} else {

			throw new IllegalArgumentException();
		}
	}

	

}
