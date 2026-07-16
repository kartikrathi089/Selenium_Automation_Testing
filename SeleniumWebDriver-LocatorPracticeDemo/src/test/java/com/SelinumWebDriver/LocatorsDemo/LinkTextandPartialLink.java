package com.SelinumWebDriver.LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTextandPartialLink {
	
	WebDriver driver;
	 int count;
	
	@BeforeTest
	public void ChromeTest() {
		driver=new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		}catch(Exception e) {
			System.out.println("Cookie popup not displayed");
		}
	}
	@Test
	public void partialTest() {
		driver.findElement(By.partialLinkText("Vitamins")).click();
		List<WebElement> element =  driver.findElements(By.xpath("//a"));
		count +=element.size();
		System.out.println(count);
		for(int i=0;i<element.size();i++) {
			System.out.println(element.get(i).getText());
			String str=element.get(i).getText();
			String str1="vitamins";
			if(str==str1) {
				driver.findElement(By.linkText("Vitamins")).click();
				
			}
		}
		
		
		
	}

}
