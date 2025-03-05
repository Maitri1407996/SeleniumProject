package SeleniumTestNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertionDemo {
   @Test
	void testTitle()
	{
		String exptitle="opencart";
		String acttitle="opencart";
		
		/*if(exptitle.equals(acttitle))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
		
		Assert.assertEquals(exptitle,acttitle);
	}
}
