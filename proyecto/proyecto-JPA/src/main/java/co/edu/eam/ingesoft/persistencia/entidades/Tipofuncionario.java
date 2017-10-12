package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "t_tipofuncionario")
public class Tipofuncionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idfuncionario;

	@Column(name = "cargofuncionario", length = 50)
	private String cargo;

	@Column(name = "nombre", length = 40)
	private String nombre;
}
