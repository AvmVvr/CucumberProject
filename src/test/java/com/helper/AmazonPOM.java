package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.AmazonHomePage;
import com.pom.AmazonLoginPage;
//Singleton Class
public class AmazonPOM {
	WebDriver driver;
	private AmazonHomePage ah;
	private AmazonLoginPage al;
	
	public AmazonHomePage getAh() {
		ah = new AmazonHomePage(driver);
		return ah;
	}
	public AmazonLoginPage getAl() {
		al = new AmazonLoginPage(driver);
		return al;
	}
	
	public AmazonPOM(WebDriver driver){
		this.driver= driver;
	}

}
