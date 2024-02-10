package testNGDemo;

import org.testng.annotations.Test;

public class FirstScenario4 
{

	@Test
	public void first_testcase()
	{
		System.out.println("This is first test case");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("This is second test case");
	}
	@Test(groups="Sanity")
	public void third_testcase()
	{
		System.out.println("This is third test case");
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("This is forth test case");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("This is fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("This is sixth test case");
	}
	
}