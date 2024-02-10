package org.wipro.automation.uo.utilitiesPkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreen
{

	public static void testResults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ss = (TakesScreenshot) driver;
		File f = ss.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./ResultOutput/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
	}
	
}
