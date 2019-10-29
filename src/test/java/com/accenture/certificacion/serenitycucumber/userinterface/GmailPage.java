package com.accenture.certificacion.serenitycucumber.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")
public class GmailPage extends PageObject {
    @FindBy(xpath="//input[@id='identifierId']") private WebElementFacade user;
    @FindBy(xpath="//input[@name='password']") private WebElementFacade password;

    public void enterKeywords(String username, String password) {
        user.waitUntilClickable().typeAndEnter(username);
        this.password.waitUntilClickable().typeAndEnter(password);

    }
}
