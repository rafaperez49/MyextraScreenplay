package co.proyectobase.myextra.interactions;

import co.proyectobase.myextra.model.Target;
import net.serenitybdd.screenplay.Tasks;

public class Escribir {
	
	private String texto;
	
	public Escribir(String texto) {
		this.texto = texto;
	}

	public static Escribir elTexto(String texto) {
		return new Escribir(texto);
	}
	
	public EscribirTexto en(Target target)
	{
		int fila= target.getRow();
		int columna = target.getCol();
		return Tasks.instrumented(EscribirTexto.class, texto, fila, columna);
	}
	

}
