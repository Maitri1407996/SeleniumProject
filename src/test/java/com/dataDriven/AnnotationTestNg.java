package com.dataDriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * login
 * search
 * logout
 * login
 * advanced search
 * logout
 */
public class AnnotationTestNg {

	@BeforeMethod
	 void login()
	 {
		 System.out.println("login");
	 }
	@Test(priority = 1)
	 void search()
	 {
		System.out.println("search");
	 }
	@Test(priority=2)
	 void advancesearch()
	 {
		 System.out.println("advance search");
	 }
	@AfterMethod
	 void logout()
	 {
		 System.out.println("logout");
	 }
}
