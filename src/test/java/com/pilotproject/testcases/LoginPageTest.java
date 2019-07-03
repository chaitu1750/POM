package com.pilotproject.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pilotproject.Pages.HomePage;
import com.pilotproject.Pages.LoginPage;
import com.pilotproject.qa.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
/*	@Test(priority=2)
	public void validateLogoTest(){
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
		
	} */
	
	@Test(priority=1)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=2)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Guru99 Bank Home Page");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
