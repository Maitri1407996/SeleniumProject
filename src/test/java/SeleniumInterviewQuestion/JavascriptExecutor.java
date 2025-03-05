package SeleniumInterviewQuestion;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//syntax
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Script,arg);*/
		//
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//getting title;
		/*String tit= JavaScriptUtil.getTitleByJS(driver);
		System.out.println(tit);
		*/
		//click 
		/*WebElement click = driver.findElement(By.xpath("//a[text()='Register']"));
		JavaScriptUtil.clickElementByJS(click,driver);
		*/
		
		//alert
		//JavaScriptUtil.generateAlert(driver,"hello");
		
		//refresh
		//JavaScriptUtil.refreshBrowserByJS(driver);

		//scrolldown
		//JavaScriptUtil.scrollPageDown(driver);
		
		//zoompage
		JavaScriptUtil.zoomPageByJS(driver);
	}

}
