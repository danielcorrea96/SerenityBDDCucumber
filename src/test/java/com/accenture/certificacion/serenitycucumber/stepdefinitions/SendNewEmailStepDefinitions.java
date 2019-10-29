package com.accenture.certificacion.serenitycucumber.stepdefinitions;

import com.accenture.certificacion.serenitycucumber.steps.Gmail;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SendNewEmailStepDefinitions {

    @Steps
    Gmail user;

    @Given("^Given that Accenture Testing enters with (.*) and (.*)$")
    public void givenThatAccentureTestingEntersWithAccentureTestingAndAccenture(String arg1, String arg2) {
        user.isTheHomePage();
        user.entersCredentials(arg1,arg2);
    }

    @When("^Accenture Testing wants to send a new email to (.*) with subject (.*) and body (.*)$")
    public void accentureTestingWantsToSendANewEmailToDaniel(String arg1, String arg2, String arg3) {
        user.newEmail();
        user.writeNewEmail(arg1, arg2, arg3);
    }

    @Then("^Accenture Testing expects to have sent your message to your friend with the subject (.*)$")
    public void accentureTestingExpectsToHaveSentYourMessageToYourFriendWithTheSubjectAutomationOfTests(String arg1) {
        user.emailsSends();
        user.checkListEmails(arg1);
    }
}
