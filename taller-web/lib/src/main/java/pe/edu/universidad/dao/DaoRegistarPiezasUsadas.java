package pe.edu.universidad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pe.edu.universidad.dto.DtoListaPiezas;
import pe.edu.universidad.dto.DtoPdfHojaServicio;
import pe.edu.universidad.dto.DtoPiezasUsadas;

public class DaoRegistarPiezasUsadas extends DaoGenerico {

	public void RegistarPiezasUsadas(String id_hoja_servicio, List<DtoListaPiezas> lst) {
		String sql = "insert into piezas_venta(id_hoja,id_pieza, precio) values (?, ?, ?)";
		Connection cnx = getConnection();
		try {
			for (DtoListaPiezas dtoListaPiezas : lst) {
				PreparedStatement stm = cnx.prepareStatement(sql);
				stm.setString(1, id_hoja_servicio);
				stm.setString(2, dtoListaPiezas.getId());
				stm.setInt(3, dtoListaPiezas.getPrecio());
				stm.execute();
			}
			cnx.close(); 
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public List<DtoPdfHojaServicio> consultarHojaServicio2(String id_hoja) {
		List<DtoPdfHojaServicio> lst = new ArrayList<DtoPdfHojaServicio>();
		String sql = "select hoja_servicio.id_hoja,hoja_servicio.id_taller,hoja_servicio.id_actividades, "
				+ " taller_servicio.id_electrodomestico, taller_servicio.id_tecnico,persona.nombre || ' ' ||persona.apell_pat || ' ' ||persona.apell_mat, "
				+ " persona.dni,persona.telefono,persona.direccion,electrodomestico.tipo_electrodomestico,electrodomestico.marca,electrodomestico.modelo, "
				+ " electrodomestico.numero_serie,electrodomestico.descripcion,hoja_servicio.descripcion "
				+ " , current_date, now()::time "
				+ " from hoja_servicio "
				+ "	inner join taller_servicio "
				+ "	on hoja_servicio.id_taller=taller_servicio.id_taller "
				+ "	inner join electrodomestico "
				+ "	on electrodomestico.id_electrodomestico = taller_servicio.id_electrodomestico "
				+ "	inner join persona "
				+ "	on persona.dni=electrodomestico.dni "
				+ "	where hoja_servicio.id_hoja ='"+id_hoja+"'";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			rs = stm.executeQuery();
			while (rs.next()) {
				DtoPdfHojaServicio u = new DtoPdfHojaServicio();
				u.setId(rs.getString(1));
				u.setId_taller(rs.getString(2));
				u.setId_actividades(rs.getString(3));
				u.setId_electrodomestico(rs.getString(4));
				u.setId_tecnico(rs.getString(5));
				u.setNombresCompletos(rs.getString(6));
				u.setDni_persona(rs.getString(7));
				u.setTelefono(rs.getString(8));
				u.setDireccion(rs.getString(9));
				u.setElectrodomestico(rs.getString(10));
				u.setMarca(rs.getString(11));
				u.setModelo(rs.getString(12));
				u.setNumero_serie(rs.getString(13));
				u.setDescripcion_falla(rs.getString(14));
				u.setDescripcion_arreglo(rs.getString(15));
				u.setFecha(rs.getString(16));
				u.setHora(rs.getString(17));
			
				lst.add(u);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lst;
	}

	public List<DtoPdfHojaServicio> consultarHojaServicio(String id_hoja) {
		List<DtoPdfHojaServicio> lst2 = new ArrayList<DtoPdfHojaServicio>();
		DtoPdfHojaServicio u=null;
		String sql = "select hoja_servicio.id_hoja,hoja_servicio.id_taller,hoja_servicio.id_actividades, "
				+ " taller_servicio.id_electrodomestico, taller_servicio.id_tecnico,persona.nombre || ' ' ||persona.apell_pat || ' ' ||persona.apell_mat, "
				+ " persona.dni,persona.telefono,persona.direccion,electrodomestico.tipo_electrodomestico,electrodomestico.marca,electrodomestico.modelo, "
				+ " electrodomestico.numero_serie,electrodomestico.descripcion,hoja_servicio.descripcion "
				+ " , current_date, now()::time ,actividades.precio"
				+ " from hoja_servicio "
				+ "	inner join taller_servicio "
				+ "	on hoja_servicio.id_taller=taller_servicio.id_taller "
				+ "	inner join electrodomestico "
				+ "	on electrodomestico.id_electrodomestico = taller_servicio.id_electrodomestico "
				+ "	inner join persona "
				+ "	on persona.dni=electrodomestico.dni "
				+ " inner join actividades "
				+ "	on hoja_servicio.id_actividades=actividades.id_actividades "
				+ "	where hoja_servicio.id_hoja ='"+id_hoja+"'";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			rs = stm.executeQuery();
			while (rs.next()) {
				u = new DtoPdfHojaServicio();
				u.setId(rs.getString(1));
				u.setId_taller(rs.getString(2));
				u.setId_actividades(rs.getString(3));
				u.setId_electrodomestico(rs.getString(4));
				u.setId_tecnico(rs.getString(5));
				u.setNombresCompletos(rs.getString(6));
				u.setDni_persona(rs.getString(7));
				u.setTelefono(rs.getString(8));
				u.setDireccion(rs.getString(9));
				u.setElectrodomestico(rs.getString(10));
				u.setMarca(rs.getString(11));
				u.setModelo(rs.getString(12));
				u.setNumero_serie(rs.getString(13));
				u.setDescripcion_falla(rs.getString(14));
				u.setDescripcion_arreglo(rs.getString(15));
				u.setFecha(rs.getString(16));
				u.setHora(rs.getString(17));
				u.setPrecio(rs.getInt(18));

				
				lst2.add(u);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lst2;
	}
	
	
	
	public int SumaTotal(String id_hoja) {
		int suma=0;
		
	   
	    
		String sql="select sum(piezas.precio) from piezas_venta "
				+ " inner join piezas "
				+ " on piezas_venta.id_pieza=piezas.id_pieza "
				+ " where piezas_venta.id_hoja like '"+id_hoja+"' "
				+ " group by piezas_venta.id_hoja ";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
		PreparedStatement stm = cnx.prepareStatement(sql);
		rs = stm.executeQuery();
        while(rs.next()){
            suma=rs.getInt(1); 
        }
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		return suma;
	}
	
	
	public List<DtoPiezasUsadas> PiezasUsadas(String id_hoja) {
		List<DtoPiezasUsadas> lst2 = new ArrayList<DtoPiezasUsadas>();
		DtoPiezasUsadas u=null;
		String sql = " select piezas_venta.id_pieza, piezas.nombre,piezas.precio from piezas_venta "
				+ " inner join piezas "
				+ " on piezas_venta.id_pieza=piezas.id_pieza "
				+ " where piezas_venta.id_hoja like '"+id_hoja+"'";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			rs = stm.executeQuery();
			while (rs.next()) {
				u = new DtoPiezasUsadas();
				u.setId_piezas(rs.getString(1));
				u.setNombre(rs.getString(2));
				u.setPrecio(rs.getInt(3));

				
				lst2.add(u);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lst2;
	}
	
}
