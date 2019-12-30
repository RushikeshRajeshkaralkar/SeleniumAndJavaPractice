package DateAndTimePickerLogic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mkmytripdropdown extends DataTimemytrip {
	
	
	@Test
	public void TestDropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushikesh\\Desktop\\ChromeDriver79\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).clear();
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).sendKeys("che");
		WebElement FromTextFild = driver.findElement(By.xpath("//input[@id='FromSector_show']"));
		FromTextFild.click();
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).clear();
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).sendKeys("Ban");
		List<WebElement> listofCity = driver.findElements(
				By.xpath("//div[@class='aut-bx-m_not_use bx1']//div[@class='rcnt']//ul//li//div//span[@class='ct']"));
		//System.out.println(listofCity.size());
		for (int i = 0; i < listofCity.size(); i++) {
			String nameofCity = listofCity.get(i).getText();

			//System.out.println(nameofCity);
			if (nameofCity.equals("Bangalore(BLR)")) {
				listofCity.get(i).click();
				System.out.println("Click SuccesFully");
				break;
			}

		}
		
		System.out.println("--------------------------NEXT FILED---------------------------------------------");

		WebElement Destination = driver.findElement(By.xpath("//input[@id='Editbox13_show']"));
		Destination.clear();
		Destination.sendKeys("HYD");
		Destination.click();

		List<WebElement> ListofNextFiled = driver.findElements(
				By.xpath("//div[@class='aut-bx-m_not_use bx1']//div[@class='tp-cit']//ul//li//div//span[@class='ct']"));
		for (int i = 0; i < ListofNextFiled.size(); i++) {
			String nameofCity = ListofNextFiled.get(i).getText();

			//System.out.println(nameofCity);
			if (nameofCity.equals("Hyderabad(HYD)")) {
				ListofNextFiled.get(i).click();
				System.out.println("Click SuccesFully");
				break;
			}

		}
		
		
	//	DataTimemytrip.CalenderFiled();
		WebElement filed=driver.findElement(By.xpath("//input[@class='input_cld']"));
		
		WebElement NextFiled=driver.findElement(By.xpath("//input[@class='input_cld hide-ddate round-but1']"));
				
		String date="21-02-2020";
		String nextDate="23-02-2020";
		
		DataTimemytrip.Date(driver, filed, date);
		
		DataTimemytrip.Date(driver, NextFiled, nextDate);
		
		
		
		
		
		
		
		;
	}
	
	
	
	
/*	
	@Test
	public void SendKeyEvent() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushikesh\\Desktop\\ChromeDriver79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		WebElement FromTextFild=driver.findElement(By.xpath("//input[@id='FromSector_show']"));
		FromTextFild.clear();
		FromTextFild.sendKeys("MUM");
		Thread.sleep(2000);;
		FromTextFild.sendKeys(Keys.ENTER);
		
		String ExceptedCity="Bangluru";
		
		WebElement Destination=driver.findElement(By.xpath("//input[@id='Editbox13_show']"));
		Destination.clear();
		
		
		
		
		
		
	}*/

}
