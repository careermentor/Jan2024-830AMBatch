package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.uo.utilitiesPkg.ReadPropData;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void click_createnewaccountbttn() throws Exception
	{
		
		driver.findElement(By.xpath(ReadPropData.readElement("FB_login_createnewaccount_xpath"))).click();
	}

	public void enter_firstname(String fname) throws Exception
	{
		
		driver.findElement(By.name(ReadPropData.readElement("FB_signup_firstname_name"))).sendKeys(fname);
	}
	
	public void enter_lastname(String lname) throws Exception
	{
		
		driver.findElement(By.name(ReadPropData.readElement("FB_signup_lastname_name"))).sendKeys(lname);
	}
	
	public void click_signupbttn() throws Exception
	{
		
		driver.findElement(By.name(ReadPropData.readElement("FB_signup_signupbttn_name"))).click();
	}
	
}
