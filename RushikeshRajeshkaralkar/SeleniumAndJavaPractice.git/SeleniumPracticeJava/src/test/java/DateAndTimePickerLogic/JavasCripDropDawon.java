package DateAndTimePickerLogic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavasCripDropDawon {
	@Test
	public void TestDropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushikesh\\Desktop\\ChromeDriver79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
		Thread.sleep(5000);
		List<WebElement> listOfElements = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		for (int i = 0; i < listOfElements.size(); i++) {
			String listName = listOfElements.get(i).getText();
			System.out.println(listName);
			if (("css").equalsIgnoreCase(listName)){
				listOfElements.get(i).click();
				break;
			}
			
		}
		Thread.sleep(2000);
		driver.close();
	}
}
