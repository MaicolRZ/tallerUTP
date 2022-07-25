package ServletsReportes;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import groovyjarjarcommonscli.ParseException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;

@WebServlet("/ServletPDF")
public class ServletPDF extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		reportes rp = new reportes();
		try {
			
			
			JasperPrint jp = rp.ReporteTecnico(getServletContext());
			JasperExportManager.exportReportToPdfFile(jp,request.getServletContext().getRealPath("/PDF.pdf"));
			request.getSession().setAttribute(BaseHttpServlet.DEFAULT_JASPER_PRINT_LIST_SESSION_ATTRIBUTE, jp);
			Thread.sleep(5000);
			response.sendRedirect("Reportes/reporteTecnico.jsp");
		} catch (JRException ex) {
			ex.printStackTrace();
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
	}

}
//String id_tecnico = request.getParameter("");
		/*
		try {
			HashMap<String, String> parametros=new HashMap<>();			
			parametros.put("parametro", "Hola ");
			java.net.URL url= getClass().getResource("AtencionTaller.jasper");
			JasperReport reporteTecnico= (JasperReport) JRLoader.loadObject(url);
			
			JasperPrint print= (JasperPrint) JasperFillManager.fillReport(reporteTecnico, parametros);
			
			JasperViewer.viewReport(print,false);
			System.out.println("El reporte se genero correctamente");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("El reporte NO se genero correctamente");
		/*
		try {
			JasperReport reporteTecnico= JasperCompileManager.compileReport("AtencionTaller.jasper");
			JasperPrint print= JasperFillManager.fillReport(reporteTecnico, null,DaoGenerico.getConnection());
			JasperViewer  view= new JasperViewer(print,false);
			view.setTitle("Reporte de Personas");
			view.setVisible(true);
			
			JasperExportManager.exportReportToPdfStream(print, null);
			System.out.println("El reporte se genero correctamente");
			response.setContentType("reportePDF");
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			
			JasperReport reporteTecnico= JasperCompileManager.compileReport("AtencionTaller.jasper");
			byte[] bytes = JasperRunManager.runReportToPdf(reporteTecnico, null,DaoGenerico.getConnection());
			response.setContentType("reportePDF");
			response.setContentLength(bytes.length);
			ServletOutputStream output = response.getOutputStream();
			response.getOutputStream();
			output.write(bytes,0,bytes.length);
			output.flush();
			output.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/