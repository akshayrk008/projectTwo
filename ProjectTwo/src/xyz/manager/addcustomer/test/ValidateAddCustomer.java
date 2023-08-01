package xyz.manager.addcustomer.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.browser.operations.BrowserOperation;
import utilities.excelutilitis.ExcelUtilitis;
import xyz.listener.helper.ListenerHelper;

public class ValidateAddCustomer extends BrowserOperation{
	
	ListenerHelper helper;
	String sheet = "AddCustomer";
	String ExcelPath = "D:\\XYZ_BANK_Data.xlsx";
	
	@Test(description = "Verify Add Customer Functionality")
	public void validate_add_customer_functionality() {
		
		helper = new ListenerHelper(driver);
		ExcelUtilitis excel = new ExcelUtilitis(ExcelPath, sheet);
		
		try {
			String FNAME = excel.getCellData(1, 0);
			String LName = excel.getCellData(1, 1);
			String PCode = excel.getCellDataNum(1, 2);
			
			helper.managerHelper.validateManagerLogin();
			helper.addcustomerhelper.add_customer_flow(FNAME, LName, PCode);
			
			String successText = driver.switchTo().alert().getText();
			if(successText.contains("Customer added successfully")) {
				assertTrue(true);
			}
			
			driver.switchTo().alert().accept();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
