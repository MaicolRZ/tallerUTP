package pe.edu.universidad.dto;

public class DtoHorarios {
	private String id_horario;
	private String dni_tecnico;
	private String nombresCompletos;
	private String hora_inicio;
	private String hora_fin;
	private String fecha;
	private String estado;
	private String experiencia;
	private String genero;
	
	public String getId_horario() {
		return id_horario;
	}
	public void setId_horario(String id_horario) {
		this.id_horario = id_horario;
	}
	public String getDni_tecnico() {
		return dni_tecnico;
	}
	public void setDni_tecnico(String dni_tecnico) {
		this.dni_tecnico = dni_tecnico;
	}
	public String getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public String getHora_fin() {
		return hora_fin;
	}
	public void setHora_fin(String hora_fin) {
		this.hora_fin = hora_fin;
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
	public String getNombresCompletos() {
		return nombresCompletos;
	}
	public void setNombresCompletos(String nombresCompletos) {
		this.nombresCompletos = nombresCompletos;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
