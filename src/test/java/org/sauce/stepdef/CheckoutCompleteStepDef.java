package org.sauce.stepdef;

import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.sauce.pageobjects.BasePage;
import org.sauce.pageobjects.CheckoutCompletePage;

import static org.hamcrest.CoreMatchers.is;

public class CheckoutCompleteStepDef extends BasePage {

    private final CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @Then("I should see successful checkout message")
    public void i_should_see_successful_checkout_message() {
        MatcherAssert.assertThat("Checkout is not completed", driver.getCurrentUrl().contains("checkout-complete.html"));
        MatcherAssert.assertThat("Checkout is not completed", checkoutCompletePage.getCompletionText(), is("THANK YOU FOR YOUR ORDER"));
    }
}
