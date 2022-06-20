package POMwithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass extends baseclass
{
	int TCID;
	kitelogin1page login1;
	kitehomepage home;
	kitelogin2page login2;
	org.apache.poi.ss.usermodel.Sheet sh;
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
        initializebrowser();
	      login1=new kitelogin1page(driver);
	      login2=new kitelogin2page(driver);
	      home=new kitehomepage(driver);
		}
	
	@BeforeMethod
	public void openkiteapp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		 login1.enteruserid(utilityclass.propertiesdata("username"));
		 login1.enterpassword(utilityclass.propertiesdata("password"));
		 login1.loginbtn();
		
	     
		 login2.enterpin(utilityclass.propertiesdata("pin"));
		 login2.cntbutton();
		 Thread.sleep(3000);
	}
	
	@Test
	public void verifyuserid() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=101;
		String actual1=home.verifyhomepageuserid();
		String Expected1=utilityclass.gettestdata(1, 1);
		Assert.assertEquals(actual1, Expected1);
	}
	
	@AfterMethod
	public void logoutfromapp(ITestResult r1) throws IOException
	{
		if(r1.getStatus()==ITestResult.FAILURE)
		{
			utilityclass.screenshot(driver, TCID);
		}
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
