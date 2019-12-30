package SeleniumPracticeJava.SeleniumPracticeJava;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.base.CustomListeners;
import com.qa.base.TestBase;



@Listeners(CustomListeners.class)
public class MyFaildTest extends TestBase {
	
	
	
	@Test
	public void FaildTest()
	{
		intialization();
		Assert.assertEquals(false, true);
	}

}
