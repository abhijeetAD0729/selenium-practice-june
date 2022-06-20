package Guru99project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Verifyloginpage 
{
	
//	static WebDriver driver;
//	
//	public static void screenshot() throws IOException
//	{
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src, new File("D:\\Screenshot destination\\loginpage.png"));
//	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("D:\\-----Abhijeet importent docs------\\Desktop\\guru99testdata.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		System.setProperty("webdriver.gecko.driver","D:\\Autmation jar files--------\\geckdriver\\geckwin 64\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
//verify current url of the webpage-
		
		String expectedurl="https://www.demo.guru99.com/V4/";
		
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		
		if(actualurl.equals(expectedurl))
		{
			System.out.println("test case pass");
		}
		
		else
			System.out.println("test case fail");
		
		
//verify Title of the webpage-
		
		String expectedTitle="Guru99 Bank Home Page";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		if(actualtitle.equals(expectedTitle))
		{
			System.out.println("test case pass");
		}
		
		else
			System.out.println("test case fail");
		
//login --
		
//Test case 1-verify login page by entering correct user id and correct password--
		//expected result-verify with user id on home page and title of the homepage-
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(sh.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sh.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(1000);
		
		
	//verify with user id whether authorized person logged in or not-
		
		WebElement actual = driver.findElement(By.xpath("//td[text()='Manger Id : mngr413588']"));
		String actual1=actual.getText();
		System.out.println(actual1);
		
		
		String expected="Manger Id : mngr413588";
		
		if(actual1.equals(expected))
		{
			System.out.println("actual user id matches with expected userid"+"test case pass");
		}
		else
			System.out.println("test case fail");
		
	//verify with title of the home page-
		
		String actualttl=driver.getTitle();
		System.out.println(actualttl);
		String expectedttl="Guru99 Bank Manager HomePage";
		
		if(actualttl.equals(expectedttl))
		{
			System.out.println("authorized user");
		}
		
		else
		{
			System.out.println("unauthrized user");
		}
		
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
//Test case 2-verify login page by entering incorrect user id and correct password--
		//expected result-user or password is  not valid shown
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(sh.getRow(5).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sh.getRow(6).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(3000);
		
		String actualtext=driver.switchTo().alert().getText();
		String expectedtext="User or Password is not valid";
		
		if(actualtext.equals(expectedtext))
		{
			System.out.println("test case pass");
		}
		
		else
		{
			System.out.println("test case fail");
		}
		
		driver.switchTo().alert().accept();
	
		Thread.sleep(3000);
		
//Test case 3 -verify login page by entering correct user id and incorrect password--
		//expected result-user or password is  not valid shown
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(sh.getRow(8).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sh.getRow(9).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(3000);
		
		String actualtext1=driver.switchTo().alert().getText();
		String expectedtext1="User or Password is not valid";
		
		if(actualtext1.equals(expectedtext1))
		{
			System.out.println("test case pass");
		}
		
		else
		{
			System.out.println("test case fail");
		}
		
		driver.switchTo().alert().accept();
	
		Thread.sleep(3000);
		
		
//Test case 4-verify login page by entering incorrect user id and incorrect password--
		//expected result-user or password is  not valid shown
				
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(sh.getRow(11).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sh.getRow(12).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(3000);
		String actualtext2=driver.switchTo().alert().getText();
		String expectedtext2="User or Password is not valid";
		
		if(actualtext2.equals(expectedtext2))
		{
			System.out.println("test case pass");
		}
		
		else
		{
			System.out.println("test case fail");
		}
		
		driver.switchTo().alert().accept();
	
		Thread.sleep(3000);
		
		
		driver.close();
				
		
	}

}
