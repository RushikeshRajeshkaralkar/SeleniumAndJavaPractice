package hadelesBrawoser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadLessBrawoser {

	@Test
	public void HadlesTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\U4sers\\Rushikesh\\Desktop\\ChromeDriver79\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		
		
		options.addArguments("windows-size=1400,800");
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver=new HtmlUnitDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://github.com/SeleniumHQ/htmlunit-driver/releases");
		System.out.println("Good Browser Is Launch ");
		driver.close();
	}
}
