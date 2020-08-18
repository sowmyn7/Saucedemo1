package org.sauce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sauce.utilities.DriverFactory;
import org.sauce.utilities.TestContext;

import java.util.List;

public class BasePage extends DriverFactory {

    TestContext testContext  = TestContext.getInstance();

    private static long DRIVER_WAIT_TIME = 30;

    private String url = testContext.getProperty("homeurl") ;

    private WebDriverWait webdriverWait = new WebDriverWait(driver, DRIVER_WAIT_TIME);


    public void enterText(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public void clickOnButton(By element) {
        driver.findElement(element).click();
    }

    public void clickOnButton(WebElement element) {
        element.click();
    }

    public void goToHomePage() {
        driver.navigate().to(url);
    }

    public void selectFromDropDown(By element, String option) {
        Select options = new Select(driver.findElement(element));
        options.selectByValue(option);
    }

    public WebElement waitForVisibilityOfElement(By element) {
        return webdriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }

    public List<WebElement> waitForVisibilityOfElements(List<WebElement> elements) {
        return webdriverWait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public String getTextFromElement(By element) {
        return driver.findElement(element).getText();
    }
}
