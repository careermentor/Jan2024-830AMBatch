package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserControl 
{
	
	WebDriver driver;
	
	@Test
	public void browserfeatures() throws Exception
	{
		
		driver= new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//driver.close();  //close one window at a time
		driver.quit();//will close all the window
	}
		
}
