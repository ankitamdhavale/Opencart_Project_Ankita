
package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporterManager {

	//Make sure extent_reports folder is already created at the project level
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports report;
	
	
	//getDate()method
	static String reportName = Utility.getDate() + ".html";
	static String projectpath = System.getProperty("user.dir");
	static String extentReportFilePath = projectpath + "\\extent_reports\\" + reportName;
	
	public static ExtentReports getReportInstance() {
		
		htmlReporter = new ExtentHtmlReporter(extentReportFilePath);
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
		
		report.setSystemInfo("OS", "Windows 11 Pro");
		report.setSystemInfo("Environment", "Test");
		report.setSystemInfo("Build Number", "8.8.1");
		report.setSystemInfo("Browser", "Chrome");
		
		htmlReporter.config().setDocumentTitle("Selenium Results");
		htmlReporter.config().setReportName("Selenium Report");
		htmlReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");
		
		
		return report;
	
	
	}
}
