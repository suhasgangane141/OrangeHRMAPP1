package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbutton ;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userEnterLoginIdAndPassword(String Username, String Password)
	{
		Wait.sendKeys(username, Username);
		Wait.sendKeys(password, Password);
	}

	public void userClickOnLoginButton()
	{
		Wait.click(loginbutton);
	}
	
	

}
