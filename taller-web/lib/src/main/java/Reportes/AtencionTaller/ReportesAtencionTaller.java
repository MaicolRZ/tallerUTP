package Reportes.AtencionTaller;

import java.io.File;

import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletContext;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;




public class ReportesAtencionTaller {
//, String nombresCompleto,String tipo, String marca, String modelo, String numero_serie, String Descripcion

	public JasperPrint crearReporte(ServletContext servletContext, String dni)throws JRException, SQLException,JRException{
	File f = new File(servletContext.getRealPath("/Atencion_Taller.jasper"));
	JasperReport reporte= (JasperReport) JRLoader.loadObject(f);

	HashMap<String, String> parametro= new HashMap<String, String>();
	parametro.put("dni","pruebaaaa");
		


	
	JasperPrint jp=JasperFillManager.fillReport(reporte, parametro);
	return jp;
	}
}
