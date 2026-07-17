package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LandingPage extends BasePage {

    // Constructor
    public LandingPage(WebDriver driver) {

        super(driver);
    }

    // LOGO 
    By logo = By.xpath("//img[contains(@src,'logo')]");

    //  TEXTBOXES 

    By username = By.name("username");

    By password = By.name("password");

    // ================= BUTTONS =================

    By loginBtn = By.xpath("//input[@value='Log In']");

    // ================= LINKS =================

    By solutionsLink = By.xpath("//li[@class='Solutions']");

    By aboutUsLink = By.linkText("About Us");

    By servicesLink = By.xpath("//a[text()='Services']");

    By productsLink = By.linkText("Products");

    By locationsLink = By.linkText("Locations");

    By adminPageLink = By.linkText("Admin Page");

    By forgotLoginInfo = By.linkText("Forgot login info?");

    By registerLink = By.linkText("Register");

    // ================= IMAGES =================

    By atmImage = By.xpath("//span[@class='services']");

    By latestNewsImage = By.xpath("//h4[text()='Latest News']");

    // ================= TEXTS =================

    By welcomeText = By.xpath("//*[contains(text(),'Welcome to ParaBank')]");

    By customerLoginText = By.xpath("//*[contains(text(),'Customer Login')]");

    By atmServicesText = By.xpath("//*[contains(text(),'ATM Services')]");

    By onlineServicesText = By.xpath("//*[contains(text(),'Online Services')]");

    // ================= ACTION METHODS =================

    public void clickRegisterLink() {

        click(registerLink);
    }

    public void clickForgotLoginInfo() {

        click(forgotLoginInfo);
    }

    public void clickAdminPage() {

        click(adminPageLink);
    }

    public void login(String uname, String pass) {

        type(username, uname);

        type(password, pass);

        click(loginBtn);
    }

    // ================= VALIDATION METHODS =================

    public boolean isLogoDisplayed() {

        return isElementDisplayed(logo);
    }

    public boolean isUsernameDisplayed() {

        return isElementDisplayed(username);
    }

    public boolean isPasswordDisplayed() {

        return isElementDisplayed(password);
    }

    public boolean isLoginButtonDisplayed() {

        return isElementDisplayed(loginBtn);
    }

    public boolean isSolutionsLinkDisplayed() {

        return isElementDisplayed(solutionsLink);
    }

    public boolean isAboutUsLinkDisplayed() {

        return isElementDisplayed(aboutUsLink);
    }

    public boolean isServicesLinkDisplayed() {

        return isElementDisplayed(servicesLink);
    }

    public boolean isProductsLinkDisplayed() {

        return isElementDisplayed(productsLink);
    }

    public boolean isLocationsLinkDisplayed() {

        return isElementDisplayed(locationsLink);
    }

    public boolean isAdminPageLinkDisplayed() {

        return isElementDisplayed(adminPageLink);
    }

    public boolean isForgotLoginInfoDisplayed() {

        return isElementDisplayed(forgotLoginInfo);
    }

    public boolean isRegisterDisplayed() {

        return isElementDisplayed(registerLink);
    }

    public boolean isATMImageDisplayed() {

        return isElementDisplayed(atmImage);
    }

    public boolean isLatestNewsImageDisplayed() {

        return isElementDisplayed(latestNewsImage);
    }

    public boolean isWelcomeTextDisplayed() {

        return isElementDisplayed(welcomeText);
    }

    public boolean isCustomerLoginTextDisplayed() {

        return isElementDisplayed(customerLoginText);
    }

    public boolean isATMServicesTextDisplayed() {

        return isElementDisplayed(atmServicesText);
    }

    public boolean isOnlineServicesTextDisplayed() {

        return isElementDisplayed(onlineServicesText);
    }
}