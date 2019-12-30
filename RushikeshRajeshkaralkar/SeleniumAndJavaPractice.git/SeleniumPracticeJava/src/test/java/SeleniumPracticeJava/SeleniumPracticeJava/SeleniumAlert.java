package SeleniumPracticeJava.SeleniumPracticeJava;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;


@Listeners(MyListeners.class)
public class SeleniumAlert {

	
	@Test
	public void Test() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette","A:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
//		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
//
//		Thread.sleep(5000);
//	    Alert alert=driver.switchTo().alert();
//	    
//		alert.accept();
//		
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Files.copy(src, new File("A:\\JavaPrograms\\SeleniumPracticeJava\\ScreenShot\\go12.png"));
//		
		
		assertEquals(false, true);
		driver.close();
	}
}
