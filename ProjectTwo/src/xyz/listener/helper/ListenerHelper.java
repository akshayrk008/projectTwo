package xyz.listener.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.clickonelement.ClickOnElement;
import utilities.explicitwait.ExplicitUtil;
import utilities.findelementmethod.SendDataTo;
import xyz.bank.manager.login.action.ManagerAction;
import xyz.manager.addcustomer.action.AddCustomerFlow;

public class ListenerHelper {
	
	WebDriver driver;
	public ClickOnElement clickHelper;
	public ManagerAction managerHelper;
	public ExplicitUtil waithelper;
	public SendDataTo send_data_to;
	public AddCustomerFlow addcustomerhelper;
	
	
	
	public ListenerHelper(WebDriver driver) {
		this.driver = driver;
		clickHelper = new ClickOnElement(driver);
		managerHelper = new ManagerAction(driver);
		waithelper = new ExplicitUtil(driver);
		send_data_to = new SendDataTo(driver);
		addcustomerhelper = new AddCustomerFlow(driver);
		
	}
	
	
	

}
