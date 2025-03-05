package SeleniumInterviewQuestion;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//capture cookies from the browser
		Set<Cookie> cookies =driver.manage().getCookies();
		System.out.println("size of cookies"+cookies.size());//tell the size//initial 3
		
		//how to print cookies from browser
		for(Cookie print:cookies)
		{
			System.out.println(print.getName()+" :  " +print.getValue());//cookis printig according to the name and value
		}
		
		//add cookie to the browser
		Cookie Cookieobj = new Cookie("hello","12345");//creating the cookie obj 1st name 2nd value(12344)
		 driver.manage().addCookie(Cookieobj);
		 //checking the size of the cookie after adding new cookie
		cookies =driver.manage().getCookies();
		System.out.println("size of cookies after adding the new cookie:"+cookies.size());
	
		//delete the cookie
		//1.delete cookie using cookie object
		//driver.manage().deleteCookie(Cookieobj);
		//2.delete cookie using name
		driver.manage().deleteCookieNamed("hello");
		cookies =driver.manage().getCookies();
		System.out.println("size of cookies after deleting the new cookie:"+cookies.size());
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		cookies =driver.manage().getCookies();
		System.out.println("after deletinf all:"+cookies.size());
		}

}
