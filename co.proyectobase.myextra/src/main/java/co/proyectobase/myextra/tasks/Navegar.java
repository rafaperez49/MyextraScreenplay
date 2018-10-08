package co.proyectobase.myextra.tasks;

import org.openqa.selenium.Keys;

import co.proyectobase.myextra.interactions.Digitar;
import co.proyectobase.myextra.interactions.Escribir;
import co.proyectobase.myextra.interactions.Esperar;
import co.proyectobase.myextra.interactions.Ir;
import static co.proyectobase.myextra.userinterface.MenuPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Navegar implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Escribir.elTexto("1").en(AMBIENTE_PRUEBAS);
		actor.attemptsTo(Digitar.laTecla(Keys.ENTER));
		actor.attemptsTo(Escribir.elTexto("1").en(18, 8));
		actor.attemptsTo(Digitar.laTecla(Keys.ENTER));
		actor.attemptsTo(Escribir.elTexto("1").en(13, 9));
		actor.attemptsTo(Digitar.laTecla(Keys.ENTER));
		actor.attemptsTo(Ir.hastaVerTexto("SQL").en(1, 50));
		actor.attemptsTo(Esperar.aMoment());
	}

	public static Navegar aUnMenu() {
		return Tasks.instrumented(Navegar.class);
	}

}


