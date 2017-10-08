package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pacientes")
public class Paciente implements Serializable {

	@Id
	private String idpaciente;
	
	@Column(name="nombre")
	private String nombre;
	
}
