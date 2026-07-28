package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import utility.BrowserFactory;
import utility.ConfigDataProvider;
import utility.ExcelDataReader;
import utility.Screenshot;


public class BaseClass {
	public WebDriver driver;
	public ExcelDataReader excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void SetUp() {
		excel=new ExcelDataReader();
		config=new ConfigDataProvider();
		
	}
	@BeforeClass
	public void BrowserTest() {
		driver=BrowserFactory.BrowserOptions(driver,config.getBrowser(),config.getAppURL());
	}

	@AfterMethod
	
	public void tearDownMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			Screenshot.capturedScreenShot(driver);
		}
	}

}
