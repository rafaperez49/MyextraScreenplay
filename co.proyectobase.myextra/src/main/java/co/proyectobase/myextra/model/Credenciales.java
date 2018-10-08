package co.proyectobase.myextra.model;

public class Credenciales {
	
	private String usuario;
	private String contraseña;
	private String texto;
		
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Credenciales(String usuario, String contraseña) {
		this.usuario = usuario;
		this.contraseña = contraseña; 
	}
	
	public String getusuario() {
		
		return usuario;
	}
	
   public String getcontraseña() {
		
		return contraseña;
	}

}
