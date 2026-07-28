package com.Framework_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	//Create Constructor-
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy( how=How.ID, using="log_email")
	WebElement Username;
	
	@FindBy(how =How.NAME,name="log_password")
	WebElement Password;
	
	@FindBy( how=How.XPATH,using="//input[@name='log_submit']")
	WebElement BtnLogin;
	
	public void login(String uname,String pass) {
		Username.sendKeys(uname);
		Password.sendKeys(pass);
		BtnLogin.click();
	}

}
