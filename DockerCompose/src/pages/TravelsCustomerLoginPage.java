package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TravelsCustomerLoginPage {
	
	WebDriver driver;
		
	public TravelsCustomerLoginPage(WebDriver driver) {
          this.driver = driver;
	}
	
	By loginid = By.name("email");
	By password = By.name("password");
	By cookieInfo = By.id("cookie_stop");
	By loginButton = By.cssSelector("button.btn.btn-default.btn-lg.btn-block.effect.ladda-button.waves-effect");
	
	public void enterLoginId()
	{
		driver.findElement(loginid).sendKeys("user@phptravels.com");
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("demouser");
	}
	
	public void clickOnLoginButton()
	{		
		driver.findElement(cookieInfo).click();	//Handling element interrupted exception
		driver.findElement(loginButton).click();
	}
	
}
