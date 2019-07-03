package com.pilotproject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pilotproject.qa.TestBase;

public class NewCustomerPage extends TestBase {

	@FindBy(name ="name")
	WebElement customerName;
	
	@FindBy(xpath = "//input[@value='f']")
	WebElement gender;
	
	@FindBy(name ="dob")
	WebElement dateofbirth;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	WebElement addressInput;
		
	@FindBy(name ="city")
	WebElement cityInput;
	
	@FindBy(name ="state")
	WebElement stateInput;
	
	@FindBy(name ="pinno")
	WebElement pin;
	
	@FindBy(name ="telephoneno")
	WebElement mobileNo;
	
	@FindBy(name ="emailid")
	WebElement emailID;

	@FindBy(name ="password")
	WebElement pwd;

	@FindBy(xpath ="//input[@type='submit']")
	WebElement SubmitBtn;
	
	@FindBy(name ="Reset")
	WebElement ResetBtn;
	
	// Initializing the Page Objects:
	public NewCustomerPage() {
		PageFactory.initElements(driver, this);
	}
		
	public void createNewCustomer (String name, String dob, String address, String city, String state,String pinno, String mobile, String emailid, String password) {
		//select.selectByVisibleText(title);
		customerName.sendKeys(name);
		gender.click();
		dateofbirth.sendKeys(dob);
		addressInput.sendKeys(address);
		cityInput.sendKeys(city);
		stateInput.sendKeys(state);
		pin.sendKeys(pinno);
		mobileNo.sendKeys(mobile);
		emailID.sendKeys(emailid);
		pwd.sendKeys(password);
		addressInput.sendKeys(address);
		
	}

	public void validateSubmit() {
		SubmitBtn.click();
	}
	
}
