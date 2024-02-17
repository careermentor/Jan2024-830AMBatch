package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.uo.utilitiesPkg.ReadPropData;

public class SignInPage 
{

	WebDriver driver;
	
	public SignInPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	public void click_menubutton() throws Exception
	{
		
		driver.findElement(By.cssSelector(ReadPropData.readElement("UO_Homepage_menu_link_css"))).click();
	}
	
	public void click_signlink_menu() throws Exception
	{
		
		driver.findElement(By.xpath(ReadPropData.readElement("UO_Menu_SignIn_xpath"))).click();
	}
	/*
	public void enter_username(String uname) throws Exception
	{
		
		driver.findElement(By.id(ReadPropData.readElement("FB_Login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		
		driver.findElement(By.name(ReadPropData.readElement("FB_Login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		
		driver.findElement(By.cssSelector(ReadPropData.readElement("FB_Login_loginbttn_css"))).click();
	} */
	
}
