package SeleniumPracticeJava.SeleniumPracticeJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class AddandRemoveElement {
	
	
	public static WebDriver driver;
	
	
	@Test
	public void Test1() throws InterruptedException
	{
			
			System.setProperty("webdriver.firefox.marionette","A:\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
			driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
	}

}
