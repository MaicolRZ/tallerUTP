package pe.edu.universidad.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import pe.edu.universidad.dao.DaoElectro;
import pe.edu.universidad.dto.DtoElectro;
import pe.edu.universidad.entidades.Electro;


/**
 * Session Bean implementation class EJBMatriculas
 */
@Stateless
@LocalBean
public class EJBElectro {

    /**
     * Default constructor. 
     */
    public EJBElectro() {
        // TODO Auto-generated constructor stub
    }
    
    
    /**
     * Default constructor. 
     */
	
	public List<DtoElectro> ListaElectros(String dni) {
    	List<DtoElectro> lst3 = null;
    	
    	DaoElectro dao2 = new DaoElectro();
    	lst3 = dao2.listarElectrodomesticosDNI(dni);
    	return lst3;
    }
	
	
	
	
	/** 
     * Default constructor. 
     */

}
