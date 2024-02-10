package org.wipro.automation.uo.baseClasspkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.uo.utilitiesPkg.ReadPropData;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropData.readConfig("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver  = new ChromeDriver();
		}
		else if(ReadPropData.readConfig("BrowserName").equalsIgnoreCase("edge"))
		{
			driver  = new EdgeDriver();
		}
		else if(ReadPropData.readConfig("BrowserName").equalsIgnoreCase("safari"))
		{
			driver  = new SafariDriver();
		}
		
		else
		{
			driver  = new ChromeDriver();
		}
		
		driver.get(ReadPropData.readConfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	
}
