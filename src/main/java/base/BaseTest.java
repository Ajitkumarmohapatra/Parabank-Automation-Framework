
package base;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import common.FrameworkCommon;
import utilities.ExtentManager;

public class BaseTest extends FrameworkCommon {

    public static ExtentReports report;

    public ExtentTest test;

    @BeforeSuite
    public void setupReport(){
    		if(report ==null){
    			report =ExtentManager.getReportInstance();
    		}     
    }

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

    @AfterSuite
    public void tearDownReport() {

        report.flush();

        report.close();
    }
}

