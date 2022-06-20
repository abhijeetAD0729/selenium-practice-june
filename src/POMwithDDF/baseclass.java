package POMwithDDF;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseclass 
{
	
	WebDriver driver;
	public void initializebrowser() throws IOException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ranjit\\eclipse-workspace\\Selenium new\\browser\\chromedriver.exe");
		driver=new ChromeDriver(option);
		
		driver.get(utilityclass.propertiesdata("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
}
