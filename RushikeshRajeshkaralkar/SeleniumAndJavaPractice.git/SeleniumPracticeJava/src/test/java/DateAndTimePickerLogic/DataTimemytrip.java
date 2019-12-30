package DateAndTimePickerLogic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bsh.commands.dir;

public class DataTimemytrip {

	public static WebDriver driver;

	public static void CalenderFiled() throws InterruptedException {
		String ExceptedMonthe = "jan 2020";
		WebElement calenderlogo = driver.findElement(By.xpath("//div[@id='dvfarecal']"));
		calenderlogo.click();

		String month = driver.findElement(By.xpath("//div[@id='dvcalendar']//div[@class='month']")).getText();
		System.out.println(month);

		if ((month).equalsIgnoreCase(ExceptedMonthe)) {
			System.out.println("Correct Monthe Is Click");
		} else {
			for (int i = 0; i < 12; i++) {

				WebElement Buttonnext = driver
						.findElement(By.xpath("//div[@id='dvcalendar']//div[@class='month3']//img[@alt='Arrow']"));
				Buttonnext.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				month = driver.findElement(By.xpath("//div[@id='dvcalendar']//div[@class='month']")).getText();
				if (month.equalsIgnoreCase(ExceptedMonthe)) {
					break;
				}

			}
		}

		Thread.sleep(5000);
		List<WebElement> DaysOfList = driver
				.findElements(By.xpath("//div[@id='dvcalendar']//div//div[@class='days']//li"));
		System.out.println(DaysOfList.size());
		for (int j = 0; j < DaysOfList.size(); j++) {
			String Day = DaysOfList.get(j).getText();
			System.out.println(Day);
			if (Day.equalsIgnoreCase("1")) {
				DaysOfList.get(j).click();
				System.out.println("Click Is Right ");
				break;
			}

		}

	}

	public static void Date(WebDriver driver, WebElement element, String string) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + string + "';", element);
	}

}
