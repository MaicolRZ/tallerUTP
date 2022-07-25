package ServletsControladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dto.DtoListaPiezas;

/**
 * Servlet implementation class ServletGetMatriculaCurso
 */
@WebServlet("/lista")
public class ServletGetPiezasLista extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGetPiezasLista() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idpieza = request.getParameter("idpieza");
		String pieza = request.getParameter("piezas");
		
		int precio = Integer.parseInt(request.getParameter("precio"));
		
		
		List<DtoListaPiezas> lst = (List<DtoListaPiezas>)request.getSession().getAttribute("lstSlcPiezas");
		if (lst == null) {
			lst = new ArrayList<DtoListaPiezas>();
		}
		DtoListaPiezas dto = new DtoListaPiezas();
		
		
		dto.setId(idpieza);

		dto.setPiezas(pieza);
		dto.setPrecio(precio);
		
		lst.add(dto);
		
		
		
		request.getSession().setAttribute("lstSlcPiezas", lst);
		
		
		
		request.getRequestDispatcher("piezaslista.jsp").forward(request, response);
	}

	
}
