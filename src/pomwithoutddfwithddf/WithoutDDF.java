package pomwithoutddfwithddf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutDDF {

	public static void main(String[] args) throws InterruptedException 
	{
		//to handle notifications-
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","D:\\Autmation jar files--------\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("CH8643");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("7741905225");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("255225");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		 
		String actualuserid= driver.findElement(By.xpath("//span[text()='CH8643']")).getText();
		String expuserid="CH8643";
		
		if(actualuserid.equals(expuserid))
		{
			System.out.println("valid user");
		}
		else
			System.out.println("invalid user");
		
		Thread.sleep(1000);
		
		driver.close();
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
