package SeleniumTestNgPractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationDemo4 {
	@Test
	void pqr () {
		System.out.println("demo4");
	}
	@BeforeSuite
	void bs() {
		System.out.println("before suite");
	}
	@AfterSuite
	void as() {
		System.out.println("after suite");
	}
}
