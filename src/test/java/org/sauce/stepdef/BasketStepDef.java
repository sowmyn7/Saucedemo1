package org.sauce.stepdef;

import io.cucumber.java.en.When;
import org.sauce.pageobjects.BasketPage;

public class BasketStepDef {

    private BasketPage basketPage = new BasketPage();

    @When("I Checkout the products")
    public void i_Checkout_the_prdocuts() {
        basketPage.checkoutProducts();
    }
}
