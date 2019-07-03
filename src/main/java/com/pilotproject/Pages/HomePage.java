package com.pilotproject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pilotproject.qa.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[@href='addcustomerpage.php']")
	WebElement newCustomer;
	
	@FindBy(xpath="//a[@href='EditCustomer.php']")
	WebElement editCustomer;
	
	@FindBy(xpath="//a[@href='DeleteCustomerInput.php']")
	WebElement deleteCustomer;
	
	@FindBy(xpath="//a[@href='addAccount.php']")
	WebElement addAccount;
	
	@FindBy(xpath="//a[@href='editAccount.php']")
	WebElement editAccount;
	
	@FindBy(xpath="//a[@href='deleteAccountInput.php']")
	WebElement deleteAccount;
	
	@FindBy(xpath="//a[@href='DepositInput.php']")
	WebElement deposit;
	
	@FindBy(xpath="//a[@href='WithdrawalInput.php']")
	WebElement withdrawal;
	
	@FindBy(xpath="//a[@href='FundTransInput.php']")
	WebElement fundTransfer;
	
	@FindBy(xpath="//a[@href='PasswordInput.php']")
	WebElement changePassword;
	
	@FindBy(xpath="//a[@href='BalEnqInput.php']")
	WebElement balEnquiry;
	
	@FindBy(xpath="//a[@href='MiniStatementInput.php']")
	WebElement miniStatement;
	
	@FindBy(xpath="//a[@href='CustomisedStatementInput.php']")
	WebElement customisedStatment;
	
	@FindBy(xpath="//a[@href='Logout.php']")
	WebElement logout;
	
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public NewCustomerPage clickOnNewCustomerLink(){
		newCustomer.click();
		return new NewCustomerPage();
	}
	
	public void logout() {
		logout.click();
	}
}
