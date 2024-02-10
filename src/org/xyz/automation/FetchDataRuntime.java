package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{
	
	WebDriver driver;
	
	@Test
	public void browserfeatures() throws Exception
	{
		
		driver= new ChromeDriver(); 
		
		String ExpURL = "https://www.facebook.com";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL); //fail,  hard assertion
		
		//soft assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL);
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpUnamebox = "Email address or phone number";
		String ActUnameBox = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUnameBox);
		
		sa.assertEquals(ActUnameBox, ExpUnamebox);
		
		String ExpLoginbttn = "Log in";
		String ActLoginbttn = driver.findElement(By.name("login")).getText();
		System.out.println(ActLoginbttn);
		
		System.out.println(driver.findElement(By.name("login")).isEnabled());
		
		sa.assertEquals(ActLoginbttn, ExpLoginbttn);
		
		Point loginloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loginloc);
		
		//System.out.println(driver.getPageSource());
			
		sa.assertAll();
	}
		
}
