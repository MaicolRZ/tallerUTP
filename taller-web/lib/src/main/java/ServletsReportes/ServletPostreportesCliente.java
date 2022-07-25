package ServletsReportes;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dto.DtoReporteCliente;
import pe.edu.universidad.ejb.EJBReporteCliente;

/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/ServletPostreportesCliente")
public class ServletPostreportesCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EJBReporteCliente ejb;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPostreportesCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getParameter("dni");
		String fecha = request.getParameter("fecha");
		String fechafin = request.getParameter("fechafin");
		int precio= Integer.parseInt(request.getParameter("precio"));
		System.out.println(dni+fecha+fechafin+precio+ "ASDASDASDASD");
		List<DtoReporteCliente> lst =ejb.reporteCliente(dni,fecha,fechafin,precio);
		
		
		request.getSession().setAttribute("lstReporteCliente", lst);
		response.sendRedirect("Reportes/reporteCliente.jsp");
	}

}
