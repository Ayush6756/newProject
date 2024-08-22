package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = " //a[text()='Register']")
	WebElement Register;
	
	@FindBy(css=".caret")
	WebElement clkMyAccount;
	
	public void clickOnMyAccount() {
		clkMyAccount.click();
	}
	
	public void clickOnRegister() {
		Register.click();
	}
	
	

}
