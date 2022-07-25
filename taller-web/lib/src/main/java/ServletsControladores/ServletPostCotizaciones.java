package ServletsControladores;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dao.DaoElectro;
import pe.edu.universidad.dto.DtoAtencionTaller;
import pe.edu.universidad.ejb.*;

/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/SrvEstadoCotizacion")
public class ServletPostCotizaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EJBAtencionTaller ejb2;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPostCotizaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String estado = request.getParameter("estado");
		String id_taller = request.getParameter("id_taller");
		System.out.println(estado);
		System.out.println(id_taller);
		DaoElectro dao = new DaoElectro();
		if (estado.equalsIgnoreCase("Aceptar")){
			
			dao.AtencionTallerCotizacionAceptada(id_taller);
		}
		else {
			if(estado.equalsIgnoreCase("Rechazar")) {
				
				dao.AtencionTallerCotizacionRechazada(id_taller);
			}
		}
		request.getSession().setAttribute("LstCotizacion", null);
		
		request.getRequestDispatcher("EstadoCotizacion.jsp").forward(request, response);
	}

}
