package com.sample.stepDefinition;

import com.sample.services.Users;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UsersStepsDef {

    public Users user = new Users();
    
    @Given("^I query user by \"([^\"]*)\"$")
	public void i_query_user_by(String email) throws Throwable {
	    user.AddValueInParam("email", email);
	}

	@When("^I make a query request by email$")
	public void i_make_a_query_request_by_email() throws Throwable {
	    user.makeRequest();
	}

	@Then("^the response contain:$")
	public void the_response_should_contain(String expectedContent) throws Throwable {
	    user.assertResponseContent(expectedContent);
	}
	
	
	@Given("^I query user$")
	public void i_query_user() throws Throwable {
	}
	
	@When("^I make a user request$")
	public void i_make_a_user_request() throws Throwable {
	    user.makeRequest();
	}
	
	@Then("^the response should contain \"(.+)\"")
	public void the_response_should_contain_Sincere_april_biz(String user_email) throws Throwable {
		user.assertResponseContent(user_email);
	}
	
}
