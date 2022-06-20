package pomwithoutddfwithddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class withDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		//to handle notifications-
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--disable-notifications");
				
				System.setProperty("webdriver.chrome.driver","D:\\Autmation jar files--------\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver(option);
				
				driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				FileInputStream fis=new FileInputStream("D:\\-----Abhijeet importent docs------\\Desktop\\testdata.xlsx");
				Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
				
				 driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
				
				 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());
				 
				 driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
				 Thread.sleep(1000);
				 
				 driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(1).getCell(2).getStringCellValue());
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
				 Thread.sleep(3000);
				 
				 driver.close();

	}

}
