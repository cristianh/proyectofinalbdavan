package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="t_enviarAtencionUrgencia")

@NamedNativeQueries({ @NamedNativeQuery(name = "EnviarAtencionUrgencia.listarEnviarAtencionUrgencia",
query = "SELECT * FROM t_enviarAtencionUrgencia",resultClass=Ambulancia.class),
	@NamedNativeQuery(name = "EnviarAtencionUrgencia.listarbuscarEnviarAtencionUrgencia",
	query = "SELECT * FROM t_enviarAtencionUrgencia  where idatencionS=:estado",resultClass=Ambulancia.class) })
 
public class EnviarAtencionUrgencia implements Serializable{

	@Id 
	@Column(name="idatencion")
	private String idatencion;
	
	
}
