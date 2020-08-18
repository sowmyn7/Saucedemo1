package org.sauce.pageobjects;

import org.openqa.selenium.By;

public class CheckoutCompletePage extends BasePage{

    private By completeHeader = By.className("complete-header");

    public String getCompletionText() {
        return getTextFromElement(completeHeader);
    }

}

