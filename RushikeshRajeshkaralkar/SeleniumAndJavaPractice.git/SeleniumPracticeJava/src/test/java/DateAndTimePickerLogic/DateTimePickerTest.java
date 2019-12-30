package DateAndTimePickerLogic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DateTimePickerTest {

	@Test
	public void FirstTest() throws InterruptedException {
		String ExceptedDate = "February 2020";
		String ExceptedFulldate="2-21-2020";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushikesh\\Desktop\\ChromeDriver79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		String CurrentDate = driver
				.findElement(By.xpath(
						"//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']//div"))
				.getText();

		if (ExceptedDate.equalsIgnoreCase(CurrentDate)) {
			System.out.println("This Is Correct Date ");
		} else {
			try {
				for (int i = 0; i < 12; i++) {
					WebElement PriviusButton = driver.findElement(By.xpath(
							"//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']//span[@class='ui-icon ui-icon-circle-triangle-e']"));
					PriviusButton.click();
					Thread.sleep(2000);
					CurrentDate = driver.findElement(By.xpath(
							"//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']//div"))
							.getText();

					if (ExceptedDate.equalsIgnoreCase(CurrentDate)) {
						System.out.println("Year iS Match ");
						break;
					}

				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Year Is Worng : " + ExceptedDate);
			}
		}

		Thread.sleep(5000);

		List<WebElement> TableDateList = driver.findElements(
				By.xpath("//div[@id='ui-datepicker-div']//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		System.out.println(TableDateList.size());

		for (int i = 0; i < TableDateList.size(); i++) {
			String Date = TableDateList.get(i).getText();

			String MonthString = TableDateList.get(i).getAttribute("data-month");
			String year = TableDateList.get(i).getAttribute("data-year");
			String FullDate = MonthString+ "-" +Date + "-" + year;
			//System.out.println("Total Date Is : " + FullDate);
			if (FullDate.equalsIgnoreCase(ExceptedFulldate)) {
				TableDateList.get(i).click();
				System.out.println("Date Is Match : " +FullDate);
				break;
			}
		}

		Thread.sleep(2000);
		driver.quit();

	}

}
