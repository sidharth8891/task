package com.task.automation.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.task.automation.core.BaseTestCase;
import com.task.automation.pages.SignInPage;
import com.task.automation.pages.TaskPage;
import com.task.automation.util.ExtentReport;
import com.task.automation.util.JsonUtil;
import com.task.automation.util.RobotUtility;
import com.task.automation.util.ScreenshotUtility;

public class SignIn extends BaseTestCase {
	
	@Test(description = "Verify Login with valid credentials",priority=3)
	public void TC_validateLogin() throws Exception 
	{
		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateLogin",
				"Verify Login with valid credentials");
	
			SignInPage signInPage = new SignInPage(driver);
		
		signInPage.signIn();
		//TaskPage taskpage = new TaskPage(driver);
		signInPage.username.sendKeys(SignInPage.getTestData("username"));
		signInPage.password.sendKeys(SignInPage.getTestData("password"));
		signInPage.submit.click();
		Thread.sleep(3000);
		Assert.assertEquals(signInPage.logout.isDisplayed(), true);
	}
	
	@Test(description = "Verify Login error message with invalid username",priority=2)
	public void TC_validateInvalidUsernameErrMsg() throws Exception 
	{
		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateInvalidUsernameErrMsg",
				"Verify Login error message with invalid username");
	
			SignInPage signInPage = new SignInPage(driver);
		
		signInPage.signIn();
		
		//TaskPage taskpage = new TaskPage(driver);
		signInPage.username.sendKeys(SignInPage.getTestData("invalidusername"));
		signInPage.password.sendKeys(SignInPage.getTestData("password"));
		signInPage.submit.click();
		Thread.sleep(3000);
		Assert.assertEquals(signInPage.errorMessage.isDisplayed(), true);
	}
	
	@Test(description = "Verify Login error message with invalid password",priority=1)
	public void TC_validateInvalidPasswordErrMsg() throws Exception 
	{
		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateInvalidPasswordErrMsg",
				"Verify Login error message with invalid password");
	
			SignInPage signInPage = new SignInPage(driver);
		
		signInPage.signIn();
		//TaskPage taskpage = new TaskPage(driver);
		signInPage.username.sendKeys(SignInPage.getTestData("username"));
		signInPage.password.sendKeys(SignInPage.getTestData("invalidpassword"));
		signInPage.submit.click();
		Thread.sleep(3000);
		Assert.assertEquals(signInPage.errorMessage.isDisplayed(), true);
	}


	

}
