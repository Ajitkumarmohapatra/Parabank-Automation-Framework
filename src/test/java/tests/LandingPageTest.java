package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseTest;
import pages.LandingPage;

public class LandingPageTest extends BaseTest {

    @Test
    public void verifyLandingPageUIElements() {

        test = report.startTest("Verify Landing Page UI Elements");

        LandingPage lp = new LandingPage(driver);

        test.log(LogStatus.INFO, "Verifying Logo");
        Assert.assertTrue(lp.isLogoDisplayed());

        test.log(LogStatus.INFO, "Verifying Username Field");
        Assert.assertTrue(lp.isUsernameDisplayed());

        test.log(LogStatus.INFO, "Verifying Password Field");
        Assert.assertTrue(lp.isPasswordDisplayed());

        test.log(LogStatus.INFO, "Verifying Login Button");
        Assert.assertTrue(lp.isLoginButtonDisplayed());

        test.log(LogStatus.INFO, "Verifying Links");

        Assert.assertTrue(lp.isSolutionsLinkDisplayed());

        Assert.assertTrue(lp.isAboutUsLinkDisplayed());
        
        Assert.assertTrue(lp.isServicesLinkDisplayed());
        
        Assert.assertTrue(lp.isProductsLinkDisplayed());
        
        Assert.assertTrue(lp.isLocationsLinkDisplayed());

        Assert.assertTrue(lp.isAdminPageLinkDisplayed());
        
        Assert.assertTrue(lp.isForgotLoginInfoDisplayed());

        Assert.assertTrue(lp.isRegisterDisplayed());
        
        test.log(LogStatus.INFO, "Verifying Images");
        
        Assert.assertTrue(lp.isATMImageDisplayed());
        
        Assert.assertTrue(lp.isLatestNewsImageDisplayed());
        
        test.log(LogStatus.INFO, "Verifying Texts");

     //   Assert.assertTrue(lp.isWelcomeTextDisplayed());
        
        Assert.assertTrue(lp.isCustomerLoginTextDisplayed());
        
        Assert.assertTrue(lp.isATMServicesTextDisplayed());

        Assert.assertTrue(lp.isOnlineServicesTextDisplayed());

        test.log(LogStatus.PASS,"All Landing Page Elements Verified Successfully");

        report.endTest(test);
    }
}