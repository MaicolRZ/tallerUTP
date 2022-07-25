package pe.edu.universidad.servletVisitas;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import pe.edu.universidad.dao.DaoElectro;

import pe.edu.universidad.dto.DtoAtencionTaller;

import pe.edu.universidad.ejb.EJBAtencionTaller;

@WebServlet("/ServletPostVisitaAsignada")
public class ServletPostVisitaAsignada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPostVisitaAsignada() {
        super();
    }
    //Incrustamos EJB
   


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_elec = request.getParameter("id_elec");
		String id_tecnico = request.getParameter("id_tecnico");
		String id_horario = request.getParameter("id_horario");
		String fecha = request.getParameter("fecha");
		System.out.println(id_elec+" electroooo");
		
		DaoElectro dao = new DaoElectro();
		dao.visitaDomicilio(id_elec,id_tecnico,id_horario,fecha);
		
		response.sendRedirect("PaginaWebCliente/cliente.jsp");
		
	}
	

}
