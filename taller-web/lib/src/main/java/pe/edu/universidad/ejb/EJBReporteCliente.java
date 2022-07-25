package pe.edu.universidad.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import pe.edu.universidad.dto.DtoReporteCliente;
import pe.edu.universidad.dao.*;

/**
 * Session Bean implementation class EJBMatriculas
 */
@Stateless
@LocalBean
public class EJBReporteCliente {

    /**
     * Default constructor. 
     */
    public EJBReporteCliente() {
        // TODO Auto-generated constructor stub
    }
    
    
    /**
     * Default constructor. 
     */
	
	public List<DtoReporteCliente> reporteCliente(String dni,String fecha,String fechafin,int precio) {
    	List<DtoReporteCliente> lst = null;
    	
    	System.out.println(dni+"EJBBBB");
    	DaoReportes dao2 = new DaoReportes();
    	lst = dao2.reporteClienteDni(dni,fecha,fechafin,precio);
    	return lst;
    }
	
	
	
	
	
	
	/** 
     * Default constructor. 
     */

}
