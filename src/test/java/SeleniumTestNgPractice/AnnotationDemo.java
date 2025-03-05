package SeleniumTestNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/*
 * login
 * search
 * advanced search
 * logout
 */
public class AnnotationDemo {
	@BeforeClass
	 void login()
	 {
		 System.out.println("login");
	 }
	@Test(priority = 1)
	 void search()
	 {
		System.out.println("search");
	 }
	@Test(priority=2)
	 void advancesearch()
	 {
		 System.out.println("advance search");
	 }
	@AfterClass
	 void logout()
	 {
		 System.out.println("logout");
	 }
}
