package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.Helper;

public class MouseHandOver {
	int linkCount;
	List<WebElement> list;
	
WebDriver driver;
	
	@BeforeTest
	public void LaunchDriver() throws InterruptedException {
		driver=Helper.startBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(10000);
		
		
	}
	@Test
	public void mouseOver() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"));
		
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		list=driver.findElements(By.tagName("a"));
		System.out.println("Number of a links"+list.size());
		
		for(WebElement el:list) {
			System.out.println(el.getText());
			
		}
		Thread.sleep(10000);
		WebElement ele1=driver.findElement(By.xpath("(//div[contains(text(),'You1st')])[1]"));
		
		ele1.click();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}
	

}
