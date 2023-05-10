package org.stepdef;

import org.pagerepo.LoginPageRepo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {

	LoginPageRepo lp = new LoginPageRepo();

	@Given("launch the application")
	public void launch_the_application() {
		Hook.driver.get("https://www.facebook.com/");
	}

	@When("user enter the username as {string} and password as {string}")
	public void user_enter_the_credentials(String username, String password) {
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
	}

	@And("a supporting statement one")
	public void xxxx() {
		System.out.println("AND statement");
	}

	@But("a supporting statement two")
	public void yyyy() {
		System.out.println("BUT statement");
	}

	@When("user enter the credentials")
	public void user_enter_the_credentials() {
		lp.getUsername().sendKeys("usertest01");
		lp.getPassword().sendKeys("pwd");
	}

	@Then("I validate the outcomessss")
	public void i_validate_the_outcomessss() {
		System.out.println("The login test is successful");
	}
	
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("The login test is successful");
	}

}
