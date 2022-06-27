package pe.edu.universidad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pe.edu.universidad.dto.DtoAtencionTaller;
import pe.edu.universidad.dto.DtoHojaServicio;
import pe.edu.universidad.dto.DtoPiezas;
import pe.edu.universidad.entidades.Electro;
import pe.edu.universidad.entidades.Piezas;
import pe.edu.universidad.entidades.Usuario;


public class DaoElectro extends DaoGenerico {
	
	
	

	
	public List<Electro> listarElectrodomesticos() {
		List<Electro> lst2 = new ArrayList<Electro>();
		DtoAtencionTaller a = null;
		String sql = "select * from electrodomestico order by id_electrodomestico";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			rs = stm.executeQuery();
			while (rs.next()) {
				Electro u = new Electro();
				u.setId(rs.getString(1));
				u.setDni(rs.getString(2));
				u.setTipo_electrodomestico(rs.getString(3));
				u.setMarca(rs.getString(4));
				u.setModelo(rs.getString(5));
				u.setNumero_Serie(rs.getString(6)); 
				u.setDescripcion(rs.getString(7)); 


				
				lst2.add(u);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lst2;
	}
	public void insertarElectro(String dni,String tipo,String marca,String modelo,String n_serie ) {
		
		String sql = "insert into electrodomestico(id_electrodomestico,dni,tipo_electrodomestico,marca,modelo,numero_serie) values ('ELC_'||nextval('sq_electro'),?,?,?,?,?)";
		
		Connection cnx = getConnection();
		try {
			cnx.setAutoCommit(false);
			PreparedStatement stm = cnx.prepareStatement(sql);
		
			stm.setString(1, dni);
			stm.setString(2, tipo);
			stm.setString(3, marca);
			stm.setString(4, modelo);
			stm.setString(5, n_serie);
			stm.execute();
			cnx.commit();
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	


	//Editar
	public void editarElectro(String id, String descripcion, String id_tecnico) {
		String sql = "update electrodomestico set descripcion=? where id_electrodomestico=?";
		String sql2="insert into atencion_taller(id_taller, id_electrodomestico,fecha,id_tecnico) values('ATL_'||nextval('sq_taller'),?,current_date,?)";
		Connection cnx = getConnection();
		try {
			cnx.setAutoCommit(false);
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			stm.setString(1, descripcion);
			stm.setString(2, id);
			PreparedStatement stm2 = cnx.prepareStatement(sql2);
			stm2.setString(1, id);
			stm2.setString(2, id_tecnico);
			stm.execute();
			stm2.execute();
			cnx.commit();
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
}
