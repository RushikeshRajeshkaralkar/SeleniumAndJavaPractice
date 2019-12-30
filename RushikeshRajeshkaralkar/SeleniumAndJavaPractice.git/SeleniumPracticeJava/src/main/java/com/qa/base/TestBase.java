package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;
import org.apache.commons.*;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class TestBase {
	
	public static WebDriver driver;
	public static void intialization()
	{
		System.setProperty("webdriver.firefox.marionette","A:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	}
	
	public static void falied(String Falied) throws IOException
	{
		File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		Files.copy(scrfile,new File("A:\\JavaPrograms\\SeleniumPracticeJava\\ScreenShot\\"+"Flied_"+Falied+"_"+".png"));
	}

	public static void pass(String Pass) throws IOException
	{
		File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		Files.copy(scrfile,new File("A:\\JavaPrograms\\SeleniumPracticeJava\\ScreenShot\\"+"Pass_"+Pass+"_"+".png"));
	}
	

}
