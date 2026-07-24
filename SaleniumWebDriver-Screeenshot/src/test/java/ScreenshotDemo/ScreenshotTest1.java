package ScreenshotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotTest1 {

	@Test
	public void screenshotTest() throws IOException {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
        
        TakesScreenshot ts=(TakesScreenshot) driver;
        
        File source=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./Screenshot/FacebookHomepage.png"));
        driver.quit();
	}
}
