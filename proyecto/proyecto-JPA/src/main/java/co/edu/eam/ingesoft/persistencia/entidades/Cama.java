package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_cama")
public class Cama implements Serializable{

	@Id
	private Integer idcama;
	
	@Column(name="codigo")
	private String codigocama;
	
	@Column(name="estado",length=1)
	private char estadocama;
	

}
