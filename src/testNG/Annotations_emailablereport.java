package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_emailablereport 
{
	@BeforeMethod
	public void precondition()
	{
		Reporter.log("prerequsits like open url", true);
	}
	
	@Test
	public void a()
	{
		Reporter.log("a test case running", true);
	}
	
	@Test
	public void b()
	{
		Reporter.log("b test case running", true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("c test case running", true);
	}
	
	@AfterMethod
	public void postcondition()
	{
		Reporter.log("postcondition", true);
	}
	
	@AfterClass
	public void afterclass()
	{
		Reporter.log("browser close", true);
	}
	
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("browser open",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
