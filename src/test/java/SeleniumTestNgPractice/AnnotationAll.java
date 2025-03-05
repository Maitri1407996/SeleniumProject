package SeleniumTestNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationAll {

	@BeforeSuite
	void bs() {
		System.out.println("before suite");
	}
	@AfterSuite
	void as() {
		System.out.println("after suite");
	}
	@BeforeTest
	void bt() {
		System.out.println("before test");
	}

	@AfterTest
	void at() {
		System.out.println("after test");
	}
	
	@AfterMethod
	 void am()
	 {
		 System.out.println("after method");
	 }
	@BeforeMethod
	 void bm()
	 {
		 System.out.println("before method");
	 }
	@BeforeClass
	 void bc()
	 {
		 System.out.println("before class");
	 }

	@AfterClass
	 void ac()
	 {
		 System.out.println("after class");
	 }
	
	@Test()
	 void test()
	 {
		System.out.println("search test");
	 }
	@Test()
	 void test1()
	 {
		System.out.println(" test1");
	 }
}

