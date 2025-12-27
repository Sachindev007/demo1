package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends initialization
{

	public Loginpage(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(xpath = "//button[.='Login']")
	private WebElement login;
	@FindBy(name="Email")
	private WebElement un;
	@FindBy(name="Password")
	private WebElement psw;
	@FindBy(xpath="//span[.='Login']")
	private WebElement btn;
	
	
	public WebElement login() 
	{
		return login;
	}
	public WebElement un() 
	{
		return un;
	}
	public WebElement psw() 
	{
		return psw;
	}
	public WebElement btn() 
	{
		return btn;
	}
	
	
}
