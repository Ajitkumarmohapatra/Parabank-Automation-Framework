package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class RegistrationPage extends BasePage {

    // Constructor
    public RegistrationPage(WebDriver driver) {

        super(driver);
    }

    // ================= LOCATORS =================

    By firstName = By.id("customer.firstName");

    By lastName = By.id("customer.lastName");

    By address = By.id("customer.address.street");

    By city = By.id("customer.address.city");

    By state = By.id("customer.address.state");

    By zipCode = By.id("customer.address.zipCode");

    By phone = By.id("customer.phoneNumber");

    By ssn = By.id("customer.ssn");

    By username = By.id("customer.username");

    By password = By.id("customer.password");

    By confirmPassword = By.id("repeatedPassword");

    By registerBtn = By.xpath("//input[@value='Register']");

    By registrationText =
            By.xpath("//h1[contains(text(),'Signing up is easy!')]");

    // ================= ACTION METHODS =================

    public void enterFirstName(String fname) {

        type(firstName, fname);
    }

    public void enterLastName(String lname) {

        type(lastName, lname);
    }

    public void enterAddress(String addr) {

        type(address, addr);
    }

    public void enterCity(String cityName) {

        type(city, cityName);
    }

    public void enterState(String stateName) {

        type(state, stateName);
    }

    public void enterZipCode(String zip) {

        type(zipCode, zip);
    }

    public void enterPhone(String phoneNum) {

        type(phone, phoneNum);
    }

    public void enterSSN(String ssnNum) {

        type(ssn, ssnNum);
    }

    public void enterUsername(String uname) {

        type(username, uname);
    }

    public void enterPassword(String pwd) {

        type(password, pwd);
    }

    public void enterConfirmPassword(String cpwd) {

        type(confirmPassword, cpwd);
    }

    public void clickRegisterButton() {

        click(registerBtn);
    }

    // ================= COMBINED REGISTRATION METHOD =================

    public void registerUser(String fname,String lname, String addr,String cityName, String stateName,
            String zip,
            String phoneNum,
            String ssnNum,
            String uname,
            String pwd) {

        enterFirstName(fname);
        enterLastName(lname);
        enterAddress(addr);
        enterCity(cityName);
        enterState(stateName);
        enterZipCode(zip);
        enterPhone(phoneNum);
        enterSSN(ssnNum);
        enterUsername(uname);
        enterPassword(pwd);
        enterConfirmPassword(pwd);
    }

    // ================= VALIDATION METHODS =================

    public boolean isRegistrationTextDisplayed() {

        return isElementDisplayed(registrationText);
    }
}