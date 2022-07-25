package ServletSesion;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dao.DaoHorarios;
import pe.edu.universidad.dao.DaoSesion;
import pe.edu.universidad.dto.DtoSesion;

import pe.edu.universidad.ejb.EJBSesion;


/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/ServletInsertarHorarios")
public class ServletInsertarHorarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInsertarHorarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String dni_tecnico = request.getParameter("dni_tecnico");
		String turno = request.getParameter("turno");

		String fecha = request.getParameter("fecha");
		System.out.println(turno+" turno");
		System.out.println(fecha+" dni tecnico");
		System.out.println(dni_tecnico+" dni tecnico");
		String hora_inicio=null;
		String hora_fin=null;
		DaoHorarios dao= new DaoHorarios();
		
		switch(turno){
			case "Mañana":
				hora_inicio="08:30";
				hora_fin="12:30";
				System.out.println("Inicio: "+hora_inicio+" fin: "+ hora_fin);
				dao.insertarHorario(dni_tecnico, hora_inicio, hora_fin, fecha);
				response.sendRedirect("paginaEncargado/horarios.jsp");
				break;
			case "Tarde":
				 hora_inicio="15:30";
				 hora_fin="19:30";
				 System.out.println("Inicio: "+hora_inicio+" fin: "+ hora_fin);
				dao.insertarHorario(dni_tecnico,hora_inicio,hora_fin, fecha);
				
				response.sendRedirect("paginaEncargado/horarios.jsp");
				break;
				
			default: System.out.print("Error turno no valido");
		}
		
			
		}
		
		
		
		
		
	

}
