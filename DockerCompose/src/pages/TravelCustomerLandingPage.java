package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class TravelCustomerLandingPage {

	WebDriver driver;
	
	public TravelCustomerLandingPage(WebDriver driver) {
          this.driver = driver;
	}
	
	By wecomeText = By.xpath("(//h2[@class='sec__title font-size-30 text-white'])[1]");
	
	public String getHomeLinkText()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(wecomeText));
		return driver.findElement(wecomeText).getText();		
	}
	
}
