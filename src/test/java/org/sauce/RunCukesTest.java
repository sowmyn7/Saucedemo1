package org.sauce;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.sauce.utilities.DriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
    plugin = {  "json:target/cucumber-report/cucumber.json"},
    strict = true,
    features ="src/test/resources/features",
    tags = {"@e2e"},
    glue =   {"org.sauce.utilities",
              "org.sauce.stepdef"})

public class RunCukesTest extends AbstractTestNGCucumberTests {

    DriverFactory driverFactory = new DriverFactory();

    @BeforeClass
    public void setupDriver() throws Exception {
        driverFactory.initialiseDriver();
    }

    @AfterClass
    public void quitDriver() {
        if (DriverFactory.driver != null) {
            DriverFactory.driver.quit();
        }
    }

}
