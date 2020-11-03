package org.step;

import java.net.MalformedURLException;

import org.base.BaseClass;
import org.pom.PageObjectModel;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass{


@Given("Mirrorfly app is launched")
public void mirrorfly_app_is_launched() throws MalformedURLException {
	get();
    throw new cucumber.api.PendingException();
}

@When("User clicks on Terms of services")
public void user_clicks_on_Terms_of_services() {
	PageObjectModel pom=new PageObjectModel();
	click(pom.getClick());
    throw new cucumber.api.PendingException();
}

@Then("User {string} screen should be displayed")
public void user_screen_should_be_displayed(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}



}
 