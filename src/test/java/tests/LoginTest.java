
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority=1)
    public void verifyLoginFieldsDisplayed() {

        test =report.startTest("Verify Login Fields Displayed");

        LoginPage loginPage =new LoginPage(driver);

        test.log(LogStatus.INFO,"Checking Username Field");

        Assert.assertTrue(loginPage.isUsernameFieldDisplayed());

        test.log(LogStatus.INFO,"Checking Password Field");

        Assert.assertTrue(loginPage.isPasswordFieldDisplayed());

        test.log(LogStatus.INFO,"Checking Login Button");

        Assert.assertTrue(loginPage.isLoginButtonDisplayed());

        test.log(LogStatus.PASS,"All Login Fields Displayed Successfully");

        report.endTest(test);
    }

    @Test(priority=2)
    public void verifyValidLogin() {

        test =report.startTest("Verify Valid Login");

        LoginPage loginPage =new LoginPage(driver);

        test.log(LogStatus.INFO,"Entering Username");

        loginPage.enterUsername("john");

        test.log(LogStatus.INFO,"Entering Password");

        loginPage.enterPassword("demo");

        test.log(LogStatus.INFO,"Clicking Login Button");

        loginPage.clickLogin();

        test.log(LogStatus.INFO,"Validating Login");

        Assert.assertTrue(driver.getCurrentUrl().contains("overview"));

        test.log(LogStatus.PASS,"Login Successful");

        report.endTest(test);
    }
}

