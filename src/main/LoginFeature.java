package main;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginFeature {
	Login login =  new Login();
	LoginBO loginbo = new LoginBO();
	
	@Given("^\"([^\"]*)\" as the user name$")
	public void as_the_user_name(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login.setUserName(username);
	    //throw new PendingException();
	}

	@Given("^\"([^\"]*)\" as the password$")
	public void as_the_password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login.setPassword(password);
	   // throw new PendingException();
	}

	@Given("^click  \"([^\"]*)\"$")
	public void click(String action) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		if ("Submit".equalsIgnoreCase(action)){
			loginbo.validate(login, action);
		}
		
	    throw new PendingException();
	}

	@Then("^System should display the registration successful page$")
	public void system_should_display_the_registration_successful_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
