package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IReporteUrgencia;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.ReporteUrgencia;

public class controladorReporteUrgencia {

	private IReporteUrgencia ireporteurgencia;
	
	
	public controladorReporteUrgencia() throws NamingException {
		// TODO Auto-generated constructor stub
		ireporteurgencia = (IReporteUrgencia) ServiceLocator.buscarEJB("ReporteUrgenciaEJB", IReporteUrgencia.class.getCanonicalName());
	}
	
	
	public void crearReporteUrgencia(ReporteUrgencia reporteurgencia) {
		ireporteurgencia.crearReporteUrgencia(reporteurgencia);
	}

	public ReporteUrgencia buscarreporteurgencia(String codigoreporteurgencia) {
		return ireporteurgencia.buscarreporteUrgencia(codigoreporteurgencia);
	}
	
	public void eliminarEspecialidad(String codigoespecialidad) {
		ireporteurgencia.eliminar(codigoespecialidad);
	}
	
	public List<ReporteUrgencia> listarpersonas(){
		return ireporteurgencia.ListarreporteUrgencias();
	}
}
