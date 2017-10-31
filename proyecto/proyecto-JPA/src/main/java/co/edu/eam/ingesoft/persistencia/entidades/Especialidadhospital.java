package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.AcompañantepersonaPK;
import co.edu.eam.ingesoft.persistencia.entidades.PK.EspecialidadhospitalPK;

@Entity
@Table(name="t_especialidadhospital")
public class Especialidadhospital implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	@EmbeddedId
	private  EspecialidadhospitalPK especialidadPK;
	

	@ManyToOne
	@JoinColumn(name="Especialidadid",insertable=false,updatable=false,nullable=false)
	private Especialidad especialidad;
	
	@ManyToOne
	@JoinColumn(name="entidadhospitalaria",insertable=false,updatable=false,nullable=false)
	private  EntidadHospitalaria hospital;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especialidad == null) ? 0 : especialidad.hashCode());
		result = prime * result + ((especialidadPK == null) ? 0 : especialidadPK.hashCode());
		result = prime * result + ((hospital == null) ? 0 : hospital.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especialidadhospital other = (Especialidadhospital) obj;
		if (especialidad == null) {
			if (other.especialidad != null)
				return false;
		} else if (!especialidad.equals(other.especialidad))
			return false;
		if (especialidadPK == null) {
			if (other.especialidadPK != null)
				return false;
		} else if (!especialidadPK.equals(other.especialidadPK))
			return false;
		if (hospital == null) {
			if (other.hospital != null)
				return false;
		} else if (!hospital.equals(other.hospital))
			return false;
		return true;
	}
	
	
	
	
	
}
