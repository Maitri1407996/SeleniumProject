package SeleniumTestNgPractice;

import org.testng.annotations.Test;
//suppose all the three comes under sanity
public class LoginTest {

	@Test(priority=1,groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("by email");
	}
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("by facebook");
	}
	@Test(priority=3,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("by twitter");
	}
	
}
