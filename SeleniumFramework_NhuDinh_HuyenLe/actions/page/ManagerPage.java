package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import common.PageManageDriver;
import demo.guru.ManagerPageUI;

public class ManagerPage extends AbstractPage {

	public ManagerPage(WebDriver driver) {
		super(driver);
	}

	public AddNewCustomerPage clickToNewCustomerMenu() {
		clickToElement(ManagerPageUI.linkNewCustomer);
		return PageManageDriver.getAddNewCustomerPage(driver);
	}

}
