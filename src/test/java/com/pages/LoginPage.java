package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement login;
	@FindBy(xpath="//b[contains(text(),'Invalid ')]")
	private WebElement loginErrorMsg;

	public WebElement getLoginErrorMsg() {
		return loginErrorMsg;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void login(String UserName, String Password) {
		sendkeys(getUsername(), UserName);
		sendkeys(getPassword(), Password);
		loginClick(getLogin());

	}
	
	public void loginWithEnter(String username,String password) throws AWTException {
		sendkeys(getUsername(), username);
		sendkeys(getPassword(), password);
	    roboEnter();

	
	}
	
	

}
