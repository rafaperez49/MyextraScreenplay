package co.proyectobase.myextra.interactions;

import net.serenitybdd.screenplay.Tasks;
import co.proyectobase.myextra.model.Target;

public class Ir{

	private String texto;
	
	public Ir(String texto) {
		
		this.texto = texto;
	}

	public static Ir hastaVerTexto (String texto)
	{
		return new Ir(texto);
		
	}
	
	public Hasta en(Target target) {
		int fila= target.getRow();
		int columna = target.getCol();
		return Tasks.instrumented(Hasta.class, texto, fila, columna);
		
	}
	
	

}
