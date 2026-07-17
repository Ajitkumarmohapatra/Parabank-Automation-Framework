package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    // Constructor
    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    // Click Method
    public void click(By locator) {

        driver.findElement(locator).click();
    }

    // SendKeys Method
    public void type(By locator, String text) {

        driver.findElement(locator).sendKeys(text);
    }

    // Get Text Method
    public String getText(By locator) {

        return driver.findElement(locator).getText();
    }

    // Display Validation
    public boolean isElementDisplayed(By locator) {

        return driver.findElement(locator).isDisplayed();
    }

    // Get Current URL
    public String getCurrentURL() {

        return driver.getCurrentUrl();
    }

    // Get Page Title
    public String getPageTitle() {

        return driver.getTitle();
    }

    // Clear Textbox
    public void clear(By locator) {

        driver.findElement(locator).clear();
    }

    // Get WebElement
    public WebElement getElement(By locator) {

        return driver.findElement(locator);
    }
}