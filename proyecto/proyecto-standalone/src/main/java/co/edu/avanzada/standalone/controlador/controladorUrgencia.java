package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IUrgencia;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Urgencia;

public class controladorUrgencia {

	private IUrgencia iurgencia;

	public controladorUrgencia() throws NamingException {
		// TODO Auto-generated constructor stub
		iurgencia = (IUrgencia) ServiceLocator.buscarEJB("UrgenciaEJB", IUrgencia.class.getCanonicalName());
	}

	public void crearUrgencia(Urgencia urgencia) {
		iurgencia.crearUrgencia(urgencia);
	}

	public Urgencia buscarUrgencia(String codigoreporteurgencia) {
		return iurgencia.buscarUrgencia(codigoreporteurgencia);
	}

	public void eliminarUrgencia(String codigoreporteurgencia) {
		iurgencia.eliminarUrgencia(codigoreporteurgencia);
	}

	public List<Urgencia> listarReportesUrgencias() {
		return iurgencia.listarUrgencia();
	}

}
