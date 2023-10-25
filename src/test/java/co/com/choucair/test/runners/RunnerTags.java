package co.com.choucair.test.runners;




//import cucumber.api.CucumberOptions;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registrousuario.feature",
        tags = "@stories",
        glue = "co.com.choucair.test.stepdefinitions",
        snippets = CucumberOptions.SnippetType.UNDERSCORE)

public class RunnerTags {
}
