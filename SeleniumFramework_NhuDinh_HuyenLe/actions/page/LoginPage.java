package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import common.Constant;
import common.PageManageDriver;
import demo.guru.LoginPageUI;

public class LoginPage extends AbstractPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void goToLoginPage() {
		openAnyUrl(Constant.DEMO_GURU_URL + "/v4");
	}

	public void inputUserId(String userId) {
		inputTextToElement(LoginPageUI.txtUserId, userId);
	}

	public void inputPassword(String password) {
		inputTextToElement(LoginPageUI.txtPassword, password);
	}

	public void clickLoginButton() {
		clickToElement(LoginPageUI.btnLogin);
	}

	public CreateNewAccountPage clickToHereLink() {
		clickToElement(LoginPageUI.linkHere);
		return PageManageDriver.getCreateNewAccountPage(driver);
	}
}
