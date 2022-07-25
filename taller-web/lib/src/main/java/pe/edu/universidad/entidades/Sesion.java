package pe.edu.universidad.entidades;


public class Sesion {
	
	  private int id_usuario;
	    private String email;
	   
	    private String estado;
	    private String cargo;
	    private String nombresCompleto;
	    private String dni;
	   
	    
	    
		public String getEstado() {
			return estado;
		}

		public String getNombresCompleto() {
			return nombresCompleto;
		}
		public void setNombresCompleto(String nombresCompleto) {
			this.nombresCompleto = nombresCompleto;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public int getId_usuario() {
			return id_usuario;
		}
		public void setId_usuario(int id_usuario) {
			this.id_usuario = id_usuario;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String Estado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		
		
	    
	    

}
