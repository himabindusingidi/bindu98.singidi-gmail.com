package com.stepdefinition;

import com.pages.updatecart_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class updatecart_step 
{
	updatecart_page b = new updatecart_page(null);
	@Given("^Open the url in browser$")
	public void open_the_url_in_browser() 
	{
	   b.url();
	}

	@When("^the url is launched click on search and enter search content in search$")
	public void the_url_is_launched_click_on_search_and_enter_search_content_in_search()
	{
	   b.search();
	}

	@Then("^click on the searchbutton bar$")
	public void click_on_the_searchbutton_bar() 
	{
		b.searchbutton();
	}

	@Then("^click on the product id$")
	public void click_on_the_product_id() 
	{
	   b.productID();
	}

	@Then("^click on the Item ID$")
	public void click_on_the_Item_ID() 
	{
	    b.ItemID();
	}

	@Then("^click on the addtocart$")
	public void click_on_the_addtocart() 
	{
	   b.addtocart();
	}

	@Then("^change the quantity$")
	public void change_the_quantity() 
	{
	    b.quantity();
	}

	@Then("^click on the update cart$")
	public void click_on_the_update_cart() 
	{
	    b.updatecart();
	}
}
