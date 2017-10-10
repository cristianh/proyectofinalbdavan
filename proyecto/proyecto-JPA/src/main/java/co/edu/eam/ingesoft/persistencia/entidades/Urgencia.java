package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_urgencia")
public class Urgencia implements Serializable {

	@Id
	private Integer idurgencia;
	
	@Column(name="descripcion",length=100)
	private String descripcionUrgencia;
	
	@Column(name="nombre",length=50)
	private String nombreurgencia;
}
