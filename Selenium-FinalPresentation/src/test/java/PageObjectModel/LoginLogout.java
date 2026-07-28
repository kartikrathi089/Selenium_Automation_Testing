package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLogout {
	WebDriver driver;
	
	public LoginLogout(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="log_email")
	WebElement email;
	
	@FindBy(id="log_password")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='log_submit']")
	WebElement sumbit;
	
	@FindBy(xpath="//span[contains(text(),'Logout')]")
	WebElement out;
	
	@FindBy(xpath="//a[normalize-space()='Converters']")
	WebElement converter;
	
	@FindBy(xpath="//a[normalize-space()='Area Unit Converter']")
	WebElement areaCon;
	
	
	@FindBy(xpath="//input[@id='inps']")
	WebElement covertFrom;
	
	@FindBy(xpath="//select[@id='selfrm']")
	WebElement metrix;
	
	@FindBy(xpath="//select[@id='selto']")
	WebElement metrix1;
	
	
	@FindBy(xpath="//input[@value='Calculate']")
	WebElement calculate;
	
	Select Unit ;
	
	
	public  void Login(String Username , String Pass) throws InterruptedException {
		email.sendKeys(Username);
		Password.sendKeys(Pass);  
		Thread.sleep(5000);
		sumbit.click();
	
	}
	
	public void performConvertor() throws InterruptedException {
		Thread.sleep(5000);
		converter.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(areaCon)).click();
		Thread.sleep(5000);
		covertFrom.sendKeys("1000");
		Unit= new Select(metrix);
		Unit.selectByVisibleText("Acre");
		Unit= new Select(metrix1);
		Unit.selectByVisibleText("Cent");
		calculate.click();
	}
	
	public void Result() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement squareMeter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("a0")));

	    WebElement squareMilli = wait.until( ExpectedConditions.visibilityOfElementLocated(By.id("a1")) );

	    WebElement squareCent = wait.until( ExpectedConditions.visibilityOfElementLocated(By.id("a2")));

	    WebElement squareDeci = wait.until( ExpectedConditions.visibilityOfElementLocated(By.id("a3")));
	    System.out.println("\n==============================================");
	    System.out.println("         AREA CONVERSION RESULTS");
	    System.out.println("==============================================");

	    System.out.printf("%-20s : %s%n", "Square Meter", squareMeter.getAttribute("value"));
	    System.out.printf("%-20s : %s%n", "Square Feet", squareMilli.getAttribute("value"));
	    System.out.printf("%-20s : %s%n", "Square Yard", squareCent.getAttribute("value"));
	    System.out.printf("%-20s : %s%n", "Cent", squareDeci.getAttribute("value"));

	    System.out.println("==============================================");
	}
	
	public void logout() {

		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.urlContains("area-unit-conversion.php"));

    wait.until(ExpectedConditions.elementToBeClickable(out));

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", out);

	
	}
	
	
	

}
