package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="t_ciudad")
public class Ciudad implements Serializable {

	@Id
	private Integer idciudad;
	
	@Column(name="nombre",length=20,nullable=false)
	private String nombreciudad;
	
	@Column(name="descripcion",length=20)
	private String descripcionciudad;
	
	@ManyToOne
	@JoinColumn(name = "departamento_id", nullable = false)
	private Departamento departamento;

}
