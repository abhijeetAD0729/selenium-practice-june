package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webtable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Autmation jar files--------\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String name = driver.findElement(By.xpath("//table[@id='product']//tr[2]//td[2]")).getText();
		System.out.println(name);
		
		List<WebElement> alltexts = driver.findElements(By.xpath("//table[@id='product']//tr//td"));
		int y=alltexts.size();
		System.out.println(y);
		
		for(WebElement a:alltexts)
		{
			System.out.println(a.getText());
		}
		
//dropdown handling-
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select sel=new Select(drop);
		sel.selectByIndex(0);
		sel.selectByVisibleText("Option3");
		List<WebElement> all = sel.getOptions();
		int p=all.size();
		System.out.println(p);
		
		for(WebElement d:all)
		{
			System.out.println(d.getText());
		}
		
//select radio buttons-
		
		List<WebElement> radio = driver.findElements(By.xpath("//div[@class=' extradiv col-lg-3 col-md-6 col-12']//input"));
		for(WebElement c:radio)
		{
			c.click();
			Thread.sleep(1000);
		}
		

	}

}
