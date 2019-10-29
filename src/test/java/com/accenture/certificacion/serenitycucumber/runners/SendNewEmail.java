package com.accenture.certificacion.serenitycucumber.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/send_new_email.feature",
        glue = "com.accenture.certificacion.serenitycucumber.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class SendNewEmail {
}
