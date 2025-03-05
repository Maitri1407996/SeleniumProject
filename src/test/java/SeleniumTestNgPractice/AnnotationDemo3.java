package SeleniumTestNgPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo3 {
	@Test
	void xyz() {
		System.out.println("demo3");
	}
	@AfterTest
	void at() {
		System.out.println("after test");
	}
}
