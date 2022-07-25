package ServletsControladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dto.DtoListaPiezas;

/**
 * Servlet implementation class ServletGetMatriculaQuitarCurso
 */
@WebServlet("/ServletGetQuitarPieza")
public class ServletGetQuitarPieza extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGetQuitarPieza() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idpiezas = request.getParameter("idpiezas");
		
		List<DtoListaPiezas> lst = (List<DtoListaPiezas>)request.getSession().getAttribute("lstSlcPiezas");
		for (DtoListaPiezas dto : lst) {
			if (dto.getId().equals(idpiezas)) {
				lst.remove(dto);
				break;
			}
		}
		request.getRequestDispatcher("piezaslista.jsp").forward(request, response);;
	}

}
