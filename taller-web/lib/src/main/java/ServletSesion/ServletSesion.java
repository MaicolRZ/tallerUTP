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
import pe.edu.universidad.dto.DtoSesion;

import pe.edu.universidad.ejb.EJBSesion;


/**
 * Servlet implementation class ServletPostEstudiante
 */
@WebServlet("/ServletSesion")
public class ServletSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EJBSesion ejb2;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSesion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String correo = request.getParameter("correo");
		String clave = request.getParameter("clave");
		request.getSession().setAttribute("Electrodomesticos", null);
		DaoSesion dao = new DaoSesion();
		
		dao.validarLogin(correo,clave);
		dao.DniLogin(correo,clave);
		String rpta=null;
		String dni=null;
		
		int respuesta=0;
		try {
			rpta=dao.validarLogin(correo, clave);
			dni=dao.DniLogin(correo, clave);
			
			
		} catch (Exception e) {
			
		}
		System.out.println(dni +" sesion");

		
		DtoSesion p=(DtoSesion)dao.lista(dni); 
		
		
		if(rpta!=null) {
			
			
			if(rpta.equals("TP_03")) {
			response.sendRedirect("header.jsp");
			request.getSession().setAttribute("LstAdmin", dni);
			}
			else
				if(rpta.equals("TP_02")) {
					response.sendRedirect("headerTecnico.jsp");
					request.getSession().setAttribute("LstTecnico", dni);
				}
				else
					if(rpta.equals("TP_01")) {
						response.sendRedirect("PaginaWebCliente/cliente.jsp");
						request.getSession().setAttribute("LstCliente", dni);
					}
					
			
			
			
			request.getSession().setAttribute("lstNombresCompletos", p.getNombresCompletos());
			request.getSession().setAttribute("lstDireccion", p.getDireccion());
			request.getSession().setAttribute("lstTelefono", p.getTelefono());
			
			
		}
		else
		{
			response.sendRedirect("index.jsp?rspt="+respuesta);
			
			
		}	
		
		
		
		
		
	}

}
