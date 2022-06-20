package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin1page 
{
		//declaration 
	
	@FindBy(xpath="//input[@id='userid']") private WebElement userid;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement loginbtn;
	
	//initialization by using constructor-
	
	public kitelogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enteruserid()
	{
		userid.sendKeys("CH8643");
	}
	

	public void enterpassword()
	{
		password.sendKeys("7741905225");
	}
	

	public void loginbtn()
	{
		loginbtn.click();
	}
	
		
}
