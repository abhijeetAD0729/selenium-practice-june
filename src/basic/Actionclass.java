package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Actionclass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Autmation jar files--------\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement df = driver.findElement(By.xpath("//a[@title='Software Testing']"));
		
		Actions act =new Actions(driver);
		Thread.sleep(1000);
		
		act.moveToElement(df).click().build().perform();
		
		WebElement bar = driver.findElement(By.xpath("//div[@class='site-header-item site-header-focus-item site-header-item-navgation-popup-toggle']"));
		act.moveToElement(bar).click().perform();
		
		
		
		
	
		
		
		
		
	}

}
