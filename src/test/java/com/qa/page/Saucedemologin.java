package com.qa.page;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemologin {
WebDriver driver;
@FindBy(name="user-name")
WebElement user;
@FindBy(name="password")
WebElement pswd;
@FindBy(name="login-button")
WebElement loginbtn;
@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
WebElement cart;
@FindBy(name="checkout")
WebElement check;
@FindBy(name="firstName")
WebElement firstname;
@FindBy(name="lastName")
WebElement lastname;
@FindBy(name="postalCode")
WebElement postname;
@FindBy(name="continue")
WebElement cont;
@FindBy(id="react-burger-menu-btn")
WebElement menu;
@FindBy(xpath="//a[contains(text(),'Logout')]")
WebElement logout;
public Saucedemologin(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	public void setvalues(String username,String password) {
	user.sendKeys(username);
	pswd.sendKeys(password);
}
public void loginButton() {
	loginbtn.click();
}
public String titleverify() {
	 return driver.getCurrentUrl();
}
public void addtocart() {
	List<WebElement>addto=driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
	for(WebElement cart:addto) {
		cart.click();
	}
}
	public void addcart() {
		cart.click();
	}
	public void check_out() {
		check.click();
	}
	public void inform() {
		firstname.sendKeys("allu");
		lastname.sendKeys("krishna");
		postname.sendKeys("324578");
	}
	public void contiue() {
		cont.click();
		
	}
	public void log_out() {
		menu.click();
		logout.click();
	}
}


