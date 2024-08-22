package testCase;

import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_001AccountRegistrationTC extends BaseClass {
//	WebDriver driver;
	
	@Test
	public void verify_Account_Registration() throws InterruptedException {
		
		logger.info("Starting executing TC_001AccountRegistration Test Case .....");
		
		try {

		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		logger.info("Clicked on My Account link ...");
		
		hp.clickOnRegister();
		logger.info("Clicked on Registration link ...");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		logger.info("Providing customer details ...");
		regpage.firstName("Ayush");
		regpage.lastName("Srivastava");
		regpage.enterEmail("ayushs7598@gmail.com");
		regpage.enterTelephone("8052094967");
		regpage.enterPassword("Ayush1234");
		regpage.reEnterPassword("Ayush1234");
		regpage.clickOnCheckbox();
		regpage.clickOnContinue();
		
		Thread.sleep(3000);
		}
		catch(Exception e){
			logger.error("Test Failed...");
			logger.debug("Debug logs...");
		}
		logger.info("Finished executing TC_001AccountRegistration Test Case .....");
	}

}
