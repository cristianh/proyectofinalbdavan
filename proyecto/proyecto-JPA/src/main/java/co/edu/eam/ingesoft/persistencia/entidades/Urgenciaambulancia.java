package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="t_urgenciaambulancia")
public class Urgenciaambulancia implements Serializable {

	@Id
	private Integer idurgenciaambulacia;
	
	
}
