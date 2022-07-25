package pe.edu.universidad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pe.edu.universidad.dto.DtoHorarios;


public class DaoHorarios extends DaoGenerico{
	
	public List<DtoHorarios> listarHorarios() {
		List<DtoHorarios> lst2 = new ArrayList<DtoHorarios>();
		
		String sql = " select horarios_tecnico.id,dni_tecnico,persona.nombre || ' ' || persona.apell_pat || ' ' || persona.apell_mat, "
				+ " hora_inicio,hora_fin,horarios_tecnico.fecha,horarios_tecnico.estado, persona.experiencia,persona.genero "
				+ " from horarios_tecnico "
				+ " inner join persona "
				+ " on horarios_tecnico.dni_tecnico=persona.dni "
				+ " where estado='Disponible' "
				+ " and fecha between (now()::date) and '2022-12-31'"
				+ " order by fecha asc";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			rs = stm.executeQuery();
			while (rs.next()) {
				DtoHorarios u = new DtoHorarios();
				u.setId_horario(rs.getString(1));
				u.setDni_tecnico(rs.getString(2));
				u.setNombresCompletos(rs.getString(3));
				u.setHora_inicio(rs.getString(4));
				u.setHora_fin(rs.getString(5));
				u.setFecha(rs.getString(6));
				u.setEstado(rs.getString(7));
				u.setExperiencia(rs.getString(8));
				u.setGenero(rs.getString(9));
				
				lst2.add(u);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lst2;
	}
	
	public List<DtoHorarios> listarTecnicosHorario(String fecha) {
		List<DtoHorarios> lst2 = new ArrayList<DtoHorarios>();
		
		String sql = " select horarios_tecnico.id,dni_tecnico,persona.nombre || ' ' || persona.apell_pat || ' ' || persona.apell_mat, "
				+ " hora_inicio,hora_fin,horarios_tecnico.fecha,horarios_tecnico.estado, persona.experiencia,persona.genero "
				+ " from horarios_tecnico "
				+ " inner join persona "
				+ " on horarios_tecnico.dni_tecnico=persona.dni "
				+ " where estado='Disponible' "
				+ " and fecha between '"+fecha+"' and '2022-12-31' ";
		Connection cnx = getConnection();
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			
			rs = stm.executeQuery();
			while (rs.next()) {
				DtoHorarios u = new DtoHorarios();
				u.setId_horario(rs.getString(1));
				u.setDni_tecnico(rs.getString(2));
				u.setNombresCompletos(rs.getString(3));
				u.setHora_inicio(rs.getString(4));
				u.setHora_fin(rs.getString(5));
				u.setFecha(rs.getString(6));
				u.setEstado(rs.getString(7));
				u.setExperiencia(rs.getString(8));
				u.setGenero(rs.getString(9));
				
				lst2.add(u);
			}
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lst2;
	}
	//insertar horario
	public void insertarHorario(String dni_tecnico, String hora_inicio,String hora_fin,String fecha) {
		String sql = "insert into horarios_tecnico(id, dni_tecnico, hora_inicio, hora_fin, estado, fecha) "
				+ " values ('HR_'||nextval('sq_horario'), ?,'"+hora_inicio+"','"+hora_fin+"','Disponible','"+fecha+"')";
		Connection cnx = getConnection();
		try {
			cnx.setAutoCommit(false);
			PreparedStatement stm = cnx.prepareStatement(sql);
			stm.setString(1, dni_tecnico);
			
			stm.execute();
			cnx.commit();
			cnx.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	

}
