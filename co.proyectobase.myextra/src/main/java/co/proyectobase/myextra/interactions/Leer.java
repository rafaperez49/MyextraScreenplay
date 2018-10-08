package co.proyectobase.myextra.interactions;

public class Leer {
	

	
	public static Leer elTexto(){
		
		return new Leer();
	}
	
	public LeerTexto desde(int fila, int columna)
	{
		return new LeerTexto(fila, columna);
	}

	
	
	
}
