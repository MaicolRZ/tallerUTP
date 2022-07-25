package pe.edu.universidad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pe.edu.universidad.dto.DtoAtencionTaller;
import pe.edu.universidad.dto.DtoElectro;
import pe.edu.universidad.entidades.Cliente;
import pe.edu.universidad.entidades.Electro;


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
	
	//Lista con dni
	public List<DtoElectro> listarElectrodomesticosDNI(String dni) {
		List<DtoElectro> lst2 = new ArrayList<DtoElectro>();
		DtoElectro a=null;
		String sql = "select * from electrodomestico where dni=?";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			stm.setString(1, dni);
			rs = stm.executeQuery();
			while (rs.next()) {
				a = new DtoElectro();
				a.setId(rs.getString(1));
				a.setDni(rs.getString(2));
				a.setTipo_electrodomestico(rs.getString(3));
				a.setMarca(rs.getString(4));
				a.setModelo(rs.getString(5));
				a.setNumero_Serie(rs.getString(6)); 
				a.setDescripcion(rs.getString(7)); 


				
				lst2.add(a);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lst2;
	}
	
	
	
	//Insertar desde Tecnico
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
	//Insertar desde cliente
	public void insertarElectroCliente(String dni,String tipo,String marca,String modelo,String n_serie,String descripcion) {
		
		String sql = "insert into electrodomestico(id_electrodomestico,dni,tipo_electrodomestico,marca,modelo,numero_serie,descripcion) values ('ELC_'||nextval('sq_electro'),?,?,?,?,?,?)";
		
		Connection cnx = getConnection();
		try {
			cnx.setAutoCommit(false);
			PreparedStatement stm = cnx.prepareStatement(sql);
		
			stm.setString(1, dni);
			stm.setString(2, tipo);
			stm.setString(3, marca);
			stm.setString(4, modelo);
			stm.setString(5, n_serie);
			stm.setString(6, descripcion);
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
		String sql2="insert into taller_servicio(id_taller, id_electrodomestico,fecha,id_tecnico,id_servicio,estado) values('ATL_'||nextval('sq_taller'),?,current_date,?,'SRV_01','En Espera')";
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
	
	
	public void visitaDomicilio(String id_electro, String id_tecnico,String id_horario,String fecha) {
		String sql = "update horarios_tecnico set estado ='No disponible' where id=?";
		String sql2="insert into taller_servicio(id_taller, id_electrodomestico,fecha,id_tecnico,id_servicio,horario_tecnico,estado) "
				+ " values('ATL_'||nextval('sq_taller'), ? , date(?) , ? ,'SRV_02', ?,'Pendiente' ) ";
		Connection cnx = getConnection();
		try {
			cnx.setAutoCommit(false);
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			stm.setString(1, id_horario);

			PreparedStatement stm2 = cnx.prepareStatement(sql2);
			stm2.setString(1, id_electro);
			stm2.setString(2, fecha);
			stm2.setString(3, id_tecnico);
			stm2.setString(4, id_horario);
			stm.execute();
			stm2.execute();
			cnx.commit();
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
	
	
	public List<DtoAtencionTaller> consultarPersonaporID(String id_cliente) {
		List<DtoAtencionTaller> lst2 = new ArrayList<DtoAtencionTaller>();
		DtoAtencionTaller a = null;
		String sql = "select persona.dni,electrodomestico.id_electrodomestico,nombre || ' ' || apell_pat || ' ' || apell_mat, electrodomestico.marca, electrodomestico.tipo_electrodomestico, electrodomestico.modelo, electrodomestico.numero_serie from persona inner join electrodomestico on electrodomestico.dni = persona.dni where persona.dni=? and electrodomestico.descripcion is null";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			stm.setString(1, id_cliente);
			rs = stm.executeQuery();
			while (rs.next()) {
				a = new DtoAtencionTaller();
				a.setDni_persona(rs.getString(1));
				a.setId_electro(rs.getString(2));
				a.setNombresCompleto(rs.getString(3));
				a.setMarca(rs.getString(4));
				a.setTipo_electrodomestico(rs.getString(5));
				a.setModelo(rs.getString(6));
				a.setNumero_serie(rs.getString(7)); 

				
				lst2.add(a);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lst2;
	}
	Electro elec= new Electro();
	
	public Electro lista(String id_elec) {
		
		 String sql="select id_electrodomestico,tipo_electrodomestico,marca,modelo,numero_serie,descripcion from electrodomestico where id_electrodomestico= '"+id_elec+"' ";
		 ResultSet rs;
       try {
      Connection cnx = getConnection();
      PreparedStatement ps=cnx.prepareStatement(sql);
          rs=ps.executeQuery();
          
          while(rs.next()){       	 
          	 elec.setId(rs.getString(1));
          	 elec.setTipo_electrodomestico(rs.getString(2));
          	 elec.setMarca(rs.getString(3));
          	 elec.setModelo(rs.getString(4));
          	 elec.setNumero_Serie(rs.getString(5));
          	 elec.setDescripcion(rs.getString(6));
          }
		
	 } catch (Exception e) {
   }
   
	return elec;
	}
	public void AtencionTallerCotizacionAceptada(String id) {
		String sql = " update taller_servicio set estado='Pendiente' "
				+ " where id_taller = ?";
		
		Connection cnx = getConnection();
		try {
			cnx.setAutoCommit(false);
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			stm.setString(1, id);
			
			stm.execute();
			
			cnx.commit();
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void AtencionTallerCotizacionRechazada(String id) {
		String sql = " update taller_servicio set estado='Concluido', precio_total='25' "
				+ " where id_taller = ?";
		
		Connection cnx = getConnection();
		try {
			cnx.setAutoCommit(false);
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			stm.setString(1, id);
			
			stm.execute();
			
			cnx.commit();
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
