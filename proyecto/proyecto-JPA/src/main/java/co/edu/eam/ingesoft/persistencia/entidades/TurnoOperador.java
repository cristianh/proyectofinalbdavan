package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import co.edu.eam.ingesoft.persistencia.entidades.PK.TurnoOperadorPK;

@Entity
@Table(name="t_operadorturno")
public class TurnoOperador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private TurnoOperadorPK turnooperadorPK;
}
