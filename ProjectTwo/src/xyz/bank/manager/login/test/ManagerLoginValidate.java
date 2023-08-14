package xyz.bank.manager.login.test;

import org.testng.annotations.Test;

import utilities.browser.operations.BrowserOperation;
import xyz.listener.helper.ListenerHelper;

public class ManagerLoginValidate extends BrowserOperation{
	
	ListenerHelper helper;
	
	@Test
	public void validate_manager_button_login() {
		
		helper = new ListenerHelper(driver);
		helper.managerHelper.validateManagerLogin();
		
	}
	

}
