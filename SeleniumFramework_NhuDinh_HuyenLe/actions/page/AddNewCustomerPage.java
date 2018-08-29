package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import demo.guru.AddNewCustomerPageUI;

public class AddNewCustomerPage extends AbstractPage {

	public AddNewCustomerPage(WebDriver driver) {
		super(driver);
	}

	public void inputCustomerName(String customerName) {
		inputTextToElement(AddNewCustomerPageUI.txtCustomerName, customerName);
	}

	

}
