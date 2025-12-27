package Execution;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion 
{
	WebDriver driver;	
	WebElement mob1;
	WebElement mob2;
	 WebElement price1;
	 WebElement price2;
	 WebElement price3;
	@BeforeMethod
	public void lauch() throws AWTException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone17");
	Robot r=new Robot();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	 mob1 = driver.findElement(By.xpath("//div[@class='tUxRFH']"));
	 mob2 = driver.findElement(By.xpath("(//div[@class='tUxRFH'])[2]"));
	 
	 price1 = driver.findElement(By.xpath("(//div[contains(@class,'Nx9bqj')])[1]"));
	 price2 = driver.findElement(By.xpath("(//div[contains(@class,'Nx9bqj')])[2]"));
	 price3 = driver.findElement(By.xpath("(//div[contains(@class,'Nx9bqj')])[3]"));

}

@Test
public void run()
{
	String p1 = price1.getText().substring(1).replace(",", "");
	String p2 = price2.getText().substring(1).replace(",", "");
	System.out.println(p1+" "+p2);
	int r1 = Integer.parseInt(p1);
	int r2 = Integer.parseInt(p2);
	
	if(r1<r2)
	{
		System.out.println("r1 is cheapear");
	}
	else
	{
		System.out.println("r2 is cheapear");
	}
	

}

@AfterMethod
public void quit()
{
	driver.quit();
}
}
