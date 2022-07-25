package pe.edu.universidad.dto;

import java.io.Serializable;

public class DtoReporteTecnico implements Serializable
{
	String id_taller;
	
	String id_tecnico;
	String fecha;
	String dni_cliente;
	String nombresCompletos;
	String id_electro;
	String modelo;
	String marca;
	String descripcion;
	String tipo_Servicio;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getId_taller() {
		return id_taller;
	}
	public void setId_taller(String id_taller) {
		this.id_taller = id_taller;
	}
	public String getId_tecnico() {
		return id_tecnico;
	}
	public void setId_tecnico(String id_tecnico) {
		this.id_tecnico = id_tecnico;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDni_cliente() {
		return dni_cliente;
	}
	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}
	public String getNombresCompletos() {
		return nombresCompletos;
	}
	public void setNombresCompletos(String nombresCompletos) {
		this.nombresCompletos = nombresCompletos;
	}
	public String getId_electro() {
		return id_electro;
	}
	public void setId_electro(String id_electro) {
		this.id_electro = id_electro;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo_Servicio() {
		return tipo_Servicio;
	}
	public void setTipo_Servicio(String tipo_Servicio) {
		this.tipo_Servicio = tipo_Servicio;
	}
	
	
	
	
}
