package SeleniumFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogginPage {
	
	WebDriver driver;
	public LogginPage(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="uid")
	WebElement userNameField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(name="btnLogin")
	WebElement button;
	
	public void setUserName(String userName) {
		userNameField.sendKeys(userName);
		
	}
	
	public void setPassword(String password) {
		passwordField.sendKeys(password);
				
	}
	public void loginButton() {
		button.click();
				
	}
}
