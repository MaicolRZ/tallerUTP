package ServletsReportes;

import java.io.File;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import pe.edu.universidad.dao.DaoGenerico;

public class reportes {
	public JasperPrint ReporteTecnico(ServletContext servletContext) throws JRException, SQLException,ServletException{
	
		File f= new File(servletContext.getRealPath("/AtencionTaller.jasper"));
		
		JasperReport jr = (JasperReport) JRLoader.loadObject(f);
		HashMap hm= new HashMap();
		hm.put("fecha","fecha");
		
		JasperPrint jp= JasperFillManager.fillReport(jr, null,DaoGenerico.getConnection());
		
		return jp;
		
	}

}
