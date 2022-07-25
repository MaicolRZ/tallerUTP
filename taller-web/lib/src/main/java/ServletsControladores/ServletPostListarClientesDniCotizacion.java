package ServletsControladores;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dto.DtoAtencionTallerCotizacion;
import pe.edu.universidad.ejb.EJBAtencionTaller;

/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/SrvCotizaciones")
public class ServletPostListarClientesDniCotizacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EJBAtencionTaller ejb2;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPostListarClientesDniCotizacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_cliente = request.getParameter("id_cliente");

		List<DtoAtencionTallerCotizacion> lst =ejb2.AtencionTallerCotizacion(id_cliente);
		
		
		request.getSession().setAttribute("LstCotizacion", lst);
		request.getRequestDispatcher("EstadoCotizacion.jsp").forward(request, response);
	}

}
