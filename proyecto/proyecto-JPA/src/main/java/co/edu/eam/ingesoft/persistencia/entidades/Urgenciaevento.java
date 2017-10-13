package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "t_urgenciaevento")
public class Urgenciaevento implements Serializable {

	@Id
	private Integer idurgenciaevento;

	@ManyToOne
	@JoinColumn(name = "tipoeventourgencia",nullable=false)
	private Tipoevento tipoevento;

	@Column(name = "descripciourgenciaevento", length = 100)
	private String descripcionurgenciaevento;

	@Column(name = "lugarurgenciaevento", length = 100)
	private String lugarurgenciaevento;

	@Column(name = "estadourgenciaevento", length = 1)
	private char estadourgenciaevento;

	@ManyToOne
	@JoinColumn(name = "idurgencia",nullable=false)
	private Urgencia idurgencia;

	/*@ManyToOne
	@JoinColumn(name = "idoperador")
	private Operador operadorurgencia;*/

	public Urgenciaevento() {
		// TODO Auto-generated constructor stub
	}

	
	
}
