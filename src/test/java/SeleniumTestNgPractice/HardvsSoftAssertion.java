package SeleniumTestNgPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class HardvsSoftAssertion {

	
	@Test
	void test_hard()
	{
		System.out.println("testing");
		Assert.assertEquals(1, 2);
		System.out.println("testing2s");
		
	}
	
	@Test
	void test_soft()
	{
		System.out.println("testing soft");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);
		System.out.println("soft assert 2");
		sa.assertAll();//mandatory
	}
}


