package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_loginusuario")
public class LoginUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String idlogiusuario;
	
	@Column(name="usuario")
	private String user;
	
	@Column(name="contrasena")
	private String password;
	
	@ManyToOne
	@JoinColumn(name="idfuncionario")
	private Funcionario funcionario;
	
	public LoginUsuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idlogiusuario
	 * @param user
	 * @param password
	 * @param funcionario
	 */
	public LoginUsuario(String idlogiusuario, String user, String password, Funcionario funcionario) {
		super();
		this.idlogiusuario = idlogiusuario;
		this.user = user;
		this.password = password;
		this.funcionario = funcionario;
	}

	public String getIdlogiusuario() {
		return idlogiusuario;
	}

	public void setIdlogiusuario(String idlogiusuario) {
		this.idlogiusuario = idlogiusuario;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		result = prime * result + ((idlogiusuario == null) ? 0 : idlogiusuario.hashCode());
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
		LoginUsuario other = (LoginUsuario) obj;
		if (idlogiusuario == null) {
			if (other.idlogiusuario != null)
				return false;
		} else if (!idlogiusuario.equals(other.idlogiusuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LoginUsuario [idlogiusuario=" + idlogiusuario + ", user=" + user + ", password=" + password
				+ ", funcionario=" + funcionario + "]";
	}

}
