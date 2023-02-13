package com.stepdef;

import com.baseclass.ReusableMethod;
import com.helper.AmazonPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_login extends ReusableMethod {
	static AmazonPOM ap = new AmazonPOM(driver);
	
	@Given("user navigate to login Page")
	public void user_navigate_to_login_page() {
		System.out.println("user navigate to login Page");
		ap.getAl().getSignIn().click();
	}

	@When("enters {string} and enter {string}")
	public void enters_and_enter(String UserName, String PassWord) {
		ap.getAl().getUsername().sendKeys(UserName);
		ap.getAl().getContinueBtn().click();
		ap.getAl().getPassWord().sendKeys(PassWord);
		System.out.println("login in detail passsed ");
	}

	@Then("user clicks login button")
	public void user_clicks_login_button() {
		ap.getAl().getSubmitBtn().click();
		System.out.println("Login success");
	}

	
}