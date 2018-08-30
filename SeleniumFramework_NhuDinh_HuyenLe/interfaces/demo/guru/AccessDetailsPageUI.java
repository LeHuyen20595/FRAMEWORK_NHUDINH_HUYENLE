package demo.guru;

import org.openqa.selenium.By;

public class AccessDetailsPageUI {

	public static By lbUserId = By.xpath("//td[contains(text(),'User ID')]/following-sibling::td");
	public static By lbPassword = By.xpath("//td[contains(text(),'Password')]/following-sibling::td");

}
