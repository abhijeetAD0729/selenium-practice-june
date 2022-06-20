package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomepage 
{
	
	@FindBy(xpath="//span[text()='CH8643']") private WebElement userid;
	
	public kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyuserid()
	{
		String actual=userid.getText();
		String Expected="CH8643";
		
		if(actual.equals(Expected))
		{
			System.out.println("test case pass");
		}
		
		else
		{
			System.out.println("test case fail");
		}
		
	}
}
