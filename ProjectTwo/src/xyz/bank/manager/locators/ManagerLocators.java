package xyz.bank.manager.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface ManagerLocators {
	
	/*
	 *  Scenario: Add customer Flow
	 * 
	 */
	By ADD_CUSTOMER_TAB = By.xpath("//div[@class='center']/child::button[@ng-class='btnClass1']");
	By FIRST_NAME_FLD = By.xpath("//div[@class='form-group']/child::input[@placeholder='First Name']");
	By LAST_NAME = By.xpath("//div[@class='form-group']/child::input[@placeholder='Last Name']");
	By POST_CODE = By.xpath("//div[@class='form-group']/child::input[@placeholder='Post Code']");
	
	
	By ADD_CUSTOMER_BTN = By.xpath("//button[.='Add Customer']");
	
	
	
	
	

}
