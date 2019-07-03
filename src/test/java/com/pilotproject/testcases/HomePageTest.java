package com.pilotproject.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pilotproject.Pages.HomePage;
import com.pilotproject.Pages.LoginPage;
import com.pilotproject.Pages.NewCustomerPage;
import com.pilotproject.Util.TestUtil;
import com.pilotproject.qa.TestBase;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	NewCustomerPage newCustomerPage;
	
	public HomePageTest() {
		super();
	}
	
	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		newCustomerPage = new NewCustomerPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Guru99 Bank Manager HomePage","Home page title not matched");
	}

	@Test(priority=2)
	public void verifyContactsLinkTest(){
		newCustomerPage = homePage.clickOnNewCustomerLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
