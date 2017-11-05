package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.AfectadoAlberguePK;

@Entity
@Table(name = "t_afectadoalbergue")
public class AfectadoAlbergue implements Serializable {

	@EmbeddedId
	private AfectadoAlberguePK afectadoAlberguePK;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@ManyToOne
	@JoinColumn(name = "idalbergue")
	private Albergue idalbergue;

	@ManyToOne
	@JoinColumn(name = "alberguealimento", nullable = false)
	private Alimento alberguealimento;

	
	public AfectadoAlbergue() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param afectadoAlberguePK
	 * @param cantidad
	 * @param idalbergue
	 * @param alberguealimento
	 */
	public AfectadoAlbergue(AfectadoAlberguePK afectadoAlberguePK, Integer cantidad, Albergue idalbergue,
			Alimento alberguealimento) {
		super();
		this.afectadoAlberguePK = afectadoAlberguePK;
		this.cantidad = cantidad;
		this.idalbergue = idalbergue;
		this.alberguealimento = alberguealimento;
	}


	public AfectadoAlberguePK getAfectadoAlberguePK() {
		return afectadoAlberguePK;
	}


	public void setAfectadoAlberguePK(AfectadoAlberguePK afectadoAlberguePK) {
		this.afectadoAlberguePK = afectadoAlberguePK;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	public Albergue getIdalbergue() {
		return idalbergue;
	}


	public void setIdalbergue(Albergue idalbergue) {
		this.idalbergue = idalbergue;
	}


	public Alimento getAlberguealimento() {
		return alberguealimento;
	}


	public void setAlberguealimento(Alimento alberguealimento) {
		this.alberguealimento = alberguealimento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((afectadoAlberguePK == null) ? 0 : afectadoAlberguePK.hashCode());
		result = prime * result + ((alberguealimento == null) ? 0 : alberguealimento.hashCode());
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((idalbergue == null) ? 0 : idalbergue.hashCode());
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
		AfectadoAlbergue other = (AfectadoAlbergue) obj;
		if (afectadoAlberguePK == null) {
			if (other.afectadoAlberguePK != null)
				return false;
		} else if (!afectadoAlberguePK.equals(other.afectadoAlberguePK))
			return false;
		if (alberguealimento == null) {
			if (other.alberguealimento != null)
				return false;
		} else if (!alberguealimento.equals(other.alberguealimento))
			return false;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (idalbergue == null) {
			if (other.idalbergue != null)
				return false;
		} else if (!idalbergue.equals(other.idalbergue))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "AfectadoAlbergue [afectadoAlberguePK=" + afectadoAlberguePK + ", cantidad=" + cantidad + ", idalbergue="
				+ idalbergue + ", alberguealimento=" + alberguealimento + "]";
	}

	

}
