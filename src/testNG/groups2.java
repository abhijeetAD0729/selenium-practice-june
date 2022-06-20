package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class groups2
{

	@Test(groups="sanity")
	public void a()
	{
		Reporter.log("running a",true);
	}
	
	@Test(groups="regression")
	public void b()
	{
	
		Reporter.log("running b",true);
	}
	
	@Test(groups="sanity")
	public void c()
	{
		Reporter.log("running c",true);
	}
	
	@Test(groups="sanity")
	public void d()
	{
		Reporter.log("running d",true);
	}
	
	@Test(groups="regression")
	public void e()
	{
		Reporter.log("running e",true);
	}
}
