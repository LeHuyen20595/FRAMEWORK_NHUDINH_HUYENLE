package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import demo.guru.AccessDetailsPageUI;

public class AccessDetailsPage extends AbstractPage {

	public AccessDetailsPage(WebDriver driver) {
		super(driver);
	}

	public String getUserId() {
		waitForControlVisible(AccessDetailsPageUI.lbUserId);
		return getTextElement(AccessDetailsPageUI.lbUserId);
	}

	public String getPassword() {
		return getTextElement(AccessDetailsPageUI.lbPassword);
	}

}
