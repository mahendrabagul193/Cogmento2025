package Steps;

import BaseLayer.BaseClass;
import io.cucumber.java.AfterAll;

public class Hooks extends BaseClass {
	@AfterAll
	public static void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
