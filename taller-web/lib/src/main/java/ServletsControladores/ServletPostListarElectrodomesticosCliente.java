package ServletsControladores;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dto.DtoElectro;
import pe.edu.universidad.ejb.EJBElectro;

/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/SrvListaElectros")
public class ServletPostListarElectrodomesticosCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EJBElectro ejb;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPostListarElectrodomesticosCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getParameter("dni");

		List<DtoElectro> lst =ejb.ListaElectros(dni);
		
		
		request.getSession().setAttribute("Electrodomesticos", lst);
		response.sendRedirect("PaginaWebCliente/listaElectro.jsp#about");
		
	}

}
