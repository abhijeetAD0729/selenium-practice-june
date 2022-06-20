package POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomepage 
{
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement userid;
	
	public kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyhomepageuserid()
	{
		String actual123=userid.getText();
		return actual123;
	}
}
