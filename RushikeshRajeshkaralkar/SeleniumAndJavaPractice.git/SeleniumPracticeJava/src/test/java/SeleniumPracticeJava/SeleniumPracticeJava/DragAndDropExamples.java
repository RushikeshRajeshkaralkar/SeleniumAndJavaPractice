package SeleniumPracticeJava.SeleniumPracticeJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropExamples {
	
	public static WebDriver driver;
	
	@Test
	public static void DragAndDrop()
	{

		System.setProperty("webdriver.firefox.marionette","A:\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='column-a']")))
		
		.moveToElement(driver.findElement(By.xpath("//div[@id='column-b']")))
		.release().build().perform();
	}

}
