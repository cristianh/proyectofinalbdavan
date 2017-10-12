package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Especialidadhospital implements Serializable {

	@Id
	private Integer idespecialidadhospital;
	
	@ManyToOne
	@JoinColumn(name="especalidadhospital",insertable=false,updatable=false)
	private Especialidad especialidad;
	
	@ManyToOne
	@JoinColumn(name="especalidadhospital")
	private Entidadhospitalaria entidadhospitalaria;
}
