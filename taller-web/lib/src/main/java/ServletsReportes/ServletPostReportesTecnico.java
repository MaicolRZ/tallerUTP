package ServletsReportes;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dto.DtoReporteTecnico;
import pe.edu.universidad.ejb.EJBReportes;

/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/SrvReportesTecnico")
public class ServletPostReportesTecnico extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EJBReportes ejb2;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPostReportesTecnico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_tecnico = request.getParameter("id_tecnico");
		String fecha = request.getParameter("fecha");
		String fechaFinal = request.getParameter("fechaFinal");

		System.out.println(fecha);
		List<DtoReporteTecnico> lst3 =ejb2.reporteTecnicoID(id_tecnico,fecha,fechaFinal);
		
		
		
		request.getSession().setAttribute("LstReporteTecnico", lst3);
		response.sendRedirect("Reportes/reporteTecnico.jsp");
	}

}
