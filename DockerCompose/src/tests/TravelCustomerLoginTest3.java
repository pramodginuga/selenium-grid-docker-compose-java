package tests;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import businessAction.TravelCutomerLoginBusAction;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TravelCustomerLoginTest3 extends baseTests {
  @Test
  public void travelCustomerLogin3() {
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://www.phptravels.net/login");	  
	  TravelCutomerLoginBusAction travelCustBusAction = new TravelCutomerLoginBusAction(driver);
	  travelCustBusAction.TraveslCustomerSuccessfulLogin();
	  
  }  
}
