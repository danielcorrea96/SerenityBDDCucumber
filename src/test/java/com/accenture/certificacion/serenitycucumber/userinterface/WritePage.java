package com.accenture.certificacion.serenitycucumber.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WritePage extends PageObject {

    @FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
    private WebElementFacade write;
    @FindBy(name="to") private WebElementFacade destination;
    @FindBy(name="subjectbox") private WebElementFacade affair;
    @FindBy(xpath="//*[@class='Am Al editable LW-avf tS-tW' and @aria-label='Cuerpo del mensaje']") private WebElementFacade body;
    @FindBy(xpath="//*[@class='J-J5-Ji btA']") private WebElementFacade send;

    public void newEmail() {
        write.waitUntilVisible().click();
    }

    public void writeEmail(String destination, String affair, String body) {
        this.destination.waitUntilClickable().sendKeys(destination + "\n");
        this.affair.waitUntilClickable().sendKeys(affair);
        this.body.waitUntilClickable().sendKeys(body);
        this.send.waitUntilClickable().click();

    }
}
