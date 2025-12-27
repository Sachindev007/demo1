package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class object_class 
{
	
	public Actions Actions(WebDriver driver)
	{
	Actions act=new Actions(driver);
	return act;
	}
	public static Select select(WebElement driver)
	{
		Select s=new Select( driver);
	    return s;
	}
	

}
