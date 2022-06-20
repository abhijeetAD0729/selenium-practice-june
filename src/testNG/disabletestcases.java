package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class disabletestcases 
{
	
	//if we want to execute 5 test cases out of 10 then we can do with two things 1-by using enables =false but not possible to type every tc
	//2-create xml file and use include exclude concept--better option.
	
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
	
	@Test
	public void e()
	{
		Reporter.log("running e",true);
	}
	
	@Test
	public void f()
	{
		Reporter.log("running f",true);
	}
	
	@Test
	public void g()
	{
		Reporter.log("running g",true);
	}
	
	@Test
	public void h()
	{
		Reporter.log("running h",true);
	}
	
	@Test
	public void i()
	{
		Reporter.log("running i",true);
	}
	
	@Test
	public void j()
	{
		Reporter.log("running j",true);
	}
}
