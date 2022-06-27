package ServletsControladores;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dto.DtoAtencionTaller;
import pe.edu.universidad.ejb.*;

/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/ServletPostListarClientesDni")
public class ServletPostListarClientesDni extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EJBAtencionTaller ejb2;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPostListarClientesDni() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_cliente = request.getParameter("id_cliente");

		List<DtoAtencionTaller> lst =ejb2.consultarPersonaporID(id_cliente);
		request.getSession().setAttribute("LstDniClientes", lst);
		request.getRequestDispatcher("atencionTaller.jsp").forward(request, response);
	}

}
