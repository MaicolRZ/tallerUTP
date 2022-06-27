package ServletsControladores;

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

@WebServlet("/ServletPostElectroDescripcionEditar")
public class ServletPostElectroDescripcionEditar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPostElectroDescripcionEditar() {
        super();
    }
    //Incrustamos EJB
    @EJB
	private EJBAtencionTaller ejb2;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_elec = request.getParameter("id_elec");
		String descripcion = request.getParameter("descripcion");
		String id_tecnico = request.getParameter("id_tecnico");

		DaoElectro dao = new DaoElectro();
		dao.editarElectro(id_elec,descripcion,id_tecnico);
	
		
		List<DtoAtencionTaller> lst =ejb2.imprimirPDF(id_elec);
		request.getSession().setAttribute("LstAtencionTallerPDF", lst);
		request.getRequestDispatcher("ReportePDFAtencionTaller.jsp").forward(request, response);
		
		
		
		
		
	}
	

}
