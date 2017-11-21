package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="t_loginusuario")
public class LoginUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="usuario",unique=true, nullable=false, length=100)
	private String user;
	
	@Column(name="contrasena", nullable=false, length=100)
	private String password;

	
	public LoginUsuario() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param user
	 * @param password
	 */
	public LoginUsuario(String user, String password) {
		super();
		this.user = user;
		this.password = password;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "LoginUsuario [" + (user != null ? "user=" + user + ", " : "")
				+ (password != null ? "password=" + password : "") + "]";
	}


	
 

}
