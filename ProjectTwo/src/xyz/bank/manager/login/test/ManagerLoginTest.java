package xyz.bank.manager.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.browser.operations.BrowserOperation;
import xyz.listener.helper.ListenerHelper;

public class ManagerLoginTest extends BrowserOperation{
	
	ListenerHelper helper;
	
	@Test(description = "Validate Manager Login")
	public void validate_manager_login() {
		
		helper = new ListenerHelper(driver);
		helper.managerHelper.validateManagerLogin();
		
		
		
		
		String EXP_URL = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";
		helper.waithelper.waitForUrlToBe(driver, EXP_URL, 10);
		String ACT_TEXT = driver.getCurrentUrl();
		Assert.assertEquals(ACT_TEXT, EXP_URL, "URL Matched and test case passed");
	}

}
