package org.sauce.stepdef;

import io.cucumber.java.en.Given;
import org.sauce.pageobjects.BasePage;
import org.sauce.pageobjects.LoginPage;
import org.sauce.utilities.TestContext;

public class LoginStepDef extends BasePage {
    private LoginPage loginPage = new LoginPage();

    TestContext testContext  = TestContext.getInstance();

    private String username = testContext.getProperty("username");
    private String password = testContext.getProperty("password") ;

    @Given("I login to saucedemo page")
    public void i_login_to_saucedemo_page() {
        goToHomePage();
        loginPage.login(username,password);
    }

}
