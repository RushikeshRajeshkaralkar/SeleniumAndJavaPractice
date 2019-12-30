package SeleniumPracticeJava.SeleniumPracticeJava;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class SeleniumJavaScriptExecuiter {

	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.firefox.marionette","A:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	//	AlertMessage(driver);
		Alert alert=driver.switchTo().alert();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("A://googl.png"));
		alert.accept();
		driver.close();
	}
	
	
	
	
	public static void AlertMessage( WebDriver driver)
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("alert('hello world');");

	}
}
