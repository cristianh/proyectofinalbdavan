package co.edu.eam.ingesoft.persistencia.entidades.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AfectadoAlberguePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="alimento_id")
	private Integer alimento_id;
	
	@Column(name="albergue_id")
	private Integer albergue_id;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((albergue_id == null) ? 0 : albergue_id.hashCode());
		result = prime * result + ((alimento_id == null) ? 0 : alimento_id.hashCode());
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
		AfectadoAlberguePK other = (AfectadoAlberguePK) obj;
		if (albergue_id == null) {
			if (other.albergue_id != null)
				return false;
		} else if (!albergue_id.equals(other.albergue_id))
			return false;
		if (alimento_id == null) {
			if (other.alimento_id != null)
				return false;
		} else if (!alimento_id.equals(other.alimento_id))
			return false;
		return true;
	}
	
	
}
