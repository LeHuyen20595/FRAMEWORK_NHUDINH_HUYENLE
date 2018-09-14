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

	public void chooseCustomerMale() {
		clickToElement(AddNewCustomerPageUI.rdMale);
	}

	public void chooseCustomerFemale() {
		clickToElement(AddNewCustomerPageUI.rdFemale);
	}

	public void inputDateOfBirth(String date) {
		inputTextToElement(AddNewCustomerPageUI.txtDateOfBirth, date);
	}

	public void inputAddress(String address) {
		inputTextToElement(AddNewCustomerPageUI.arAddress, address);
	}

	public void inputCity(String city) {
		inputTextToElement(AddNewCustomerPageUI.txtCity, city);
	}

	public void inputState(String state) {
		inputTextToElement(AddNewCustomerPageUI.txtState, state);
	}

	public void inputPin(String pin) {
		inputTextToElement(AddNewCustomerPageUI.txtPin, pin);
	}

	public void inputMobile(String mobile) {
		inputTextToElement(AddNewCustomerPageUI.txtMobilePhone, mobile);
	}

	public void inputEmail(String email) {
		inputTextToElement(AddNewCustomerPageUI.txtEmail, email);
	}

	public void inputPassword(String password) {
		inputTextToElement(AddNewCustomerPageUI.txtPassword, password);
	}

	public void submitSuccessful() {

	}

	public String submitInvalid() {
		clickToElement(AddNewCustomerPageUI.btnSubmit);
		return getTextAlert();
	}

}
