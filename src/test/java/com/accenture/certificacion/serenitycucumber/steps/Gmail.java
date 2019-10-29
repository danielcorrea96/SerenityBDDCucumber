package com.accenture.certificacion.serenitycucumber.steps;

import com.accenture.certificacion.serenitycucumber.userinterface.CheckEmail;
import com.accenture.certificacion.serenitycucumber.userinterface.GmailPage;
import com.accenture.certificacion.serenitycucumber.userinterface.WritePage;
import net.thucydides.core.annotations.Step;

public class Gmail {
    GmailPage gmail;
    WritePage write;
    CheckEmail check;

    @Step
    public void isTheHomePage() {
        gmail.open();
    }

    @Step
    public void entersCredentials(String username, String password) {
        gmail.enterKeywords(username, password);
    }
    @Step
    public void newEmail() {
        write.newEmail();
    }

    @Step
    public void writeNewEmail(String destination, String affair, String body) {
        write.writeEmail(destination, affair, body);
    }

    @Step
    public void emailsSends() {
        check.buttonSends();
    }
    @Step
    public void checkListEmails(String affair) {
        check.listEmailsSends(affair);
    }

}
