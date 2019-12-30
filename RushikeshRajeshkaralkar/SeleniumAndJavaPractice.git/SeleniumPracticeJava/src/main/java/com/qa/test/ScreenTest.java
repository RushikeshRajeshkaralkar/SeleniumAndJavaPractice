package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.base.CustomListeners;

import com.qa.base.TestBase;

@Listeners(CustomListeners.class)
public class ScreenTest extends TestBase {
	
	
	@Test
	public void go()
	{
		System.setProperty("webdriver.firefox.marionette","A:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	  Assert.assertEquals(false, true);
	}

//	@Test
//	public void NewTest2()
//	{
//		System.setProperty("webdriver.chrome.driver", "A:/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//	  Assert.assertEquals(true, true);
//	}

}
