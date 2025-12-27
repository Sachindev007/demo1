package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends initialization
{
 public Homepage(WebDriver driver)
 {
	 super(driver);
 }
  @FindBy(xpath = "//select[@id='category']")
  private WebElement drop;
  
  public WebElement catagery()
  {
	  return drop;
  }
}
