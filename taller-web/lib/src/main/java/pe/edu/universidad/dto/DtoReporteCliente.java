package pe.edu.universidad.dto;

import java.io.Serializable;

public class DtoReporteCliente implements Serializable{
	String id_taller;
	String id_electro;
	String dni_tec;
	String dni;
	String nombresCompletos;
	String telefono;
	String direccion;
	String genero;
	String electrodomestico;
	String marca;
	String modelo;
	String fecha;
	String estado;
	int precio;

	public String getNombresCompletos() {
		return nombresCompletos;
	}

	public void setNombresCompletos(String nombresCompletos) {
		this.nombresCompletos = nombresCompletos;
	}

	public String getId_taller() {
		return id_taller;
	}

	public void setId_taller(String id_taller) {
		this.id_taller = id_taller;
	}

	public String getId_electro() {
		return id_electro;
	}

	public void setId_electro(String id_electro) {
		this.id_electro = id_electro;
	}

	public String getDni_tec() {
		return dni_tec;
	}

	public void setDni_tec(String dni_tec) {
		this.dni_tec = dni_tec;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getElectrodomestico() {
		return electrodomestico;
	}

	public void setElectrodomestico(String electrodomestico) {
		this.electrodomestico = electrodomestico;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}


	
	
}
