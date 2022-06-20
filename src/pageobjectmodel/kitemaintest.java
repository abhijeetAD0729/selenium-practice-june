package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class kitemaintest {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","D:\\Autmation jar files--------\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		kitelogin1page login1=new kitelogin1page(driver);
		login1.enteruserid();
		login1.enterpassword();
		login1.loginbtn();
		
		kitelogin2page login2=new kitelogin2page(driver);
		login2.enterpin();
		login2.cntbutton();
		
		kitehomepage home=new kitehomepage(driver);
		home.verifyuserid();
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
