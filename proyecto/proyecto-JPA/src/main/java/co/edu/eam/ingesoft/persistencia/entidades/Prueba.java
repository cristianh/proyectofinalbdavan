package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Prueba")
public class Prueba implements Serializable {

	@Id
	private String idpersona;
	
	@Column(name="nombre")
	private String nombre;
	
}
