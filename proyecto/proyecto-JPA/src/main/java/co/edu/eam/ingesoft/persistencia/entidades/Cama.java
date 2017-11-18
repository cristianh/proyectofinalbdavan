package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="t_cama")
@NamedNativeQueries({ @NamedNativeQuery(name = "Cama.listarcama",
query = "SELECT * FROM t_cama",resultClass=Cama.class),
	@NamedNativeQuery(name = "Cama.listarbuscarcama",
	query = "SELECT * FROM t_cama  where idcama=:estado",resultClass=Cama.class) })

public class Cama implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idcama;
	
	@Column(name="estado")
	private String estadocama;
	
	@ManyToOne
	@JoinColumn(name="idtipocama")
	private TipoCama tipocama;
	
	@ManyToOne
	@JoinColumn(name="endidadhospitalaria")
	private EntidadHospitalaria entidadhospitalaria;

	public Cama() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param estadocama
	 * @param tipocama
	 */
	public Cama(String estadocama, TipoCama tipocama) {
		super();
		this.estadocama = estadocama;
		this.tipocama = tipocama;
	}


	public Integer getIdcama() {
		return idcama;
	}


	public void setIdcama(Integer idcama) {
		this.idcama = idcama;
	}


	public String getEstadocama() {
		return estadocama;
	}


	public void setEstadocama(String estadocama) {
		this.estadocama = estadocama;
	}


	public TipoCama getTipocama() {
		return tipocama;
	}


	public void setTipocama(TipoCama tipocama) {
		this.tipocama = tipocama;
	}


	public EntidadHospitalaria getEntidadhospitalaria() {
		return entidadhospitalaria;
	}


	public void setEntidadhospitalaria(EntidadHospitalaria entidadhospitalaria) {
		this.entidadhospitalaria = entidadhospitalaria;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idcama == null) ? 0 : idcama.hashCode());
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
		Cama other = (Cama) obj;
		if (idcama == null) {
			if (other.idcama != null)
				return false;
		} else if (!idcama.equals(other.idcama))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Cama [idcama=" + idcama + ", estadocama=" + estadocama + ", tipocama=" + tipocama
				+ ", entidadhospitalaria=" + entidadhospitalaria + "]";
	}

	

}
