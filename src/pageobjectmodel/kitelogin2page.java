package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2page 
{
	
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement cntbutton;
	
	
	public kitelogin2page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterpin()
	{
		pin.sendKeys("255225");
	}
	
	public void cntbutton()
	{
		cntbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
