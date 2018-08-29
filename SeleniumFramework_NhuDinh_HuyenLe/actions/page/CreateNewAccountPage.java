package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import common.Constant;
import common.PageManageDriver;
import demo.guru.CreateNewAccountPageUI;

public class CreateNewAccountPage extends AbstractPage {

	public CreateNewAccountPage(WebDriver driver) {
		super(driver);
	}

	public void goToCreateAccountPage() {
		openAnyUrl(Constant.DEMO_GURU_URL);
	}

	public void inputEmail(String email) {
		inputTextToElement(CreateNewAccountPageUI.txtEmail, email);
	}

	public AccessDetailsPage clickToSubmitButton() {
		clickToElement(CreateNewAccountPageUI.btnSubmit);
		return PageManageDriver.getAccessDetailsPage(driver);
	}
}
