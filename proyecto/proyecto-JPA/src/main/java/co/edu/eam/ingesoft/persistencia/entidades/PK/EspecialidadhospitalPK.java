package co.edu.eam.ingesoft.persistencia.entidades.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EspecialidadhospitalPK implements Serializable{
	
	@Column(name="idespecialidad")
	private Integer idespecialidad;
	
	@Column(name="idhospital")
	private Integer idhospital;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idespecialidad == null) ? 0 : idespecialidad.hashCode());
		result = prime * result + ((idhospital == null) ? 0 : idhospital.hashCode());
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
		EspecialidadhospitalPK other = (EspecialidadhospitalPK) obj;
		if (idespecialidad == null) {
			if (other.idespecialidad != null)
				return false;
		} else if (!idespecialidad.equals(other.idespecialidad))
			return false;
		if (idhospital == null) {
			if (other.idhospital != null)
				return false;
		} else if (!idhospital.equals(other.idhospital))
			return false;
		return true;
	}
	
	

	

}
