package businessAction;

import org.openqa.selenium.WebDriver;

import pages.TravelsCustomerLoginPage;
import pages.TravelCustomerLandingPage;

import org.testng.Assert;

public class TravelCutomerLoginBusAction {

	WebDriver driver; 
	TravelsCustomerLoginPage travelLoginPage;
    TravelCustomerLandingPage travelLandingPage;
    
	public TravelCutomerLoginBusAction(WebDriver driver) {
          this.driver = driver;
          
         travelLoginPage = new TravelsCustomerLoginPage(driver);
      	 travelLandingPage = new TravelCustomerLandingPage(driver);
	}
	
	  public void TraveslCustomerSuccessfulLogin()
	  {
	  customerLogin();
	  String welcomeText = travelLandingPage.getHomeLinkText();
	  //Assert.assertTrue(welcomeText.contains("Hi"), "Home Page not found");
	  }
	  
	  private void customerLogin()
	  {
		  travelLoginPage.enterLoginId();
		  travelLoginPage.enterPassword();
		  travelLoginPage.clickOnLoginButton();
	  }
}
