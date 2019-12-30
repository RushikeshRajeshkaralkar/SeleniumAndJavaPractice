package TackScreenShot;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import bsh.commands.dir;

public class MyTest {
	public static WebDriver driver;

	
	
	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.firefox.marionette","A:\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	

	@Test
	public void MyNewTest()
	{
		
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void MyTest()
	{
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
	
	@Test
	public void MyNewGoTest()
	{
		driver.get("https://stackoverflow.com/questions/2955459/what-is-an-index-in-sql");
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.SUCCESS==result.getStatus())
		{
			TestBase.Falid(driver, result.getMethod().getMethodName());
		}
		else if (ITestResult.FAILURE==result.getStatus())
		{
			TestBase.Falid(driver, result.getMethod().getMethodName());
		}
	}
	
	

}
