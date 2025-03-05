package SeleniumInterviewQuestion;

import java.util.HashMap;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {

	public static void main(String[] args) {
		
		//define the location where we want to download the file
		String location =System.getProperty("user.dir")+"\\Downloads\\";
		//chrome preference declare
		HashMap preferences = new HashMap();
		//if file is pdf then only add the below line
		preferences.put("plugins.always_open_pdf_externally", true);//pdf download//otherwise not required
		preferences.put("download.default_directory",location);
		//chromeoptions create
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs",preferences);
		
		WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Download' and @type='button']")).click();

	}

}
