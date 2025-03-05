package Hooks;

import io.cucumber.java.After;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AmazoneHooks {

	//@Before(order = 1)
	//public void setUp()
	//{
	//	System.out.println("launch amazon");
	//}
	@Before("@Smoke")
	public void setUrl()
	{
		System.out.println("launch amazon url");
		
	}
	/*@After(order = 1)
	public void tearDown() {
		System.out.println("close");
	}
	*/
	
	@After("@Regression")
	public void tear() {
		System.out.println("exit");
	}
	
	/*@BeforeStep
	public void takeScreenshot()
	{
		System.out.println("take screenshot");
	}
	
	@AfterStep
	public void refresh()
	{
		System.out.println("refresh the page");
	}
	*/
}
