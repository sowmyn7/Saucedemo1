package org.sauce.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    private static final String BROWSER = StringUtils.isEmpty(System.getProperty("browser")) ? "chrome" : System.getProperty("browser");

    public static WebDriver driver;

    public static WebDriver getLocalDriver() {
        switch (BROWSER.toUpperCase()) {
            case "CHROME":
                WebDriverManager.getInstance(ChromeDriver.class).setup();
                return new ChromeDriver();
            case "FIREFOX":
                FirefoxOptions ffOptions = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver(ffOptions);
            default:
                throw new RuntimeException("Browser type " + BROWSER + " Not supported");
        }
    }

    private void getDriver() {
        driver = getLocalDriver();
        driver.manage().window().maximize();
    }

    public void initialiseDriver() throws Exception {
        if (driver != null) {
            return;
        }
        getDriver();
    }
}
