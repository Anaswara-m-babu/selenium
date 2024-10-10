package com.qa.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.baseclass.Baseclass;
import com.qa.page.Saucedemologin;

import excelutilities.Utilexcelsheet;

public class saucedemotest  extends Baseclass {
@Test
public void logintest() throws IOException, InterruptedException {
	Saucedemologin obj=new Saucedemologin(driver);
	String xcel="C:\\automation\\selenium\\loginsheet1.xlsx";
	String sheet="Sheet1";
	int rowCount=Utilexcelsheet.getRowCount(xcel, sheet);
	System.out.println(rowCount);
	for(int i=1;i<=rowCount;i++) {
		String userName=Utilexcelsheet.getCellValue(xcel, sheet, i, 0);
		System.out.println("username="+userName);
		String pasword=Utilexcelsheet.getCellValue(xcel, sheet, i, 1);
		System.out.println("password="+pasword);
		obj.setvalues(userName,pasword);
		Thread.sleep(2000);
		obj.loginButton();
		Thread.sleep(2000);
		String actual_url=obj.titleverify();
		String expected_url="https://www.saucedemo.com/inventory.html";
		System.out.println("actual_title="+actual_url);
		if(actual_url.equals(expected_url)) {
			System.out.println("login successfull");
			Thread.sleep(2000);
			obj.addtocart();
			obj.addcart();
			obj.check_out();
			Thread.sleep(2000);
			obj.inform();
			obj.contiue();
			Thread.sleep(2000);
			obj.log_out();
			
		}else{
			driver.get("https://www.saucedemo.com/");
			
		}
		
	}
}
}


