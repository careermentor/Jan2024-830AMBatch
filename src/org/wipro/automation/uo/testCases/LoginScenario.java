package org.wipro.automation.uo.testCases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.baseClasspkg.InitiateBrowser;
import org.wipro.automation.uo.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc001_validate_login_functionality() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
		
	}
	
}
