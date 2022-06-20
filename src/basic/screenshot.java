package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import net.bytebuddy.utility.RandomString;

public class screenshot 
{

	public static void main(String[] args) throws IOException 
	{
	
//		System.setProperty("webdriver.chrome.driver","D:\\Autmation jar files--------\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String a=RandomString.make(3);
//		File dest= new File("D:\\Screenshot destination\\image"+a+".jpg");
//		FileHandler.copy(src, dest);
		
		
		FileInputStream fis = new FileInputStream("D:\\Excellcode\\Excellcode.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		for(int i=0;i<=13;i++)
		{
			for(int j=0;j<=3;j++)
			{
				String output=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(output+" ");
			}
			System.out.println();
		}
		
		}
	}


