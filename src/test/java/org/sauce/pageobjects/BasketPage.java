package org.sauce.pageobjects;

import org.openqa.selenium.By;

public class BasketPage extends BasePage{

    private By checkoutButton = By.className("checkout_button");

    public void checkoutProducts() {
        clickOnButton(checkoutButton);
    }
}
