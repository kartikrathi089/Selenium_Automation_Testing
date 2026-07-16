package com.SelinumWebDriver.LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TagNameDemo {
	WebDriver driver;
	 int count;
	
	@Test
	public void TagNameDemo() {
		driver=new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		}catch(Exception e) {
			System.out.println("Cookie popup not displayed");
		}
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(WebElement ele:alllinks) {
			System.out.println(ele.isDisplayed());
			System.out.println(ele.isEnabled());
			System.out.println(ele.getAttribute("href"));
			
		}
		WebElement ele=alllinks.get(3);
		ele.click();
		
	}
	

}
