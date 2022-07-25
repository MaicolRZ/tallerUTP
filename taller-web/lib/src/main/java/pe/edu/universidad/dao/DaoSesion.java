package pe.edu.universidad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pe.edu.universidad.dto.DtoSesion;
import pe.edu.universidad.entidades.Sesion;



public class DaoSesion extends DaoGenerico{
	
	DtoSesion ses=new DtoSesion();
	
	public String validarLogin(String correo,String clave) {
		String rpta=null;
		
	   
	    
		String sql=" select id_usuario, cargo from usuario "
				+" where correo= '"+correo+"'"
				+" and clave='"+clave+"'";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
		PreparedStatement stm = cnx.prepareStatement(sql);
		rs = stm.executeQuery();
        while(rs.next()){
            rpta=rs.getString("cargo");
        }
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		return rpta;
	}
	
	

	public List<Sesion> DatosSesion(String correo,String clave) {
		List<Sesion> lst2 = new ArrayList<Sesion>();
		Sesion a = null;
		String sql = "correo,persona.nombre || ' ' || apell_pat || ' ' || apell_mat,tipo_persona.nombre,usuario.dni"
				+ " from usuario inner join persona "
				+ " on usuario.dni=persona.dni inner join tipo_persona on usuario.cargo=tipo_persona.id_tipo where correo=? and clave=? ";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			stm.setString(1, correo);
			stm.setString(2, clave);
			rs = stm.executeQuery();
			while (rs.next()) {
				a = new Sesion();
				a.setEmail(rs.getString(1));
				a.setNombresCompleto(rs.getString(2));
				a.setCargo(rs.getString(3));
				a.setDni(rs.getString(3));
				

				
				lst2.add(a);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lst2;
	}
	
	public String DniLogin(String correo,String clave) {
		String dni=null;
		
	   
	    
		String sql=" select usuario.dni from usuario "
				+" where correo= '"+correo+"'"
				+" and clave='"+clave+"'";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
		PreparedStatement stm = cnx.prepareStatement(sql);
		rs = stm.executeQuery();
        while(rs.next()){
            dni=rs.getString("dni"); 
        }
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		return dni;
	}
	
	public String FechaActual() {
		String fecha=null;
		
	   
	    
		String sql="Select current_date";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
		PreparedStatement stm = cnx.prepareStatement(sql);
		rs = stm.executeQuery();
        while(rs.next()){
            fecha=rs.getString(1); 
        }
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		return fecha;
	}
	
	
	public DtoSesion lista(String dni) {
		
		 String sql="select persona.nombre || ' ' || apell_pat || ' ' || apell_mat,direccion,telefono from persona "
		 		+ " where dni='"+dni+"'";
		 ResultSet rs;
       try {
      Connection cnx = getConnection();
      PreparedStatement ps=cnx.prepareStatement(sql);
          rs=ps.executeQuery();
          
          while(rs.next()){       	 
          	ses.setNombresCompletos(rs.getString(1));
          	ses.setDireccion(rs.getString(2)); 
          	ses.setTelefono(rs.getString(3)); 
            
          }
		
	 } catch (Exception e) {
   }
       return ses;
	}
}
