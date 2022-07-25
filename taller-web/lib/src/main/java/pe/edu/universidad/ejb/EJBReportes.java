package pe.edu.universidad.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import pe.edu.universidad.dao.DaoReportes;
import pe.edu.universidad.dto.DtoReporteTecnico;


/**
 * Session Bean implementation class EJBMatriculas
 */
@Stateless
@LocalBean
public class EJBReportes {

    /**
     * Default constructor. 
     */
    public EJBReportes() {
        // TODO Auto-generated constructor stub
    }
    
    
    /**
     * Default constructor. 
     */
	
	public List<DtoReporteTecnico> reporteTecnicoID(String id_tecnico,String fecha,String fechaFinal) {
    	List<DtoReporteTecnico> lst3 = null;
    	
    	DaoReportes dao2 = new DaoReportes();
    	lst3 = dao2.reporteTecnicoID(id_tecnico,fecha,fechaFinal);
    	return lst3;
    }
	
	
	
	
	/** 
     * Default constructor. 
     */

}
