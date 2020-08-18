package org.sauce.stepdef;

import io.cucumber.java.en.And;
import org.sauce.pageobjects.CheckoutPage;

public class CheckoutStepDef {

    private final CheckoutPage checkoutPage = new CheckoutPage();

    @And("I enter personal details on Checkout Form")
    public void iEnterPersonalDetailsOnCheckoutForm() {
        checkoutPage.enterCheckoutInformation();
        checkoutPage.clickFinishOnOverviewPage();
    }
}
