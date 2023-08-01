package xyz.bank.manager.login.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import xyz.listener.helper.ListenerHelper;

public class ManagerAction {
	WebDriver driver;
	public ListenerHelper helper;
	By ManagerBTN = By.xpath("//button[@ng-click='manager()']");
	
	
	public ManagerAction(WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	public void validateManagerLogin() {
		helper = new ListenerHelper(driver);
		helper.clickHelper.clickElement(ManagerBTN);
	}
	
	
	
	
	


}
