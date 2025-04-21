package org.example.ui.pages.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TextBoxPage {

    public SelenideElement getUserForm() {
        return $x("//form[@id='userForm']");
    }

    public SelenideElement getUserName() {
        return $x("//input[@id='userName']");
    }

    public SelenideElement getUserEmail() {
        return $x("//input[@id='userEmail']");
    }

    public SelenideElement getCurrentAddress() {
        return $x("//textarea[@id='currentAddress']");
    }

    public SelenideElement getPermanentAddress() {
        return $x("//textarea[@id='permanentAddress']");
    }

    public SelenideElement getSubmitButton() {
        return $x("//button[@id='submit']");
    }

    public SelenideElement getNameFromAnswer() {
        return $x("//input[@id='name']");
    }

    public SelenideElement getEmailFromAnswer() {
        return $x("//input[@id='email']");
    }

    public SelenideElement getCurrentAddressFromAnswer() {
        return $x("//input[@id='currentAddress']");
    }

    public SelenideElement getPermanentAddressFromAnswer() {
        return $x("//input[@id='permanentAddress']");
    }
}
