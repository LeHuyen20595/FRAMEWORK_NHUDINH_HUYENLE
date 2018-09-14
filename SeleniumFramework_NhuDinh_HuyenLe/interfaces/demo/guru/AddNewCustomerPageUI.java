package demo.guru;

import org.openqa.selenium.By;

public class AddNewCustomerPageUI {

	public static By txtCustomerName = By.name("name");
	public static By lbMessage = By.id("message");
	public static By rdMale = By.xpath("//input[@type='radio' and @value='m']");
	public static By rdFemale = By.xpath("//input[@type='radio' and @value='f']");
	public static By txtDateOfBirth = By.id("dob");
	public static By arAddress = By.name("addr");
	public static By txtCity = By.name("city");
	public static By txtState = By.name("state");
	public static By txtPin = By.name("pinno");
	public static By txtMobilePhone = By.name("telephoneno");
	public static By txtEmail = By.name("emailid");
	public static By txtPassword = By.name("password");
	public static By btnSubmit = By.name("sub");
	public static By txtReset = By.name("res");

}
