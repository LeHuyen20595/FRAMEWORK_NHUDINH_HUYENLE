package common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import page.AccessDetailsPage;
import page.CreateNewAccountPage;

public class AbstractTest {
	public WebDriver driver;
	public String email = "lehuyen20595@gmail.com";

	public WebDriver openBrowser(String browser, String browserVersion) {
		if (browser.equalsIgnoreCase(Constant.FIREFOX_BROWSER)) {
			FirefoxDriverManager.getInstance().version(Constant.FIREFOX_VERSION).setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase(Constant.CHROME_BROWSER)) {
			ChromeDriverManager.getInstance().version(Constant.CHROME_VERSION).setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase(Constant.IE_BROWSER)) {
			InternetExplorerDriverManager.getInstance().version(Constant.IE_VERSION).setup();
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}

	public void closeBrowser() {
		driver.quit();
	}

	public List<String> getBankAccount(WebDriver driver) {
		List<String> bankAccount = new ArrayList<>();
		CreateNewAccountPage createNewAccountPage = PageManageDriver.getCreateNewAccountPage(driver);
		createNewAccountPage.goToCreateAccountPage();
		createNewAccountPage.inputEmail(email);
		AccessDetailsPage accessDetailsPage = createNewAccountPage.clickToSubmitButton();
		String userId = accessDetailsPage.getUserId();
		String password = accessDetailsPage.getPassword();
		System.out.println("userId: " + userId);
		System.out.println("password: " + password);
		bankAccount.add(userId);
		bankAccount.add(password);
		return bankAccount;
	}
	
	

}
