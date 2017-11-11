package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "t_tipofuncionario")
public class TipoFuncionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idfuncionario;

	@Column(name = "cargofuncionario", length = 50)
	private String cargo;

	@Column(name = "nombre", length = 40)
	private String nombre;
	
	@OneToMany(mappedBy="tipofuncionario")
	private List<Funcionario> funcionario;

	public TipoFuncionario() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param idfuncionario
	 * @param cargo
	 * @param nombre
	 */
	public TipoFuncionario(Integer idfuncionario, String cargo, String nombre) {
		super();
		this.idfuncionario = idfuncionario;
		this.cargo = cargo;
		this.nombre = nombre;
	}



	public Integer getIdfuncionario() {
		return idfuncionario;
	}

	public void setIdfuncionario(Integer idfuncionario) {
		this.idfuncionario = idfuncionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((idfuncionario == null) ? 0 : idfuncionario.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		TipoFuncionario other = (TipoFuncionario) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (idfuncionario == null) {
			if (other.idfuncionario != null)
				return false;
		} else if (!idfuncionario.equals(other.idfuncionario))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tipofuncionario [idfuncionario=" + idfuncionario + ", cargo=" + cargo + ", nombre=" + nombre
				+ ", funcionario=" + funcionario + "]";
	}
	
	
}
