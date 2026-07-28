package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	WebDriver driver;
	public static WebDriver BrowserOptions(WebDriver driver, String browser,String AppUrl) {		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();

		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
	}
		else {
			System.out.println("Sorry! We do not Support This Browser");
		}
		
		driver.manage().window().maximize();
		driver.get(AppUrl);
		return driver;
	}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
