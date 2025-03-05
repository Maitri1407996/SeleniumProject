package SeleniumPractice.SeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class SeleniumLaunchBrowser {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://demo.opencart.com/");
         
		//validate the title

		System.out.println(driver.getTitle());
		String actualTitle =driver.getTitle();
		if(actualTitle.equals("Your Store"));
		
			System.out.println("test passed");
	
			//driver.close();
	}

}
