package co.com.sofka.runner.login;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/Login.feature"},
        glue = {"co.com.sofka.stepdefinition.login"}

)

public class LoginTest {
}
