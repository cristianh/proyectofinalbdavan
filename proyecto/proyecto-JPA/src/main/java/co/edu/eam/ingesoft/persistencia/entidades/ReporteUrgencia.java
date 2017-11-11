package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="t_reporteurgencia")
@NamedQueries({ @NamedQuery(name = "ReporteUrgencia.listarpersonas", query = "SELECT r FROM ReporteUrgencia r"),
	@NamedQuery(name = "ReporteUrgencia.buscarlistapersonas", query = "SELECT r FROM ReporteUrgencia r where r.idreporteurgencia=:id"),
	@NamedQuery(name = "ReporteUrgencia.listarordenar", query = "SELECT r FROM ReporteUrgencia r ORDER BY r.estado DESC, r.fechayhora DESC")})
public class ReporteUrgencia implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer idreporteurgencia;
	
	@Column(name="nombre",nullable=false,length=50)
	private String nombre;
	
	@Column(name="apellido",nullable=true,length=50)
	private String apellido;
	
	@Column(name="cedula",nullable=false,length=50)
	private String cedula;

	@Column(name="telefono" ,nullable=true,length=50)
	private String telefono;
	
	@Column(name="direccion",nullable=false,length=100)
	private String direccion;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechayhora;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="numeroafectados")
	private Integer numeroafectados;
	
	@ManyToOne
	@JoinColumn(name="tipourgencia")
	private TipoUrgencia tipourgencia;
	
	
	
	
	
	public ReporteUrgencia() {
		// TODO Auto-generated constructor stub
	}


	


	

	/**
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param telefono
	 * @param direccion
	 * @param numeroafectados
	 * @param tipourgencia
	 */
	public ReporteUrgencia(String nombre, String apellido, String cedula, String telefono, String direccion,
			Integer numeroafectados, TipoUrgencia tipourgencia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.numeroafectados = numeroafectados;
		this.tipourgencia = tipourgencia;
	}


	public Date getFechayhora() {
		return fechayhora;
	}


	public void setFechayhora(Date fechayhora) {
		this.fechayhora = fechayhora;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Integer getIdreporteurgencia() {
		return idreporteurgencia;
	}


	public void setIdreporteurgencia(Integer idreporteurgencia) {
		this.idreporteurgencia = idreporteurgencia;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Integer getNumeroafectados() {
		return numeroafectados;
	}


	public void setNumeroafectados(Integer numeroafectados) {
		this.numeroafectados = numeroafectados;
	}


	public TipoUrgencia getTipourgencia() {
		return tipourgencia;
	}


	public void setTipourgencia(TipoUrgencia tipourgencia) {
		this.tipourgencia = tipourgencia;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idreporteurgencia == null) ? 0 : idreporteurgencia.hashCode());
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
		ReporteUrgencia other = (ReporteUrgencia) obj;
		if (idreporteurgencia == null) {
			if (other.idreporteurgencia != null)
				return false;
		} else if (!idreporteurgencia.equals(other.idreporteurgencia))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ReporteUrgencia [idreporteurgencia=" + idreporteurgencia + ", nombre=" + nombre + ", apellido="
				+ apellido + ", cedula=" + cedula + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", numeroafectados=" + numeroafectados + ", tipourgencia=" + tipourgencia + "]";
	}


	


	
	
}
