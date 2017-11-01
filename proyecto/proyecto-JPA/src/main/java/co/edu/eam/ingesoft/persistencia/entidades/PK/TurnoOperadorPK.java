package co.edu.eam.ingesoft.persistencia.entidades.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TurnoOperadorPK implements Serializable{
	
	@Column(name="id_paciente")
	private Integer idpaciente;
	
	@Column(name="id_urgenciaambulancia")
	private Integer idurgenciaambulancia;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idpaciente == null) ? 0 : idpaciente.hashCode());
		result = prime * result + ((idurgenciaambulancia == null) ? 0 : idurgenciaambulancia.hashCode());
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
		TurnoOperadorPK other = (TurnoOperadorPK) obj;
		if (idpaciente == null) {
			if (other.idpaciente != null)
				return false;
		} else if (!idpaciente.equals(other.idpaciente))
			return false;
		if (idurgenciaambulancia == null) {
			if (other.idurgenciaambulancia != null)
				return false;
		} else if (!idurgenciaambulancia.equals(other.idurgenciaambulancia))
			return false;
		return true;
	}
	
	

}
