package co.proyectobase.myextra.util;

import co.proyectobase.myextra.model.Credenciales;

public enum InfoUsuario {
CYEARIAS (new Credenciales("CYEARIAS", "PRUEBAS07"));
	
	private Credenciales credenciales;
	
	InfoUsuario (Credenciales credenciales){
		this.credenciales = credenciales;
	}
	
	public Credenciales getCredenciales() {
		return credenciales;
	}
	
	
}
