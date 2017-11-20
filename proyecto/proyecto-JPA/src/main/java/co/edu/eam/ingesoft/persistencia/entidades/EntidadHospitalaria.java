package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="t_entidadhospitalaria")
public class EntidadHospitalaria implements Serializable {

	@Id
	private String identidadhospitalaria;
	
	@Column(name="nombreentidadhospitalaria")
	private String nombreentidadhospitalaria;
	
	@ManyToOne
	@JoinColumn(name="grado complejidad")
	private GradocomplejidadHospital gradocomplejidad;
	
	@Column(name="estado")
	private String estado;
	
	@OneToMany(mappedBy="entidadhospitalaria",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Cama> camas;
	
	@OneToMany(mappedBy="entidadhospitalaria",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<UrgenciaAmbulancia> urgenciaambulancia;
	
	
	@OneToMany(mappedBy="entidadhospitalaria",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Especialidad> especialidades;
	
	
	public EntidadHospitalaria() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param identidadhospitalaria
	 * @param nombreentidadhospitalaria
	 * @param gradocomplejidad
	 * @param estado
	 * @param camas
	 * @param especialidades
	 */
	public EntidadHospitalaria(String identidadhospitalaria, String nombreentidadhospitalaria,
			GradocomplejidadHospital gradocomplejidad, String estado, List<Cama> camas,
			List<Especialidad> especialidades) {
		super();
		this.identidadhospitalaria = identidadhospitalaria;
		this.nombreentidadhospitalaria = nombreentidadhospitalaria;
		this.gradocomplejidad = gradocomplejidad;
		this.estado = estado;
		this.camas = camas;
		this.especialidades = especialidades;
	}








	public String getIdentidadhospitalaria() {
		return identidadhospitalaria;
	}

	public void setIdentidadhospitalaria(String identidadhospitalaria) {
		this.identidadhospitalaria = identidadhospitalaria;
	}

	public String getNombreentidadhospitalaria() {
		return nombreentidadhospitalaria;
	}

	public void setNombreentidadhospitalaria(String nombreentidadhospitalaria) {
		this.nombreentidadhospitalaria = nombreentidadhospitalaria;
	}

	

	public GradocomplejidadHospital getGradocomplejidad() {
		return gradocomplejidad;
	}



	public void setGradocomplejidad(GradocomplejidadHospital gradocomplejidad) {
		this.gradocomplejidad = gradocomplejidad;
	}



	public List<UrgenciaAmbulancia> getUrgenciaambulancia() {
		return urgenciaambulancia;
	}



	public void setUrgenciaambulancia(List<UrgenciaAmbulancia> urgenciaambulancia) {
		this.urgenciaambulancia = urgenciaambulancia;
	}



	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}



	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}



	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Cama> getCamas() {
		return camas;
	}

	public void setCamas(List<Cama> camas) {
		this.camas = camas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identidadhospitalaria == null) ? 0 : identidadhospitalaria.hashCode());
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
		EntidadHospitalaria other = (EntidadHospitalaria) obj;
		if (identidadhospitalaria == null) {
			if (other.identidadhospitalaria != null)
				return false;
		} else if (!identidadhospitalaria.equals(other.identidadhospitalaria))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Entidadhospitalaria [identidadhospitalaria=" + identidadhospitalaria + ", nombreentidadhospitalaria="
				+ nombreentidadhospitalaria + ", gradocomplejidad=" + gradocomplejidad + ", estado=" + estado
				+ ", camas=" + camas + "]";
	}
	
	
	
	
}
