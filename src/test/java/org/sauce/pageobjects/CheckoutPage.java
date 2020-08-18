package org.sauce.pageobjects;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage{

    private By firstNameInputField = By.id("first-name");

    private By lastNameInputField = By.id("last-name");

    private By postcode = By.id("postal-code");

    private By checkoutButton = By.cssSelector(".cart_button");


    public void enterCheckoutInformation() {
        enterText(firstNameInputField,"Test");
        enterText(lastNameInputField,"LastNameTest");
        enterText(postcode,"TES T11");
        clickOnButton(checkoutButton);
    }

    public void clickFinishOnOverviewPage() {
        clickOnButton(checkoutButton);
    }

}
