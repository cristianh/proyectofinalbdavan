package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="t_operador")
public class OperadorPersonal implements Serializable {

	@Id
	private Integer idoperador;
	
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
	 * @param idoperador
	 * @param codigo
	 * @param funcionario
	 */
	public OperadorPersonal(Integer idoperador, String codigo, Funcionario funcionario) {
		super();
		this.idoperador = idoperador;
		this.codigo = codigo;
		this.funcionario = funcionario;
	}

	public Integer getIdoperador() {
		return idoperador;
	}

	public void setIdoperador(Integer idoperador) {
		this.idoperador = idoperador;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((idoperador == null) ? 0 : idoperador.hashCode());
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
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (idoperador == null) {
			if (other.idoperador != null)
				return false;
		} else if (!idoperador.equals(other.idoperador))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OperadorPersonal [idoperador=" + idoperador + ", codigo=" + codigo + ", funcionario=" + funcionario
				+ "]";
	}
	
	
	
	
}