package SeleniumTestNgPractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
@Test
	void acb() {
		System.out.println("demo2");
	}
	@BeforeTest
	void bt() {
		System.out.println("before test");
	}
}
