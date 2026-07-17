package utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

    public static ExtentReports report;

    public static ExtentReports getReportInstance() {

        if(report == null) {

            String path =System.getProperty("user.dir")+ "/reports/ExtentReport.html";

            report = new ExtentReports(path, true);
        }

        return report;
    }
}