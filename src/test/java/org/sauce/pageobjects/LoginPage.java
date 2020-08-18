package org.sauce.pageobjects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By username = By.id("user-name");

    private By passwordElement  = By.id("password");

    private By submit = By.id("login-button");

    public void login(String userName, String password) {
        enterText(username,userName);
        enterText(passwordElement,password);
        clickOnButton(submit);
    }
}
