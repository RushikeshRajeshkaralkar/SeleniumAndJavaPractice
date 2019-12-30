package SeleniumPracticeJava.SeleniumPracticeJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class FirstSeleniumScript {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","A:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
//		
//		System.setProperty("webdriver.chrome.driver", "A:\\Chrome\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new SafariDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("------------------------------");
		driver.get("https://www.magicbricks.com");
	    String Title=driver.getTitle();
	    System.out.println("Title : ------------> "+Title);
	    WebElement BuyButton=driver.findElement(By.xpath("//a[@id='buyTab']"));
	    BuyButton.click();
	    WebElement SerchBox=driver.findElement(By.xpath("//input[@class='cityLocProjectField']"));
	    SerchBox.sendKeys("Mumbai");
	    
	    
	    List<WebElement> list=driver.findElements(By.xpath("//div[@class='localityKewordDropDown']//div/descendant::div//span"));
	    System.out.println(list.size());
	    Thread.sleep(5000);
	   
	    System.out.println("__________________________________");
	    
	  //*[@id="keyword_suggest"]
	  String beforexpath="//div[@id='keyword_suggest']/div[";
	  String afterxpath="]";
	  
	//*[@id="keyword_suggest"]/div[1]/div
	
	//*[@id="keyword_suggest"]/div[2]
	//*[@id="keyword_suggest"]/div[3]
	
	  
	  String First=driver.findElement(By.xpath("//*[@id='keyword_suggest']/div[1]/div")).getText();
	  System.out.println(First);
	  
	  

	  for(int i=2;i<list.size();i++)
	  {
		 String Alllist= beforexpath+i+afterxpath;
	
		// System.out.println(Alllist);
		 String alllistoflocations= driver.findElement(By.xpath(Alllist)).getText();
		 System.out.println(alllistoflocations);
		if(alllistoflocations.equals("Navi Mumbai"))
		{
			Thread.sleep(5000);
			 Actions action=new Actions(driver);
			 action.click(driver.findElement(By.xpath(Alllist)));
			 System.out.println(Alllist);
			 break;
		}
		 
		 
		 
	  }
	  
	  
//	 Actions action=new Actions(driver);
//	 action.moveToElement(driver.findElement(By.xpath("//span[text()='Property Type']"))).build().perform();
//	 action.click(driver.findElement(By.xpath("//input[@title='Flat']"))).build().perform();
//	    driver.close();
	}

}
