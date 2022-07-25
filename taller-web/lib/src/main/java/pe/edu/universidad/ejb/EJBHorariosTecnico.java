package pe.edu.universidad.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import pe.edu.universidad.dao.DaoHorarios;
import pe.edu.universidad.dao.DaoReportes;
import pe.edu.universidad.dto.DtoHorarios;

/**
 * Session Bean implementation class EJBMatriculas
 */
@Stateless
@LocalBean
public class EJBHorariosTecnico {

    /**
     * Default constructor. 
     */
    public EJBHorariosTecnico() {
        // TODO Auto-generated constructor stub
    }
    
    
    /**
     * Default constructor. 
     */
	
	public List<DtoHorarios> listaHorarios(String fecha) {
    	List<DtoHorarios> lst = null;
    	
    	System.out.println(fecha+"EJBBBB");
    	DaoHorarios dao2 = new DaoHorarios();
    	lst = dao2.listarTecnicosHorario(fecha);
    	return lst;
    }
	
	
	
	
	
	
	
	
	/** 
     * Default constructor. 
     */

}
