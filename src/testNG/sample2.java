package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 
{
	@Test
	public void a()
	{
		Reporter.log("running a",true);
	}
	
	@Test
	public void b()
	{
		Reporter.log("running b",true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("running c",true);
	}
	
	@Test
	public void d()
	{
		Reporter.log("running d",true);
	}
}
