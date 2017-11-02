package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.DiagnosticopacientePK;

@Entity
@Table(name = "t_diagnostico")
public class Diagnostico implements Serializable {

	@EmbeddedId
	private DiagnosticopacientePK pk;

	@ManyToOne
	@JoinColumns({ 
			@JoinColumn(name = "idpersona", referencedColumnName = "id_persona",nullable=false,insertable=false,updatable=false),
			@JoinColumn(name = "idpaciente", referencedColumnName = "id_paciente",nullable=false,insertable=false,updatable=false) })
	private Paciente idpaciente;

	@ManyToOne
	@JoinColumn(name = "idurgenciaembulancia")
	private UrgenciaAmbulancia idurgenciaambulancia;

	@Column(name = "gradocomplejidad")
	private Integer gradocomplejidad;
}
