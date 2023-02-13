package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	public static WebDriver driver;

	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement signIn;
	
	@FindBy(name = "email")
	private WebElement username;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(id = "ap_password")
	private WebElement passWord;
	
	@FindBy(id = "signInSubmit")
	private WebElement submitBtn;

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public AmazonLoginPage(WebDriver driver) {
		AmazonLoginPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
