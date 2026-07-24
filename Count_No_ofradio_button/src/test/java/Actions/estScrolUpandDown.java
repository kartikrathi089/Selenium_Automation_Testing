package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.Helper;

public class estScrolUpandDown {

WebDriver driver;
	
	@BeforeTest
	public void LaunchDriver() throws InterruptedException {
		driver=Helper.startBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(10000);
		
		
	}
      @Test
	public void Test1() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("scroll(0,6600)");
		Thread.sleep(10000);
		
		((JavascriptExecutor) driver).executeScript("window.scroll(0,-4200)","");
		
	}
}
