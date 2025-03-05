package SeleniumTestNgPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
	public  void onStart(ITestContext context) {
		System.out.println("test execution is started");//only once
	    
	  }
	
	  public void onTestStart(ITestResult result) {
		  System.out.println("test execution particular test started");//for every test run once
		  }

		  
	  public  void onTestSuccess(ITestResult result) {
		  System.out.println("test result is pass");
		  }

		  
	  public  void onTestFailure(ITestResult result) {
		  System.out.println("test result is fail");
		  }

		 
	  public  void onTestSkipped(ITestResult result) {
		  System.out.println("test result is skip");
		  }
	  public  void onFinish(ITestResult result) {
		  System.out.println("test is finished");
		  }

}
