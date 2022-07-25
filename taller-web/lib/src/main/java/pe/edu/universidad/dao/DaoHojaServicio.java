package pe.edu.universidad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.universidad.dto.*;

public class DaoHojaServicio extends DaoGenerico{
	public void insertarHojaServicio(String id_taller,String id_actividades,String descripcion) {
		String sql = "insert into hoja_servicio(id_hoja,id_taller,id_actividades,fecha,descripcion) "
				+ " values ('HS_'||nextval('sq_hoja_servicio'), ?, ?,current_date, ?) ";
		Connection cnx = getConnection();
		try {
			cnx.setAutoCommit(false);
			PreparedStatement stm = cnx.prepareStatement(sql);
			stm.setString(1,id_taller);
			stm.setString(2,id_actividades);
			stm.setString(3,descripcion);
			stm.execute();
			cnx.commit();
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void editarEstado(String id_taller) {
		String sql = "update taller_servicio set estado='Concluido' where id_taller=?";
		Connection cnx = getConnection();
		try {
			cnx.setAutoCommit(false);
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			stm.setString(1, id_taller);
			stm.execute();
			cnx.commit();
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void precioTotal(String id_taller,int precioTotal) {
		String sql = "update taller_servicio set precio_total="+precioTotal+" where id_taller=?";
		Connection cnx = getConnection();
		try {
			cnx.setAutoCommit(false);
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			stm.setString(1, id_taller);
			stm.execute();
			cnx.commit();
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String CodHoja_Servicio() {
		String id_hoja=null;
		
	   
	    
		String sql="select * from sq_hoja_servicio";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
		PreparedStatement stm = cnx.prepareStatement(sql);
		rs = stm.executeQuery();
        while(rs.next()){
            id_hoja=rs.getString(1); 
        }
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		return id_hoja;
	}
	
	
	
	
	

}
