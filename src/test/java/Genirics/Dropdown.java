package Genirics;

import org.openqa.selenium.WebElement;

import POM.object_class;

public class Dropdown
{
	public static void selectoptions(WebElement element,Object value)
	{	
	if(value instanceof Integer)
	{
		object_class.select(element).selectByIndex((Integer)value);
      // Objects.select(element).selectByIndex((Integer)value);
	}
	
		else
		{
			try {	
				object_class.select(element).selectByValue((String)value);
			}
			catch(Exception e)
			{
			    object_class.select(element).selectByVisibleText((String)value);
			}
		}
	}
	
	
	
	
	public static void deselect(WebElement element,Object value)
	{
		
	if(value instanceof Integer)
	{
		
    object_class.select(element).deselectByIndex((Integer)value);
	}
		else
		{
			try {	
			object_class.select(element).deselectByValue((String)value);
			}
			catch(Exception e)
			{
			    object_class.select(element).deselectByVisibleText((String)value);
			}

}
	}
	
	

}
