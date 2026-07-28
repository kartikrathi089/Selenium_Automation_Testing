package PageFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModel.BaseClass;
import PageObjectModel.LoginLogout;
import utility.ExcelDataReader;

public class PageFactoryClass extends BaseClass{
	
	@Test
	public void excute() throws InterruptedException {
		
		LoginLogout login = PageFactory.initElements(driver,LoginLogout.class);
		
		
		login.Login(excel.getStringData("Sheet1",0,0),excel.getStringData("Sheet1",0,1));
		
		login.performConvertor();
		
		login.Result();
		
		login.logout();
		
		
	}

}
