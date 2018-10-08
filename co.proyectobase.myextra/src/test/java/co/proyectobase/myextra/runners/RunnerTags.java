package co.proyectobase.myextra.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(			
		features="src/test/resources/features/acceder_myextra.feature",
		tags= "@CasoExitoso",
		glue="co.proyectobase.myextra.stepdefinitions.serenity",
		snippets=SnippetType.CAMELCASE	)
public class RunnerTags {

}
