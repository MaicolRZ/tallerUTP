package ServletsControladores;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dao.DaoHojaServicio;
import pe.edu.universidad.dto.DtoAtencionTaller;
import pe.edu.universidad.ejb.*;

/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/SrvPrecioTotal")
public class ServletPostPrecioTotal extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPostPrecioTotal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_taller = request.getParameter("id_taller");
		int precioTotal= Integer.parseInt(request.getParameter("precioTotal"));
		DaoHojaServicio dao = new DaoHojaServicio();
		dao.precioTotal(id_taller, precioTotal);
		System.out.println(id_taller+" "+ precioTotal);
		
		
		response.sendRedirect("headerTecnico.jsp");
	}

}
