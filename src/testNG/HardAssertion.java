package testNG;

import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion 
{
	//assert is a class and assert equals,not equals,true,false is the static methods resents in the assert class.
	//see tc9 eg of hard assertion means in a single tc there are multiple verifications and if 1st verification falis 
	//then it will not execute second verification.
	
//Assert equal-
	
	@Test
	public void tc1()
	{
		String actual="hi";
		String expected="hi";
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void tc2()
	{
		String actual="hi";
		String expected="hello";
		Assert.assertEquals(actual, expected);
	}
	
//Assert not equals-
	
	@Test
	public void tc3()
	{
		String actual2="hi";
		String expected2="hi";
		Assert.assertNotEquals(actual2, expected2);
	}
	
	@Test
	public void tc4()
	{
		String actual3="hi";
		String expected3="hello";
		Assert.assertNotEquals(actual3, expected3);
	}
	
	
//Assert true
	
	@Test
	public void tc5()
	{
		boolean actual4=true;
		Assert.assertTrue(actual4);
	}
	
	@Test
	public void tc6()
	{
		boolean actual5=false;
		Assert.assertTrue(actual5);
	}
	
//Assert false
	

	@Test
	public void tc7()
	{
		boolean actual6=false;
		Assert.assertFalse(actual6);
	}
	
	@Test
	public void tc8()
	{
		boolean actual7=true;
		Assert.assertFalse(actual7);
	}
	
//Hard assertion e.g-
	
	@Test
	public void tc9()
	{
		boolean actual7=true;
		Assert.assertFalse(actual7);
		
		boolean actual6=true;
		Assert.assertFalse(actual6);
		
		String actual="hi";
		String expected="hi";
		Assert.assertEquals(actual, expected);
		
	}
	
	
}
