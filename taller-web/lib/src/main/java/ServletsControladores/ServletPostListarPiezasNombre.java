package ServletsControladores;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dto.*;
import pe.edu.universidad.ejb.*;

/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/ServletPostListarPiezasNombre")
public class ServletPostListarPiezasNombre extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EJBPiezas ejb3;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPostListarPiezasNombre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre_pieza");

		
		List<DtoListaPiezas> lst4 =ejb3.listarPorNombrePieza();
		
		request.getSession().setAttribute("ListaPiezas", lst4);
		
		request.getRequestDispatcher("piezaslista.jsp").forward(request, response);
	}

}
