package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="t_urgenciaambulancia")
public class Urgenciaambulancia implements Serializable {

	@Id
	private Integer idurgenciaambulacia;
	
	@OneToMany(mappedBy="urgenciaambulancia")
	private List<Ambulanciaurgencia> ambulanciaurgencia;
	
	/*@ManyToOne
	@JoinColumn(name="acompananteurgenciaambulancia")
	private Acompanante acompananteid;*/
	
	@ManyToOne
	@JoinColumn(name="entidadhospitalariaenvento",nullable=false)
	private Entidadhospitalaria entidadhospitalaria;
	
	
}
