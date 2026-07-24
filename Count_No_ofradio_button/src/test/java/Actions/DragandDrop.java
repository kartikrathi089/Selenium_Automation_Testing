package Actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import Utility.Helper;

public class DragandDrop {
	WebDriver driver;
	
	@BeforeTest
	public void LaunchDriver() {
		driver=Helper.startBrowser("chrome");
		driver.manage().window().maximize();
		
	}
	

}
