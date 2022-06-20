package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Autmation jar files--------\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		
		List<WebElement> allradio = driver.findElements(By.xpath("//div[@id='tableWrapper']//tr//input"));
		
		int o=allradio.size();
		System.out.println(o);
		
		//Select radio buttons-
		
		for(int i=0;i<=o-1;i=i++)
		{
			allradio.get(i).click();
			Thread.sleep(1000);
		}
		
		//Deselect radio buttons-
		
		for(int i=o-1;i>=0;i--)
		{
			allradio.get(i).click();
			Thread.sleep(1000);
		}
		
		driver.close();
		
		
		
		
	}

}
