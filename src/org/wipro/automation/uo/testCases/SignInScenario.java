package org.wipro.automation.uo.testCases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.baseClasspkg.InitiateBrowser;
import org.wipro.automation.uo.pages.SignInPage;

public class SignInScenario extends InitiateBrowser
{

	@Test
	public void tc001_validate_signin_functionality() throws Exception
	{
		SignInPage sign = new SignInPage(driver);
		
		sign.click_menubutton();
		sign.click_signlink_menu();
		
		
		
	}
	
}
