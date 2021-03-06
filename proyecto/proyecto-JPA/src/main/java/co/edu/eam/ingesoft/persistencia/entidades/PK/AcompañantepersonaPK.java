package co.edu.eam.ingesoft.persistencia.entidades.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AcompaņantepersonaPK implements Serializable {

	@Column(name="idacompaņante")
	private Integer idacompaņante;
	
	@Column(name="idpersona")
	private Integer idpersona;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idacompaņante == null) ? 0 : idacompaņante.hashCode());
		result = prime * result + ((idpersona == null) ? 0 : idpersona.hashCode());
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
		AcompaņantepersonaPK other = (AcompaņantepersonaPK) obj;
		if (idacompaņante == null) {
			if (other.idacompaņante != null)
				return false;
		} else if (!idacompaņante.equals(other.idacompaņante))
			return false;
		if (idpersona == null) {
			if (other.idpersona != null)
				return false;
		} else if (!idpersona.equals(other.idpersona))
			return false;
		return true;
	}
	
	
}
