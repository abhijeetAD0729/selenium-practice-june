package POMwithDDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass 
{

	public static String gettestdata(int rowindex,int columnindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\ranjit\\eclipse-workspace\\Selenium new\\testdata\\testdata.xlsx");
         org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
        String data = sh.getRow(rowindex).getCell(columnindex).getStringCellValue();
		return data;
	}
	
	public static void screenshot(WebDriver driver,int TCID) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ranjit\\eclipse-workspace\\Selenium new\\testcase"+TCID+".png");
		FileHandler.copy(source, dest);
	}
	
	public static String propertiesdata(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\ranjit\\eclipse-workspace\\Selenium new\\propertiesfile.properties");
		Properties prop=new Properties();
		prop.load(file);
		
		String vallue=prop.getProperty(key);
		return vallue;
		
	}
}
