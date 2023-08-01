package xyz.manager.addcustomer.action;

import org.openqa.selenium.WebDriver;

import xyz.bank.manager.locators.ManagerLocators;
import xyz.listener.helper.ListenerHelper;

public class AddCustomerFlow implements  ManagerLocators{
	
	WebDriver driver;
	ListenerHelper helper;
	
	public AddCustomerFlow(WebDriver driver) {
		this.driver = driver;
	}
	
	public void add_customer_flow(String fName, String lName, String pCode) {
		
		helper = new ListenerHelper(driver);
		
		helper.waithelper.waitForVisibilityOfElement(ADD_CUSTOMER_TAB, 10);
		helper.clickHelper.clickElement(ADD_CUSTOMER_TAB);
		
		helper.waithelper.waitForVisibilityOfElement(FIRST_NAME_FLD, 10);
		helper.send_data_to.sendKeysToElement(FIRST_NAME_FLD, fName);
		
		helper.waithelper.waitForVisibilityOfElement(LAST_NAME, 10);
		helper.send_data_to.sendKeysToElement(LAST_NAME, lName);
		
		helper.waithelper.waitForVisibilityOfElement(POST_CODE, 10);
		helper.send_data_to.sendKeysToElement(POST_CODE, pCode);
		
		helper.waithelper.waitForVisibilityOfElement(ADD_CUSTOMER_BTN, 10);
		helper.clickHelper.clickElement(ADD_CUSTOMER_BTN);
		
		
		
		
	}

}
