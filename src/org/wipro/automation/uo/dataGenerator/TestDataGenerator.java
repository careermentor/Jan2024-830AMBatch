package org.wipro.automation.uo.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="staticdata")
	public Object[][] testdata()
	{
		Object[][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};   //2-D array
		return data;
		
	}
	
	
	
	@DataProvider(name="staticdata1")
	public Object[][] testdata1()
	{
		Object[][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};   //2-D array
		return data;
		
	}
	
	
}
