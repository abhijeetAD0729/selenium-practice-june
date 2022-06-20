package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POMwithDDF.kitehomepage;
import POMwithDDF.kitelogin1page;
import POMwithDDF.kitelogin2page;

public class crossbrowsertesting 
{
	@Parameters("browsername")
	@Test
	public void tc1(String browsername) throws EncryptedDocumentException, IOException, InterruptedException
	{
		WebDriver driver=null;
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
        FileInputStream fis=new FileInputStream("D:\\-----Abhijeet importent docs------\\Desktop\\testdata.xlsx");
        Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
        
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Autmation jar files--------\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver(option);
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Autmation jar files--------\\geckdriver\\geckwin 64\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver(option);
		}
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		kitelogin1page login1=new kitelogin1page(driver);
		login1.enteruserid(sh.getRow(1).getCell(0).getStringCellValue());
		login1.enterpassword(sh.getRow(1).getCell(1).getStringCellValue());
		login1.loginbtn();
		
		kitelogin2page login2=new kitelogin2page(driver);
		login2.enterpin(sh.getRow(1).getCell(2).getStringCellValue());
		login2.cntbutton();
		
		kitehomepage home=new kitehomepage(driver);
		//home.verifyuserid(sh.getRow(1).getCell(0).getStringCellValue());
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
}
