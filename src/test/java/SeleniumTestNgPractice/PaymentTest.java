package SeleniumTestNgPractice;

import org.testng.annotations.Test;
//suppose all the three comes under sanity+regression=functional
public class PaymentTest {

	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentbyruupess()
	{
		System.out.println("payment by ruupess");
	}
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentbydollar()
	{
		System.out.println("payment by dollar");
	}
	@Test(priority=3,groups= {"sanity","regression","functional"})
	void paymentbytaka()
	{
		System.out.println("payment by taka");
	}
}
