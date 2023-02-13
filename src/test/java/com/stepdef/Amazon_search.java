package com.stepdef;

import com.baseclass.ReusableMethod;
import com.helper.AmazonPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_search extends ReusableMethod {
	static AmazonPOM ap = new AmazonPOM(driver);
	
	@Given("User finds the searchbar and Clear")
	public void user_finds_the_searchbar_and_clear() {
		ap.getAh().getSearchbar().clear();
		System.out.println("Search data cleared and ready for input");
	}

	@When("User gives input to the Searchbar")
	public void user_gives_input_to_the_searchbar() {
		ap.getAh().getSearchbar().sendKeys("iphone");
		System.out.println("input data given");
	}

	@Then("User clicks the search_icon")
	public void user_clicks_the_search_icon() {
		ap.getAh().getSearchsubmitbtn().click();
		System.out.println("Search Success");
	}
}
