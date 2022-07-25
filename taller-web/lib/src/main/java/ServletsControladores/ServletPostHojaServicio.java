package ServletsControladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dao.DaoHojaServicio;

/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/SrvHojaServicio")
public class ServletPostHojaServicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
    


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_taller = request.getParameter("id_taller");
		String id_actividades = request.getParameter("id_actividades");
		String descripcion = request.getParameter("descripcion");
		
		System.out.println(id_taller+" "+id_actividades+" "+descripcion);
		String id_hoja=null;
		
		DaoHojaServicio dao= new DaoHojaServicio();
		dao.insertarHojaServicio(id_taller, id_actividades, descripcion);
		dao.editarEstado(id_taller);
		
		try {
			Thread.sleep(1000);
			id_hoja= dao.CodHoja_Servicio();
		} catch (Exception e) {
			
		}
		System.out.println("ID Hoja Servicio: "+id_hoja);
		request.getSession().setAttribute("Id_Hoja_Servicio", id_hoja);
		
		response.sendRedirect("piezaslista.jsp");
		
		
		
		
	}

}
