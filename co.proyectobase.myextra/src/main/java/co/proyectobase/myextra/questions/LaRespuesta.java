package co.proyectobase.myextra.questions;

import co.proyectobase.myextra.interactions.Leer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaRespuesta implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return null;//Leer.elTexto().desde(1, 28).conLongitud(25);
	}

	public static LaRespuesta es() {
		return new LaRespuesta();
	}
	

}
