package pe.edu.universidad.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import pe.edu.universidad.dao.DaoRegistarPiezasUsadas;
import pe.edu.universidad.dto.DtoListaPiezas;
import pe.edu.universidad.dto.DtoPdfHojaServicio;
import pe.edu.universidad.dto.DtoPiezasUsadas;


/**
 * Session Bean implementation class EJBMatriculas
 */
@Stateless
@LocalBean
public class EJBRegistrarPiezas {

    /**
     * Default constructor. 
     */
    public EJBRegistrarPiezas() {
        // TODO Auto-generated constructor stub
    }
    
    
    /**
     * Default constructor. 
     */
	
    public void registrar(String id_hoja_servicio, List<DtoListaPiezas> lst) {
		
    	DaoRegistarPiezasUsadas dao = new DaoRegistarPiezasUsadas();
		dao.RegistarPiezasUsadas("HS_"+id_hoja_servicio, lst);
	}
	
    public List<DtoPdfHojaServicio> ListaPDFHojaServicio(String id_hoja_servicio) {
    	List<DtoPdfHojaServicio> lst3 = null;
    	
    	DaoRegistarPiezasUsadas dao3 = new DaoRegistarPiezasUsadas();
    	lst3 = dao3.consultarHojaServicio("HS_"+id_hoja_servicio); 
    	return lst3;
    }
	
    public List<DtoPiezasUsadas> listarPiezasUsadas(String id_hoja_servicio) {
    	List<DtoPiezasUsadas> lst4 = null;
    	
    	DaoRegistarPiezasUsadas dao3 = new DaoRegistarPiezasUsadas();
    	lst4 = dao3.PiezasUsadas("HS_"+id_hoja_servicio); 
    	return lst4;
    }
	/** 
     * Default constructor. 
     */

}
