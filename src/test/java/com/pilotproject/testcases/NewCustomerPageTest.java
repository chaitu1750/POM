package com.pilotproject.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pilotproject.Pages.HomePage;
import com.pilotproject.Pages.LoginPage;
import com.pilotproject.Pages.NewCustomerPage;
import com.pilotproject.Util.TestUtil;
import com.pilotproject.qa.TestBase;

public class NewCustomerPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	NewCustomerPage newCustomerPage;
	
	String sheetName = "NewCustomer";

	public NewCustomerPageTest(){
		super();
		
}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		testUtil = new TestUtil();
		newCustomerPage = new NewCustomerPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		TestUtil.runTimeInfo("error", "login successful");
		newCustomerPage = homePage.clickOnNewCustomerLink();
	}
	
	@DataProvider(name="")
	public Object[][] getGuruTestData() {
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	@Test(priority=1, dataProvider="getGuruTestData")
	public void validatecreateNewCustomer(String name, String dob, String address, String city, String state,String pinno, String mobile, String emailid, String password){
		homePage.clickOnNewCustomerLink();
		//newCustomerPage.createNewCustomer("GuruDemoSite", "05/05/2005", "711ShellBlvd", "SanMateo", "California", "944054", "1234567890", "guru99@gmail.com", "3303");
		newCustomerPage.createNewCustomer(name, dob, address, city, state, pinno, mobile, emailid, password);
		newCustomerPage.validateSubmit();
	}
	
/*	@DataProvider(name ="createCustomer")
	public static Object[][] newCustomer(){
		return new Object[][] { {"guruDemoSite", "05/05/2005", "711shellblvd", "SanMateo", "FosterCity", "944045", "0987654321", "guru99@gmail.com", "3303"}};
	}

	
	//@Test(priority=1, dataProvider="getCRMTestData")
	@Test(priority=1, dataProvider ="createCustomer")
	public void validatecreateNewCustomer(String name, String dob, String address, String city, String state,String pinno, String mobile, String emailid, String password){
		//homePage.clickOnNewCustomerLink();
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		newCustomerPage.createNewCustomer(name, dob, address, city, state, pinno, mobile, emailid, password);
		newCustomerPage.validateSubmit();
	}    */
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
