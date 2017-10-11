package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_diagnostico")
public class Diagnostico implements Serializable {

	@EmbeddedId
	private DiagnosticopacientePK pk;
	
	@Column(name="gradocomplejidad")
	private Integer gradocomplejidad;
}
