package SeleniumTestNgPractice;


import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{

public ExtentSparkReporter sparkReporter;

public ExtentReports extent;
public ExtentTest test;

public  void onStart(ITestContext context) {
	System.out.println("started");
	sparkReporter = new ExtentSparkReporter("C:\\Users\\WINDOWS 10\\eclipse\\SeleniumProject\\report\\myreport.html");
	//LOCATION ON THE REPORT
	//UI TITLE ,NAME AND THEME
	sparkReporter.config().setDocumentTitle("automation report");
	sparkReporter.config().setReportName("functional testing");
	sparkReporter.config().setTheme(Theme.DARK);
	
	//common information
	extent = new ExtentReports();
	extent.attachReporter(sparkReporter);//connect ui with common information//attaching
	
	extent.setSystemInfo("computer name", "local host");
	extent.setSystemInfo("environment", "qa");
	extent.setSystemInfo("tester name", "pavan");
	extent.setSystemInfo("os", "windows 10");
	extent.setSystemInfo("browser name", "chrome");
	}

public  void onTestSuccess(ITestResult result) {
	test = extent.createTest(result.getName());//create the new entry in the project
	test.log(Status.PASS,"Test card pasSed"+ result.getName());//update the status
	  
	  }

	  
public  void onTestFailure(ITestResult result) {
	test = extent.createTest(result.getName());//create the new entry in the project
	test.log(Status.FAIL,"Test card FAIL"+ result.getName());//update the status
	test.log(Status.FAIL,"Test Case Failed cause is:" + result.getThrowable());
	  }

	 
public  void onTestSkipped(ITestResult result) {
	test = extent.createTest(result.getName());//create the new entry in the project
	test.log(Status.SKIP,"Test card SKIP"+ result.getName());
	  }

public void onFinish(ITestResult result)
{
	extent.flush();
}


}
