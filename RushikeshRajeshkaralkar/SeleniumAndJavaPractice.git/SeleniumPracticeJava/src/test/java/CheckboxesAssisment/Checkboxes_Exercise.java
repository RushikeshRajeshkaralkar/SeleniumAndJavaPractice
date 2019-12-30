package CheckboxesAssisment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes_Exercise {
	public static WebDriver driver;

	public static void main(String[] args) {

		/*
		 *	1) Check the first Checkbox and verify if it is successfully checked and Uncheck
		 * it again to verify if i t is successfully Unchecked
		 */
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushikesh\\Desktop\\ChromeDriver79\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));

		boolean CheckSelect1 = checkbox1.isSelected();
		System.out.println("Checkbox is Not Selected  :  " + CheckSelect1);
		checkbox1.click();
		CheckSelect1 = checkbox1.isSelected();
		System.out.println("Checkbox is Not Selected  :  " + CheckSelect1);

		/*
		 * 2) number of check boxes present in the page
		 */
		List<WebElement> CheckboxList = driver
				.findElements(By.xpath("//div[@id='checkbox-example']//fieldset//input[@type='checkbox']"));

		System.out.println(CheckboxList.size());

		
	}

}
