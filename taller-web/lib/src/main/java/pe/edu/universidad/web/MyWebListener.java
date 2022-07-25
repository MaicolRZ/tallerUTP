package pe.edu.universidad.web;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import pe.edu.universidad.dao.DaoCliente;
import pe.edu.universidad.dao.DaoElectro;
import pe.edu.universidad.dao.DaoHorarios;
import pe.edu.universidad.dao.DaoPiezas;
import pe.edu.universidad.dao.DaoUsuario;
import pe.edu.universidad.dto.DtoHorarios;
import pe.edu.universidad.dto.DtoPiezas;
import pe.edu.universidad.entidades.Cliente;
import pe.edu.universidad.entidades.Electro;
import pe.edu.universidad.entidades.Usuario;
import pe.edu.universidad.entidades.Visita_Tecnica;



@WebListener
public class MyWebListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContextListener.super.contextInitialized(sce);
		
		System.out.println("OJO: contextInitialized");
		//Tecnicos
		DaoUsuario dao = new DaoUsuario();
		List<Usuario> lst = dao.consultarUsuarios();
		sce.getServletContext().setAttribute("lstUsuarios", lst);
		//Clientes
		DaoCliente dao2 = new DaoCliente();
		List<Cliente> lst2 = dao2.consultarCliente();
		sce.getServletContext().setAttribute("lstCliente", lst2);
		
		List<Visita_Tecnica> lst4 = dao2.Visita_Tecnica();
		sce.getServletContext().setAttribute("lstVisita_Tecnica", lst4);
		
		DaoPiezas dao3 = new DaoPiezas();
		List<DtoPiezas> lst5 = dao3.ListarPiezas();
		sce.getServletContext().setAttribute("lstPiezas", lst5);
		
		DaoElectro dao4 = new DaoElectro();
		List<Electro> lst6 = dao4.listarElectrodomesticos();
		sce.getServletContext().setAttribute("lstElectros", lst6);
		
		DaoHorarios dao5 = new DaoHorarios();
		List<DtoHorarios> lst7 = dao5.listarHorarios();
		
		sce.getServletContext().setAttribute("lstHorarios", lst7);
		
		
		

	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		ServletContextListener.super.contextDestroyed(sce);
		System.out.println("OJO: contextDestroyed");
	}
}
