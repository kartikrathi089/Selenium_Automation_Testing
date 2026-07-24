package com.Easycalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalculation.Pages.LoginEasycal;

import utility.Helper;

public class ExcecuteLoginPage {
	
	@Test
	public void exceute() throws InterruptedException {
		WebDriver driver=Helper.startBrowser("chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
		
		LoginEasycal log=PageFactory.initElements(driver,LoginEasycal.class);
		
		log.loginEasy("9740673180", "raghubn@123");
	}
	

}
