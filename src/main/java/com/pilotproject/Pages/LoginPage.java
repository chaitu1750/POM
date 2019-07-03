package com.pilotproject.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pilotproject.qa.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name ="uid")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(name ="btnLogin")
	WebElement btnLogin;
	
	@FindBy(name ="btnReset")
	WebElement btnReset;
	
//	@FindBy(xpath="//div/h2[@class=\"barone\"]/text()")
//	WebElement guruLogo;

	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
/*	public boolean validateLogo(){
		return guruLogo.isDisplayed();
		
	}  */
	
	public void validateResetBtn() {
		btnReset.click();
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", btnLogin);
		    	
		return new HomePage();
	}
	
	
}
