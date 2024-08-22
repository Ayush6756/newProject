package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css="#input-firstname")
	WebElement enterFirstName;
	
	@FindBy(css="#input-lastname")
	WebElement enterLastName;
	
	@FindBy(css="#input-email")
	WebElement enterEmail;
	
	@FindBy(css="#input-telephone")
	WebElement enterTelephone;
	
	@FindBy(css="#input-password")
	WebElement enterPassword;
	
	@FindBy(css="#input-confirm")
	WebElement enterConfirmPassword;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement clickCheckbox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement clickContinueBtn;
	
	public void firstName(String firstName) {
		enterFirstName.sendKeys(firstName);
	}
	
	public void lastName(String lastName) {
		enterLastName.sendKeys(lastName);
	}
	
	public void enterEmail(String email) {
		enterEmail.sendKeys(email);
	}
	
	public void enterTelephone(String telephone) {
		enterTelephone.sendKeys(telephone);
	}
	
	public void enterPassword(String pwd) {
		enterPassword.sendKeys(pwd);
	}
	
	public void reEnterPassword(String renterPwd) {
		enterConfirmPassword.sendKeys(renterPwd);
	}
	
	public void clickOnCheckbox() {
		clickCheckbox.click();	}
	
	public void clickOnContinue() {
		clickContinueBtn.click();
	}
	
	

}
