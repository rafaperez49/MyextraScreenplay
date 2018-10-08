package co.proyectobase.myextra.stepdefinitions.serenity;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.proyectobase.myextra.model.Credenciales;
import co.proyectobase.myextra.questions.LaRespuesta;
import co.proyectobase.myextra.tasks.Abrir;
import co.proyectobase.myextra.tasks.Loguearse;
import co.proyectobase.myextra.tasks.Navegar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class MyExtraStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver suNavegador;
	private Actor yeison = Actor.named("Yeison");
	
	@Before public void cargaInicial() {
		yeison.can(BrowseTheWeb.with(suNavegador));
	}
	
	@Dado("^que Yeison desea realizar una consulta en AS(\\d+)$")
	public void queYeisonDeseaRealizarUnaConsultaEnAS(int arg1) throws Exception {
		yeison.wasAbleTo(Abrir.myExtra());
	}


	@Cuando("^el realiza la autenticación con el usuario$")
	public void elRealizaLaAutenticación(List<Credenciales> credenciales)  throws Exception  {
		yeison.attemptsTo(Loguearse.enMyExtra(credenciales));		
	}
	
	@Cuando("^el navega al menú$")
	public void elNavegaAlMenú() throws Exception {
		yeison.attemptsTo(Navegar.aUnMenu());
	}


	@Entonces("^el verifica que inicio sesión correctamente$")
	public void elVerificaQueInicioSesiónCorrectamente() throws Exception {
		yeison.should(seeThat(LaRespuesta.es(), equalTo("Introducir sentencias SQL")));
	}


}
