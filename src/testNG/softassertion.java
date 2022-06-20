package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion 
{
	//to overcome HA problem we use soft assert class with its non static method-
	
	@Test
	public void tc1()
	{
		SoftAssert soft=new SoftAssert();
		
		String actual="hi";
		String expected="hello";
		soft.assertEquals(actual, expected);
		
		String actual1="hi";
		String expected1="hi";
		soft.assertEquals(actual1, expected1);
		
		boolean actual2=false;
		soft.assertTrue(actual2);
		
		soft.assertAll();
	}
	
}
