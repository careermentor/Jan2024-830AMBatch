package org.wipro.automation.uo.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.uo.baseClasspkg.InitiateBrowser;
import org.wipro.automation.uo.dataGenerator.TestDataGenerator;
import org.wipro.automation.uo.pages.LoginPage;

public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="staticdata1",dataProviderClass=TestDataGenerator.class)
	public void tc001_validate_login_functionality(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
	
	
}
