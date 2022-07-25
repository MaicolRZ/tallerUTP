package pe.edu.universidad.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import pe.edu.universidad.dao.DaoSesion;
import pe.edu.universidad.entidades.Sesion;


/**
 * Session Bean implementation class EJBMatriculas
 */
@Stateless
@LocalBean
public class EJBSesion {

    /**
     * Default constructor. 
     */
    public EJBSesion() {
        // TODO Auto-generated constructor stub
    }
    
    
    /**
     * Default constructor. 
     */
	
	public List<Sesion> DatosSesion(String correo,String clave) {
    	List<Sesion> lst = null;
    	
    	
    	DaoSesion dao2 = new DaoSesion();
    	
    	
    	lst = dao2.DatosSesion(correo,clave);
    	return lst;
    }
	
	
	
	
	/** 
     * Default constructor. 
     */

}
