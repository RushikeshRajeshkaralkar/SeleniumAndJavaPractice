package SeleniumPracticeJava.SeleniumPracticeJava;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;
import com.qa.base.TestBase;

public class MyListeners extends TestBase implements ITestListener{
	
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		try {
			Files.copy(scrfile,new File("A:\\JavaPrograms\\SeleniumPracticeJava\\ScreenShot\\"+"Flied_"+result.getMethod().getMethodName()+"_"+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
