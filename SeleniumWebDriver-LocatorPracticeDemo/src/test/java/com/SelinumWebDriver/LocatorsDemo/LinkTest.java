package com.SelinumWebDriver.LocatorsDemo;

import org.testng.annotations.BeforeMethod;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class LinkTest {
	
	WebDriver driver; 
	
	@BeforeTest
	public void setUp() throws InterruptedException {
	driver=new ChromeDriver();
	driver.navigate().to("https://www.hollandandbarrett.com/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	try {
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	}catch(Exception e) {
		System.out.println("Cookie popup not displayed");
	}
}
	@Test
	public void findElementById() throws Exception{
		
//	     ((WebElement) driver.findElements(By.xpath("//a[contains(text(),'Vitamins & Supplements')]"))).click();
		 driver.findElements(By.linkText("Vitamins & Supplements")).click();
		List<WebElement> element =  driver.findElements(By.xpath("//a"));
		
		int Count=0;
		Count=Count+element.size();
		System.out.println("Number of Links"+ Count);
		for(int i=0;i<element.size();i++) {
			System.out.println(element.get(i).getText());
			
		}
	}

}
