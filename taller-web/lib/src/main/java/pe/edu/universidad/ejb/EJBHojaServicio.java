package pe.edu.universidad.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import pe.edu.universidad.dao.DaoCliente;
import pe.edu.universidad.dto.DtoHojaServicio;

/**
 * Session Bean implementation class EJBMatriculas
 */
@Stateless
@LocalBean
public class EJBHojaServicio {

    /**
     * Default constructor. 
     */
    public EJBHojaServicio() {
        // TODO Auto-generated constructor stub
    }
    
    
    /**
     * Default constructor. 
     */
	
	public List<DtoHojaServicio> consultarTecnicoPorId(String id_tecnico,String id_cliente) {
    	List<DtoHojaServicio> lst = null;
    	DaoCliente dao = new DaoCliente();
    	lst = dao.consultarTecnicoPorId(id_tecnico,id_cliente);
    	return lst;
    }
	/** 
     * Default constructor. 
     */

}
