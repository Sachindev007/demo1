package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class initialization 
{
	public  initialization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
