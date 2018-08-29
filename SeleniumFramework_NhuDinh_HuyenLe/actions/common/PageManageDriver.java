package common;

import org.openqa.selenium.WebDriver;

import page.AccessDetailsPage;
import page.AddNewCustomerPage;
import page.CreateNewAccountPage;
import page.LoginPage;
import page.ManagerPage;

public class PageManageDriver {
	public static LoginPage loginPage;
	public static ManagerPage managerPage;
	public static CreateNewAccountPage createNewAccountPage;
	public static AccessDetailsPage accessDetailsPage;
	public static AddNewCustomerPage addNewCustomerPage;

	public static LoginPage getLoginPage(WebDriver driver) {
		if (loginPage == null) {
			return new LoginPage(driver);
		}
		return loginPage;
	}

	public static ManagerPage getManagerPage(WebDriver driver) {
		if (managerPage == null) {
			return new ManagerPage(driver);
		}
		return managerPage;
	}
	
	public static CreateNewAccountPage getCreateNewAccountPage(WebDriver driver) {
		if (createNewAccountPage == null) {
			return new CreateNewAccountPage(driver);
		}
		return createNewAccountPage;
	}
	
	public static AccessDetailsPage getAccessDetailsPage(WebDriver driver) {
		if (accessDetailsPage == null) {
			return new AccessDetailsPage(driver);
		}
		return accessDetailsPage;
	}
	
	public static AddNewCustomerPage getAddNewCustomerPage(WebDriver driver) {
		if (addNewCustomerPage == null) {
			return new AddNewCustomerPage(driver);
		}
		return addNewCustomerPage;
	}
	
}
