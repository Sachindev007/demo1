package Genirics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Homepage;
import POM.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage 
{
	Loginpage lp;
	WebDriver driver;
	Homepage hp;
@BeforeMethod	
public void launch()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shoppersstack.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	lp=new Loginpage(driver);
	 hp=new Homepage(driver);
}

@Test
public void login()
{
	lp.login().click();
	lp.un().sendKeys("abc877@gmail.com");
	lp.psw().sendKeys("Sachin@999");
	lp.btn().click();
	Dropdown.selectoptions(hp.catagery(), 1);
	
}
@AfterMethod
public void quit()
{
	//driver.quit();
	
}
}
