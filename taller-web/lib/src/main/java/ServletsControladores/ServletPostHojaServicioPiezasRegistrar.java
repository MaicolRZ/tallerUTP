package ServletsControladores;




import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.universidad.dao.DaoRegistarPiezasUsadas;
import pe.edu.universidad.dto.DtoListaPiezas;
import pe.edu.universidad.dto.DtoPdfHojaServicio;
import pe.edu.universidad.dto.DtoPiezasUsadas;
import pe.edu.universidad.ejb.EJBRegistrarPiezas;



/**
 * Servlet implementation class ServletPostMatricular
 */
@WebServlet("/ServletRegistrarPiezas")
public class ServletPostHojaServicioPiezasRegistrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EJBRegistrarPiezas ejb;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPostHojaServicioPiezasRegistrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id_hoja_servicio=request.getParameter("id_hoja_servicio");
		int sumaTotal=0;
		
		
		List<DtoListaPiezas> lst = (List<DtoListaPiezas>) request.getSession().getAttribute("lstSlcPiezas");
		
		ejb.registrar(id_hoja_servicio, lst);
		List<DtoPdfHojaServicio> lst2 =ejb.ListaPDFHojaServicio(id_hoja_servicio);
		
		DaoRegistarPiezasUsadas dao = new DaoRegistarPiezasUsadas();
		dao.SumaTotal("HS_"+id_hoja_servicio);
		try {
			 sumaTotal=dao.SumaTotal("HS_"+id_hoja_servicio);
		} catch (Exception e) {
			// TODO: handle exception
		}
		ejb.listarPiezasUsadas(id_hoja_servicio);
		List<DtoPiezasUsadas> lst3 =ejb.listarPiezasUsadas(id_hoja_servicio);
		
		request.getSession().setAttribute("lstSlcPiezas", null);
		request.getSession().setAttribute("PdfHojaServicio", lst2);
		request.getSession().setAttribute("LstPiezasUsadas", lst3);
		request.getSession().setAttribute("sumaTotal", sumaTotal);
		
		response.sendRedirect("ReportePDFHojaServicio.jsp?id=HS_"+id_hoja_servicio);
	}
	
	

	}
