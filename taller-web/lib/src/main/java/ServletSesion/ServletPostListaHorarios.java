package ServletSesion;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dao.DaoSesion;
import pe.edu.universidad.dto.DtoHorarios;
import pe.edu.universidad.ejb.EJBHorariosTecnico;

/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/ServletPostListaHorarios")
public class ServletPostListaHorarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EJBHorariosTecnico ejb;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPostListaHorarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoSesion dao = new DaoSesion();
		String fecha=null;
		try {
			fecha=dao.FechaActual();
		} catch (Exception e) {
			// TODO: handle exception
		}
	

		List<DtoHorarios> lst =ejb.listaHorarios(fecha);
		
		
		request.getSession().setAttribute("HorariosTecnico", lst);
		response.sendRedirect("paginaEncargado/horarios.jsp#list2");
		
	}

}
