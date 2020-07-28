package Revanth;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AppiumTest {
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Auto Results");
		reporter.config().setDocumentTitle("Test Results");
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Revanth");
		
	}
	
	
	@Test
	public void sample()
	{
		ExtentTest test=extent.createTest("Demo");
		System.out.println("sample1");
		extent.flush();
	}

}
