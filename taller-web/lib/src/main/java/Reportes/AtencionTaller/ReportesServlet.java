package Reportes.AtencionTaller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import pe.edu.universidad.dao.DaoElectro;

import pe.edu.universidad.dto.DtoAtencionTaller;

import pe.edu.universidad.ejb.EJBAtencionTaller;

@WebServlet("/ReportesServlet")
public class ReportesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReportesServlet() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getParameter("dni");
		String nombresCompleto = request.getParameter("nombresCompleto");
		String tipo = request.getParameter("tipo_electrodomestico"); 
		String marca=request.getParameter("marca");
		String modelo=request.getParameter("modelo");
		String n_serie=request.getParameter("numero_Serie");
		String descripcion=request.getParameter("descripcion");

		ReportesAtencionTaller reportes = new ReportesAtencionTaller();
		try {
		JasperPrint jp= reportes.crearReporte(getServletContext(), dni);
		JasperExportManager.exportReportToPdfFile(jp, request.getServletContext().getRealPath("Reporte.pdf"));
		// esperar 5 segundos
		
		Thread.sleep(5000);
		response.sendRedirect(request.getContextPath()+"Reporte.pdf");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}
	

}
