package co.proyectobase.myextra.tasks;

import java.util.List;

import org.openqa.selenium.Keys;

import co.proyectobase.myextra.interactions.Digitar;
import co.proyectobase.myextra.interactions.Escribir;
import co.proyectobase.myextra.interactions.Ir;
import co.proyectobase.myextra.model.Credenciales;
import static co.proyectobase.myextra.userinterface.LoginPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Loguearse implements Task{
	
	
	private List<Credenciales> datos;


	public Loguearse(List<Credenciales> datos) {
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(Escribir.elTexto(datos.get(0).getusuario()).en(USUARIO));
		actor.attemptsTo(Escribir.elTexto(datos.get(0).getcontraseña()).en(PASSWORD));
		actor.attemptsTo(Digitar.laTecla(Keys.ENTER));
		actor.attemptsTo(Ir.hastaVerTexto(datos.get(0).getTexto()).en(UBICACION));	
	}
	
	public static Loguearse enMyExtra(List<Credenciales> datos) {
		return Tasks.instrumented(Loguearse.class, datos);
	}
	
	

}
