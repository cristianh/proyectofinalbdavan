package co.edu.avanzada.standalone.web.convertidores;

import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;

@Named
@FacesConverter(value="ciudadConverter", forClass= Ciudad.class)
public class PersonaConvertir {

}
