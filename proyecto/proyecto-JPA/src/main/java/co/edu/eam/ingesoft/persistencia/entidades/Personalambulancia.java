package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="t_personaambulancia")
public class Personalambulancia implements Serializable {
	
	@Id
	private Integer idpersonalambulancia;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date horainicioturno;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date horasalidaturno;
	
	@ManyToOne
	@JoinColumn(name="idauxiliar",nullable=false)
	private Funionario idauxiliar;
	
	@ManyToOne
	@JoinColumn(name="idparamedico",nullable=false)
	private Funionario idconductor;
	
	@ManyToOne
	@JoinColumn(name="idmedico",nullable=false)
	private Funionario idmedico;
	
	@OneToMany(mappedBy="personalambulancia")
	private List<Ambulanciaurgencia> ambulanciaurgencia;

}
