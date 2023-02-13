package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	WebDriver driver;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchbar;

	@FindBy(id = "nav-search-submit-button")
	private WebElement searchsubmitbtn;
	
	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchsubmitbtn() {
		return searchsubmitbtn;
	}

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
