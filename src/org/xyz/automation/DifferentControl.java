package org.xyz.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DifferentControl 
{
	
	WebDriver driver;
	
	@Test
	public void browserfeatures() throws Exception
	{
		
		driver= new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("fld_username")).sendKeys("Selenium");
		
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);
		//gen.selectByValue("2");
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		//Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		st.selectByVisibleText("California");
		
		
		//WebElement abc = driver.findElement(By.name("terms"));
		//abc.click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		
		driver.findElement(By.name("terms")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		
		//driver.findElement(By.className("displayPopup")).click();
		
		int a=20;
		
	}
		
}
