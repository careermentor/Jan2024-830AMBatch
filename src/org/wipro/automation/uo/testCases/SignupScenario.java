package org.wipro.automation.uo.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.automation.uo.baseClasspkg.InitiateBrowser;
import org.wipro.automation.uo.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc005_validate_signup_functionality() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		sign.enter_firstname("selenium");
		sign.enter_lastname("java");
		
		driver.findElement(By.xpath("//*[text()='Male']")).click();
		
		sign.click_signupbttn();
	
	}
	
}
