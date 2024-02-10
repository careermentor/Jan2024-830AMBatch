package org.wipro.automation.uo.utilitiesPkg;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropData 
{

	public static String readConfig(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readElement(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
}
