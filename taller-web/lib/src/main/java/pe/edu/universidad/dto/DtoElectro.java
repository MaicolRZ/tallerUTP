package pe.edu.universidad.dto;

public class DtoElectro {
	private String id;
	private String dni;
	
	private String tipo_electrodomestico;
	private String marca;
	private String modelo;
	private String numero_Serie;
	private String descripcion;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTipo_electrodomestico() {
		return tipo_electrodomestico;
	}
	public void setTipo_electrodomestico(String tipo_electrodomestico) {
		this.tipo_electrodomestico = tipo_electrodomestico;
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
	public String getNumero_Serie() {
		return numero_Serie;
	}
	public void setNumero_Serie(String numero_Serie) {
		this.numero_Serie = numero_Serie;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
