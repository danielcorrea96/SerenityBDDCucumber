package com.accenture.certificacion.serenitycucumber.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public class CheckEmail extends PageObject {
    boolean check;
    @FindBy(xpath="//div[@class=\"TO\"]//a[@href=\"https://mail.google.com/mail/u/0/#sent\"]") private WebElementFacade sends;
    private List<WebElement> list;

    @FindBy(xpath = "(//span[@data-hovercard-id=\"danielcorrea1058@gmail.com\" and text()=\"Daniel\"])[1]") private WebElementFacade emailDefect;

    public void buttonSends() {
        sends.waitUntilEnabled();
        sends.waitUntilVisible().click();
    }

    public void listEmailsSends(String affair) {
        emailDefect.waitUntilVisible();
        list = getDriver().findElements(By.xpath("//span[@class=\"bog\"]//span"));
        check = list.get(51).getText().equals(affair);
       if (check) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }

}
