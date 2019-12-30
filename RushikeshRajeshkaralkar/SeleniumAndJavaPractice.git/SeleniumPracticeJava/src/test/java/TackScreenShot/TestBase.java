package TackScreenShot;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.google.common.io.Files;

public class TestBase {

	
	
	public static WebDriver driver;
	
	public void initlization()
	{	
		System.setProperty("webdriver.firefox.marionette","A:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	
	public static void Falid(WebDriver driver,String result)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(src, new File("A:\\JavaPrograms\\SeleniumPracticeJava\\ScreenShot\\"+result+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ScreenShotOFTestCase(ITestResult result)
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
