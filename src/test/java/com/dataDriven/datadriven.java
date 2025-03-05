package com.dataDriven;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class datadriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		
		//driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fsignin.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F&_trksid=p2487285.m5021.l46827");

		Xls_Reader reader = new Xls_Reader("C:\\Users\\WINDOWS 10\\eclipse\\SeleniumProject\\testdata\\ebayLogin.xlsx");
	     int rowcount = reader.getRowCount("EbayLogin");
	     
	     for(int rownum=2;rownum<=rowcount;rownum++)
	     {
	    	 String BusinessName = reader.getCellData("EbayLogin", "BusinessName", rownum);
	    	 System.out.println(BusinessName);
	    	 
	    	 String BusinessEmail = reader.getCellData("EbayLogin", "BusinessEmail", rownum);
	    	 System.out.println(BusinessEmail);
	    	 String Password = reader.getCellData("EbayLogin", "Password", rownum);
	    	 System.out.println(Password);
	    	 
	    	 /*driver.findElement(By.id("businessName")).clear();
	    	 driver.findElement(By.id("businessName")).sendKeys(BusinessName);
	    	 driver.findElement(By.xpath("//*[@id='businessEmail']")).clear();
	    	 driver.findElement(By.xpath("//*[@id='businessEmail']")).sendKeys(BusinessName);
	    	 driver.findElement(By.xpath("//*[@id='bizPassword']")).clear();
	    	 driver.findElement(By.xpath("//*[@id='bizPassword']")).sendKeys(Password);
	    	 */
	     }
	}

}
