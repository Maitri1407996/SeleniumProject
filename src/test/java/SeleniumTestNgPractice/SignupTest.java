package SeleniumTestNgPractice;

import org.testng.annotations.Test;
//suppose all the three comes under regression
public class SignupTest {


	@Test(priority=1,groups= {"regression"})
	void signByEmail()
	{
		System.out.println("signup by email");
	}
	@Test(priority=2,groups= {"regression"})
	void signByFacebook()
	{
		System.out.println("sign up by facebook");
	}
	@Test(priority=3,groups= {"regression"})
	void signByTwitter()
	{
		System.out.println("sign up by twitter");
	}
}
