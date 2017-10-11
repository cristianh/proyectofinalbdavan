package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Especialidahospital implements Serializable {

	@Id
	private Integer especialidadhospital;
}
