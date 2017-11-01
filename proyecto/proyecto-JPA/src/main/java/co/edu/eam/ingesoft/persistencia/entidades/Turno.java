package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.RowId;

@Entity
@Table(name="t_turno")
public class Turno implements Serializable {
	
	@Id
	private String idturno;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaingreso;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechasalida;
	
	public Turno() {
		// TODO Auto-generated constructor stub
	}

	public String getIdturno() {
		return idturno;
	}

	public void setIdturno(String idturno) {
		this.idturno = idturno;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Date getFechasalida() {
		return fechasalida;
	}

	public void setFechasalida(Date fechasalida) {
		this.fechasalida = fechasalida;
	}

	public Turno(String idturno, Date fechaingreso, Date fechasalida) {
		super();
		this.idturno = idturno;
		this.fechaingreso = fechaingreso;
		this.fechasalida = fechasalida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idturno == null) ? 0 : idturno.hashCode());
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
		Turno other = (Turno) obj;
		if (idturno == null) {
			if (other.idturno != null)
				return false;
		} else if (!idturno.equals(other.idturno))
			return false;
		return true;
	}
	
	
	

}
