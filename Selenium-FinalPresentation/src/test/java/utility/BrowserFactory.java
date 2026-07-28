package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
public static WebDriver BrowserOptions(WebDriver driver,String browserName,String url) {
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Sorry! We do not Support This Browser");
		}
		driver.get(url);
		return driver;
}
public static void quitBrowser(WebDriver driver) {
	driver.quit();
}

}
