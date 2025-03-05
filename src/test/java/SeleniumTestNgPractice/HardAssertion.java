package SeleniumTestNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertion {

	
	@Test
	void test()
	{
		//Assert.assertEquals("xyz", "xyz");
		//Assert.assertEquals(123, 345);
		//Assert.assertEquals("xyz", 123);
		
		//Assert.assertNotEquals(123,123);//failed
		//Assert.assertNotEquals("xyz",123);//passed
		
		//Assert.assertTrue(true);//passed
		//Assert.assertTrue(false);//failed
		
		//Assert.assertFalse(false);//passed
		//Assert.assertFalse(1==1);//failed
		
		Assert.fail();//failed
		
	}
}
