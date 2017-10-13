package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_ambulanciaurgencia")
public class Ambulanciaurgencia implements Serializable {
	
	@Id
	private Integer idambulanciaurgencia;
	
	@ManyToOne
	@JoinColumn(name="personalambulancia")
	private Personalambulancia personalambulancia;
	
	@ManyToOne
	@JoinColumn(name="urgenciaambulacia",nullable=false)
	private Urgenciaambulancia urgenciaambulancia;
	
	@ManyToOne
	@JoinColumn(name="ambulanciaid",nullable=false)
	private Ambulancia ambulanciaid;

}
