package com.Framework.TestCase;

import org.openqa.selenium.support.PageFactory;

import com.Framework_Pages.BaseClass;
import com.Framework_Pages.LoginPage;
import org.testng.annotations.*;
import utility.ExcelDataReader;

public class LoginOrangeHRM extends BaseClass {
	@Test
	public void loginApp() throws Exception{
		ExcelDataReader excel=new ExcelDataReader();
		excel.getStringData("LoginHRM", 0, 0);
		LoginPage loginHRM=PageFactory.initElements(driver ,LoginPage.class);
		loginHRM.login(excel.getStringData("LoginHRM", 0, 0),excel.getStringData("LoginHRM", 0, 1));
		Thread.sleep(10000);
		
	}

}
