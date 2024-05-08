package org.prithvi.score;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
    static ExtentReports reports;

    public static ExtentReports getReporterObject() {
        String path = System.getProperty("user.dir") + "//target//Reports//index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("TheScoreAutomationTestCase");
        reporter.config().setDocumentTitle("Test Results");

        reports = new ExtentReports();
        reports.attachReporter(reporter);
        reports.setSystemInfo("Tester", "Prithvi Kanumuri");
        return reports;
    }
}
