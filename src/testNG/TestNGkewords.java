package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGkewords 
{

	@Test(invocationCount=5)
	public void c()
	{
		Reporter.log("running c",true);
	}
	
	@Test
	public void b()
	{
		Reporter.log("running b",true);
	}
	
	@Test(enabled=false)
	public void a()
	{
		Reporter.log("running a",true);
	}
	
	@Test(priority=0)
	public void d()
	{
		Reporter.log("running d",true);
	}
	
}
