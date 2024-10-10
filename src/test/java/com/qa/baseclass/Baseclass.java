package com.qa.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
protected WebDriver driver;
@BeforeTest
public void loadurl() {
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
}
}
