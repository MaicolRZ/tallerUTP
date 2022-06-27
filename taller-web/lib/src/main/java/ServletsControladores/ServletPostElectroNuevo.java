package ServletsControladores;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dao.DaoElectro;

@WebServlet("/ServletPostElectroNuevo")


public class ServletPostElectroNuevo extends HttpServlet{
private static final long serialVersionUID = 1L;

public ServletPostElectroNuevo() { 
 super();}
//crear nuevo usuario cliente
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getParameter("dni");
		String tipo = request.getParameter("tipo_electrodomestico");
		String marca=request.getParameter("marca");
		String modelo=request.getParameter("modelo");
		String n_serie=request.getParameter("numero_Serie");

		
		

		DaoElectro dao = new DaoElectro();
		dao.insertarElectro(dni,tipo,marca,modelo,n_serie );
		
		RequestDispatcher rd;
		rd=request.getRequestDispatcher("atencionTaller.jsp");
		rd.forward(request, response);
		
	}
}
