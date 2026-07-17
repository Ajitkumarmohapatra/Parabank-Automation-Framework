package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage {

    // Constructor
    public LoginPage(WebDriver driver) {

        super(driver);
    }

    // ================= LOCATORS =================

    By username = By.name("username");

    By password = By.name("password");

    By loginBtn = By.xpath("//input[@value='Log In']");

    // ================= ACTION METHODS =================

    public void enterUsername(String usernameText) {

        type(username, usernameText);
    }

    public void enterPassword(String passwordText) {

        type(password, passwordText);
    }

    public void clickLogin() {

        click(loginBtn);
    }

    // Combined Login Method

    public void loginToApplication(String uname, String pass) {

        type(username, uname);

        type(password, pass);

        click(loginBtn);
    }

    // ================= VALIDATION METHODS =================

    public boolean isUsernameFieldDisplayed() {

        return isElementDisplayed(username);
    }

    public boolean isPasswordFieldDisplayed() {

        return isElementDisplayed(password);
    }

    public boolean isLoginButtonDisplayed() {

        return isElementDisplayed(loginBtn);
    }
}