package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseTest;
import pages.LandingPage;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest {

    @Test(priority=1)
    public void verifyRegistrationPageNavigation() {

        test = report.startTest("Verify Registration Page Navigation");

        LandingPage landingPage = new LandingPage(driver);

        test.log(LogStatus.INFO, "Clicking Register Link");

        landingPage.clickRegisterLink();

        RegistrationPage rp = new RegistrationPage(driver);

        test.log(LogStatus.INFO, "Verifying Registration Page");

        Assert.assertTrue(rp.isRegistrationTextDisplayed());

        test.log(LogStatus.PASS,
                "Registration Page Opened Successfully");

        report.endTest(test);
    }

    @Test(priority=2)
    public void registerNewUser() {

        test = report.startTest("Register New User");

        LandingPage landingPage = new LandingPage(driver);

        test.log(LogStatus.INFO, "Clicking Register Link");

        landingPage.clickRegisterLink();

        RegistrationPage rp = new RegistrationPage(driver);

        String username ="Ajit" + System.currentTimeMillis();

        test.log(LogStatus.INFO,"Entering Registration Details");

        rp.registerUser("Ajit","Kumar","Mumbai","Mumbai","Maharashtra","400001","9876543210","123456",
                username,
                "test123");

        test.log(LogStatus.INFO,"Clicking Register Button");

        rp.clickRegisterButton();

        test.log(LogStatus.PASS,"User Registration Completed Successfully");

        report.endTest(test);
    }
}