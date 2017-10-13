package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="t_funcionario")
public class Funionario implements Serializable {

	@Id
	private Integer idfuncionario;
	
	@Column(name="codigofuncionario",nullable=false)
	private String codigofuncionario;
	
	@Column(name="salariofuncionario")
	private Double salariofuncionado;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaingreso;
	
	@Column(name="estadofuncionario",nullable=false,length=1)
	private char estadofuncionario;
	
	@ManyToOne
	@JoinColumn(name="tipofuncionario",nullable=false)
	private Tipofuncionario tipofuncionario;
	
	
	@OneToMany(mappedBy="idauxiliar",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Personalambulancia> personalauxiliar;
	
	@OneToMany(mappedBy="idconductor",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Personalambulancia> personalconductor;
	
	@OneToMany(mappedBy="idmedico",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Personalambulancia> personalmedico;
}
