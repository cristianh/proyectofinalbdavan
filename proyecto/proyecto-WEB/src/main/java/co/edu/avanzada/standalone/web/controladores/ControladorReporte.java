package co.edu.avanzada.standalone.web.controladores;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import co.edu.avanzada.negocio.beans.AmbulanciaEJB;
import co.edu.avanzada.negocio.beans.EpsEJB;
import co.edu.avanzada.negocio.beans.ReporteUrgenciaEJB;
import co.edu.avanzada.standalone.web.reportes.ReportExporter;
import co.edu.eam.ingesoft.persistencia.entidades.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@ViewScoped
@Named("controladorReporte")
public class ControladorReporte implements Serializable {

		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private ReporteUrgenciaEJB reporteUrgenciaEJB;
	
	private ArrayList<ReporteUrgencia> reporteurgencia;
	
	private List<ReporteUrgencia> reporteurgenciaen;
	


	public void ExportarReporte(ActionEvent actionEvent) throws JRException, IOException {
		try {
			//listambulancia = ambulanciaEJB.reporteAmbulancia();
			reporteurgencia=(ArrayList<ReporteUrgencia>) reporteUrgenciaEJB.ListarreporteUrgencias();
			System.out.println(reporteurgencia);
			Map<String, Object> parameters = new HashMap<String, Object>();
			ReportExporter reportExporter = new ReportExporter();
			reportExporter.export(
					"E:/Proyecto prueba trabajo/proyectofinalbdavan/proyectofinalbdavan/proyecto/proyecto-WEB/src/main/webapp/reporteurgencias/reportes de transito.jasper",
					"E:/Proyecto prueba trabajo/proyectofinalbdavan/proyectofinalbdavan/proyecto/proyecto-WEB/src/main/webapp/reportes",
					parameters, reporteurgencia, "Reporte_urgencia");

		} catch (JRException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*Map<String,Object> parametros= new HashMap<String,Object>();
		reporteurgenciaen=reporteUrgenciaEJB.ListarreporteUrgencias();
		
		File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/reporteurgencias/reportes de transito.jasper"));
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(),parametros, new JRBeanCollectionDataSource(reporteurgenciaen));
		
		HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
		response.addHeader("Content-disposition","attachment; filename=jsfReporte.pdf");
		ServletOutputStream stream = response.getOutputStream();
		
		JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
		
		stream.flush();
		stream.close();
		FacesContext.getCurrentInstance().responseComplete();*/
		
	}

}
