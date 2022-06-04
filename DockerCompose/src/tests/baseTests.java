package tests;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class baseTests {
	WebDriver driver;
	DesiredCapabilities dc;
	RemoteWebDriver rwd;
	String hubUrl = "http://localhost:4444";
	
	@Parameters({"browser", "grid"})	
	@BeforeClass
	 public void setUp (String browser, String grid) throws MalformedURLException {
		
		  if(browser.equalsIgnoreCase("firefox")) 
		  {
			  if(grid.contains("false"))
			  {
				  WebDriverManager.firefoxdriver().setup();		  
				  driver = new FirefoxDriver();	  
			  }
			  else
			  {
				  FirefoxOptions fireFoxOptions = new FirefoxOptions();
				  fireFoxOptions.setCapability("platformName", "Linux");
				  driver = new RemoteWebDriver(new URL(hubUrl), fireFoxOptions);
			  }
		  }
		  else if (browser.equalsIgnoreCase("chrome")) 
		  { 
			  if(grid.contains("false"))
			  {
				  WebDriverManager.chromedriver().setup();
				  driver = new ChromeDriver();
			  }
			  else
			  {
				  ChromeOptions chromeOptions = new ChromeOptions();
				  chromeOptions.setCapability("platformName", "Linux");
				  driver = new RemoteWebDriver(new URL(hubUrl), chromeOptions);
			  }
		  }
		  else if (browser.equalsIgnoreCase("edge")) 
		  { 
			  if(grid.contains("false"))
			  {
			  WebDriverManager.edgedriver().setup();
			  driver= new EdgeDriver();
			  }
			  else
			  {
				  EdgeOptions edgeOptions = new EdgeOptions();
				  edgeOptions.setCapability("platformName", "Linux");
				  driver = new RemoteWebDriver(new URL(hubUrl), edgeOptions);
			  }
		  }
		  }
	 
	 @AfterClass
	  public void tearDown() throws Exception {
	     if (driver != null) {	    	 
	          driver.quit();
	      }
	  }
}
