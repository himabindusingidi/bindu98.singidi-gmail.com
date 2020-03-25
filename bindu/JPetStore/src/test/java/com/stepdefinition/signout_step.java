package com.stepdefinition;

import com.pages.signout_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signout_step 
{
	signout_page g = new signout_page();
			
	@Given("^the user has launched the chromebrowser$")
	public void the_user_has_launched_the_chromebrowser() 
	{
	    g.url();
	}

	@When("^the user opens the JPetStore website$")
	public void the_user_opens_the_JPetStore_website() 
	{
	    g.loginpage();
	}

	@Then("^user clicking on login button$")
	public void user_clicking_on_login_button() 
	{
	   g.logindetails();
	}

	@Then("^the user enterS the username and password clicks on login button$")
	public void the_user_enterS_the_username_and_password_clicks_on_login_button() 
	{
	    g.submit();
	}

	@Then("^after login sign out from the apllication$")
	public void after_login_sign_out_from_the_apllication() 
	{
	   g.signout();
	}
}
