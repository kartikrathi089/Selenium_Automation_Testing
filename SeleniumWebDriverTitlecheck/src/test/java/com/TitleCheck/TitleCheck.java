package com.TitleCheck;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TitleCheck {
	
    @Test(priority=0)
	public void chromeBrowserTest() {
		String expectedValueTitle="Test Login | Practice Test Automation";
		String expectedValueUrl="https://practicetestautomation.com/practice-test-login/";
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		String actualValueTitle=driver.getTitle();
		if(expectedValueTitle.equals(actualValueTitle)) {
			System.out.println("expected title matches with actual title : "+actualValueTitle);
		}else {
			System.out.println("expected title not equal to actual title");
		}
		
		
		String actualValueUrl=driver.getCurrentUrl();
		if(expectedValueUrl.equals(actualValueUrl)) {
			System.out.println("expected URl matches with actual URL : "+actualValueUrl);
		}else {
			System.out.println("expected URL not equal to actual URL");
		}
				
//		String pageContent=driver.getPageSource();
//		System.out.println("Page Content: "+pageContent);
		
		driver.quit();
				
				
	}
	@Test(priority=2)
	public void FireFoxBrowserTest() {
		String expectedValueTitle="Selenium";
		String expectedValueUrl="https://www.selenium.dev/";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		String actualValueTitle=driver.getTitle();
		if(expectedValueTitle.equals(actualValueTitle)) {
			System.out.println("expected title matches with actual title : "+actualValueTitle);
		}else {
			System.out.println("expected title not equal to actual title ");
		}
		
		String actualValueUrl=driver.getCurrentUrl();
		if(expectedValueUrl.equals(actualValueUrl)) {
			System.out.println("expected URl matches with actual URL : "+actualValueUrl);
		}else {
			System.out.println("expected URL not equal to actual URL");
		}
				
//		String pageContent=driver.getPageSource();
//		System.out.println("Page Content: "+pageContent);
		driver.quit();
				
		
	}
	
	@Test(priority=1)
    public void EdgeBrowserTest() {
		String expectedValueTitle= "Just a moment...";
		String expectedValueUrl="https://mvnrepository.com/";
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		
		String actualValueTitle=driver.getTitle();
		if(expectedValueTitle.equals(actualValueTitle)) {
			System.out.println("expected title matches with actual title : "+actualValueTitle);
		}else {
			System.out.println("expected title not equal to actual title");
		}
		String actualValueUrl=driver.getCurrentUrl();
		if(expectedValueUrl.equals(actualValueUrl)) {
			System.out.println("expected URl matches with actual URL : "+actualValueUrl);
		}else {
			System.out.println("expected URL not equal to actual URL");
		}
				
		
		
				
//		String pageContent=driver.getPageSource();
//		System.out.println("Page Content: "+pageContent);
		driver.quit();
		
	}
}
