package pe.edu.universidad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pe.edu.universidad.dto.DtoAtencionTaller;
import pe.edu.universidad.dto.DtoReporteCliente;
import pe.edu.universidad.dto.DtoReporteTecnico;

public class DaoReportes extends DaoGenerico{
	
	
	
	public List<DtoReporteTecnico> reporteTecnicoID(String id_tecnico,String fecha,String fechaFinal) {
		List<DtoReporteTecnico> lst3 = new ArrayList<DtoReporteTecnico>();
		DtoReporteTecnico r = null;
		String sql = "select taller_servicio.id_taller,taller_servicio.id_tecnico,taller_servicio.fecha, "
				+ " persona.dni,persona.nombre || ' ' || persona.apell_pat || ' ' || persona.apell_mat, "
				+ " taller_servicio.id_electrodomestico, "
				+ "electrodomestico.marca,electrodomestico.modelo, "
				+ "electrodomestico.descripcion,servicio.nombre from taller_servicio "
				+ "inner join electrodomestico on taller_servicio.id_electrodomestico = electrodomestico.id_electrodomestico "
				+ " inner join persona on electrodomestico.dni=persona.dni inner join servicio "
				+ " on taller_servicio.id_servicio= servicio.id_servicio "
				+ " where taller_servicio.id_tecnico=? "
				+ " and taller_servicio.fecha "
				+ " between '"+fecha+"' and '"+fechaFinal+"'";
		//String sql2="select nombre from persona where dni=?";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			stm.setString(1, id_tecnico);
			
			rs = stm.executeQuery();
			while (rs.next()) {
				 r = new DtoReporteTecnico();
				r.setId_taller(rs.getString(1));
				r.setId_tecnico(rs.getString(2));
				r.setFecha(rs.getString(3));
				r.setNombresCompletos(rs.getString(4));
				r.setDni_cliente(rs.getString(5));
				r.setId_electro(rs.getString(6));
				r.setMarca(rs.getString(7));
				r.setModelo(rs.getString(8));
				r.setDescripcion(rs.getString(9));
				r.setTipo_Servicio(rs.getString(10));

				
				lst3.add(r);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		}
		return lst3;
	}
	
	//Lista de clientes
	public List<DtoReporteCliente> reporteClienteDni(String dni,String fecha,String fechafin,int precio){
		
		List<DtoReporteCliente> lst2 = new ArrayList<DtoReporteCliente>();
		DtoReporteCliente a=null;
		
		String sql= "select id_taller,electrodomestico.id_electrodomestico, "
				+ " id_tecnico,electrodomestico.dni,persona.nombre || ' ' || persona.apell_pat || ' ' || persona.apell_mat, "
				+ " persona.telefono, persona.direccion, persona.genero,electrodomestico.tipo_electrodomestico, "
				+ " electrodomestico.marca,electrodomestico.modelo, fecha, "
				+ " estado, precio_total "
				+ " from taller_servicio "
				+ " inner join electrodomestico "
				+ " on taller_servicio.id_electrodomestico=electrodomestico.id_electrodomestico "
				+ " inner join persona "
				+ " on electrodomestico.dni=persona.dni "
				+ " where estado like 'Concluido' "
				+ " and taller_servicio.fecha between '"+fecha+"' and '"+fechafin+"' "
				+ " and precio_total <="+precio
				+ " and electrodomestico.dni like '%"+dni+"%' ";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			//stm.setString(1, id_cliente);
			rs = stm.executeQuery();
			while (rs.next()) {
				a = new DtoReporteCliente();
				a.setId_taller(rs.getString(1));
				a.setId_electro(rs.getString(2));
				a.setDni_tec(rs.getString(3));
				a.setDni(rs.getString(4));
				a.setNombresCompletos(rs.getString(5));
				a.setTelefono(rs.getString(6));
				a.setDireccion(rs.getString(7));
				a.setGenero(rs.getString(8));
				a.setElectrodomestico(rs.getString(9));
				a.setMarca(rs.getString(10));
				a.setModelo(rs.getString(11));
				a.setFecha(rs.getString(12));
				a.setEstado(rs.getString(13));
				a.setPrecio(rs.getInt(14));
				lst2.add(a);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lst2;
		
	}
	
}
