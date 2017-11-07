package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name="t_operadorF")
public class OperadorPersonal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idpersonal;
	
	@Column(name="codigo", length=50)
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name="opFuncionario", nullable=false)
	private Funcionario funcionario;

	/**
	 * 
	 */
	public OperadorPersonal() {
		
	}

	
	
	/**
	 * @param idpersonal
	 * @param codigo
	 * @param funcionario
	 */
	public OperadorPersonal(Integer idpersonal, String codigo, Funcionario funcionario) {
		super();
		this.idpersonal = idpersonal;
		this.codigo = codigo;
		this.funcionario = funcionario;
	}



	public Integer getIdpersonal() {
		return idpersonal;
	}

	public void setIdpersonal(Integer idpersonal) {
		this.idpersonal = idpersonal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idpersonal == null) ? 0 : idpersonal.hashCode());
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
		OperadorPersonal other = (OperadorPersonal) obj;
		if (idpersonal == null) {
			if (other.idpersonal != null)
				return false;
		} else if (!idpersonal.equals(other.idpersonal))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "OperadorPersonal [idpersonal=" + idpersonal + ", codigo=" + codigo + ", funcionario=" + funcionario
				+ "]";
	}

	
	
	
	
	
	
}