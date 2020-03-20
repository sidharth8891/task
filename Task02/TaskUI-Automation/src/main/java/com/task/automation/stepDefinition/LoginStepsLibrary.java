package com.task.automation.stepDefinition;

import com.task.automation.core.BaseTestCase;
import com.task.automation.pages.SignInPage;

import cucumber.api.java.en.Given;

public class LoginStepsLibrary extends BaseTestCase {

	@Given("^user launches application url$")
	public void launchApplication() {
		SignInPage signInPage = new SignInPage(driver);
		signInPage.launchPage();

	}

}
