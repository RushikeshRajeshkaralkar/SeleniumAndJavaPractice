package SeleniumPracticeJava.SeleniumPracticeJava;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Bass {
	
	public static WebDriver driver;
	
	
	public void intialiazaton() {
		System.setProperty("webdriver.firefox.marionette","A:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	}

	public static void falied(String Falied) throws IOException
	{
		File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		Files.copy(scrfile,new File("A:\\JavaPrograms\\SeleniumPracticeJava\\ScreenShot\\"+Falied+"_"+".png"));
	}
}
