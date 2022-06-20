package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 
{
	@Test
	public void a()
	{
		Reporter.log("running a",true);
	}
	
	@Test
	public void b()
	{
		Assert.fail();
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
