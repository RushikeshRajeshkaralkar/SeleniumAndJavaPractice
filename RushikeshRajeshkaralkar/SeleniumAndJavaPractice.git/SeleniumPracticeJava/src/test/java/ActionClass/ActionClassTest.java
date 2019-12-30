package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
public class ActionClassTest {

	
	WebDriver driver;
	@Test
	public void actionTet()
	{
		Actions action=new Actions(driver);
		
	}
	
	public void stopWait(WebDriver driver,WebElement element,TimeUnit timeUnit)
	{
		
	}
}
