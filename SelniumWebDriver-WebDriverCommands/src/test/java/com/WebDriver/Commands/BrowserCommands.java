package com.WebDriver.Commands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BrowserCommands {
	@Test(priority=0)
	public void chromeBrowserTest() {
		
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		String browserTitle=driver.getTitle();
		System.out.println("Browser Title: "+browserTitle);
		
		
		String browserURL=driver.getCurrentUrl();
		System.out.println("BrowserUrl: "+browserURL);
				
//		String pageContent=driver.getPageSource();
//		System.out.println("Page Content: "+pageContent);
		
		driver.quit();
				
				
	}
	@Test(priority=2)
	public void FireFoxBrowserTest() {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		String browserTitle=driver.getTitle();
		System.out.println("Browser Title: "+browserTitle);
		
		String browserURL=driver.getCurrentUrl();
		System.out.println("BrowserUrl: "+browserURL);
				
//		String pageContent=driver.getPageSource();
//		System.out.println("Page Content: "+pageContent);
		driver.quit();
				
		
	}
	
	@Test(priority=1)
    public void EdgeBrowserTest() {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		
		String browserTitle=driver.getTitle();
		System.out.println("Browser Title: "+browserTitle);
		
		
		String browserURL=driver.getCurrentUrl();
		System.out.println("BrowserUrl: "+browserURL);
				
//		String pageContent=driver.getPageSource();
//		System.out.println("Page Content: "+pageContent);
		driver.quit();
		
	}
	
	
	

}
