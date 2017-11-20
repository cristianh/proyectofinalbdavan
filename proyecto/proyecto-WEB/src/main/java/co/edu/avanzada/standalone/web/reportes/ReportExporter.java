package co.edu.avanzada.standalone.web.reportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ReportExporter {

	public void export(String reportName, String folderPath, Map<String, Object> parameters, ArrayList<?> list,String nombresalida)
			throws JRException {
		
		String printFileName = null;
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(list);

		try {
			printFileName = JasperFillManager.fillReportToFile(reportName, parameters, beanColDataSource);
			if (printFileName != null) {
				/**
				 * 1- export to PDF
				 */
				JasperExportManager.exportReportToPdfFile(printFileName, folderPath + "/"+ nombresalida + ".pdf");

				/**
				 * 2- export to HTML
				 */
				JasperExportManager.exportReportToHtmlFile(printFileName,folderPath+"/"+ nombresalida +  ".html");

			}
		} catch (JRException e) {
			e.printStackTrace();
		}
		finally{
			
		}
		
	}

}