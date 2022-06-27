package pe.edu.universidad.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import pe.edu.universidad.dao.DaoCliente;
import pe.edu.universidad.dto.DtoAtencionTaller;


/**
 * Session Bean implementation class EJBMatriculas
 */
@Stateless
@LocalBean
public class EJBAtencionTaller {

    /**
     * Default constructor. 
     */
    public EJBAtencionTaller() {
        // TODO Auto-generated constructor stub
    }
    
    
    /**
     * Default constructor. 
     */
	
	public List<DtoAtencionTaller> consultarPersonaporID(String id_cliente) {
    	List<DtoAtencionTaller> lst = null;
    	DaoCliente dao2 = new DaoCliente();
    	lst = dao2.consultarPersonaporID(id_cliente);
    	return lst;
    }
	public List<DtoAtencionTaller> imprimirPDF(String id_elec) {
    	List<DtoAtencionTaller> lst = null;
    	DaoCliente dao2 = new DaoCliente();
    	lst = dao2.imprimirPDFAtencionTaller(id_elec);
    	return lst;
    }
	
	
	
	/** 
     * Default constructor. 
     */

}
