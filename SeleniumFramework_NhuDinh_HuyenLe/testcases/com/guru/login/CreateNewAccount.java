package com.guru.login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.AbstractTest;
import common.Constant;
import common.PageManageDriver;
import page.AccessDetailsPage;
import page.CreateNewAccountPage;

public class CreateNewAccount extends AbstractTest {
	WebDriver driver;
	String email = "nhudinh34@gmail.com";

	@BeforeTest
	public void setUp() {
		driver = openBrowser(Constant.CHROME_BROWSER, Constant.CHROME_VERSION);
	}

	@Test
	public void createNewAccount() {
		CreateNewAccountPage createNewAccountPage = PageManageDriver.getCreateNewAccountPage(driver);
		createNewAccountPage.goToCreateAccountPage();
		createNewAccountPage.inputEmail(email);
		AccessDetailsPage accessDetailsPage = createNewAccountPage.clickToSubmitButton();
		String userId = accessDetailsPage.getUserId();
		String password = accessDetailsPage.getPassword();
		System.out.println("userId: " + userId);
		System.out.println("password: " + password);
	}

	@AfterTest
	public void tearDown() {
		closeBrowser();
	}
}
