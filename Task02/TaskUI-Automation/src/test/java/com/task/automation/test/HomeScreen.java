package com.task.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.task.automation.core.BaseTestCase;
import com.task.automation.pages.SignInPage;
import com.task.automation.pages.TaskPage;
import com.task.automation.util.ExtentReport;

public class HomeScreen  extends BaseTestCase{
	//SignInPage signInPage = new SignInPage(driver);
	
	@Test(description = "Verify welcome message",priority=1)
	public void TC_validateWelcomeMessage() throws Exception 
	{
		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateWelcomeMessage",
				"Verify welcome message");
	
	 SignInPage signInPage = new SignInPage(driver);
		
		//signInPage.signIn();
		signInPage.login();
		TaskPage taskpage = new TaskPage(driver);
		String welcomemsg=taskpage.welcomeMessage.getText();
		Thread.sleep(3000);
		Assert.assertEquals(welcomemsg, "Hello Luke");

}
	
	@Test(description = "Verify create/edit/delete",priority=2)
	public void TC_validateOptions() throws Exception 
	{
		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validateoptions",
				"Verify create/edit/delete");
	
	 SignInPage signInPage = new SignInPage(driver);
		
		//signInPage.signIn();
		signInPage.login();
		TaskPage taskpage = new TaskPage(driver);
		Thread.sleep(3000);
		Assert.assertEquals(taskpage.create.isDisplayed(),true);
		Assert.assertEquals(taskpage.delete.isDisplayed(),true);
		Assert.assertEquals(taskpage.edit.isDisplayed(),true);

}
	
	@Test(description = "Verify createuser",priority=3)
	public void TC_validateCreateUser() throws Exception 
	{
		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validatecreateUser",
				"Verify create user");
	
	 SignInPage signInPage = new SignInPage(driver);
		
		//signInPage.signIn();
		signInPage.login();
		TaskPage taskpage = new TaskPage(driver);
		taskpage.create.click();
		Thread.sleep(3000);
		taskpage.firstname.sendKeys("test");
		taskpage.lastname.sendKeys("user01");
		taskpage.startdate.sendKeys("2020-01-01");
		taskpage.email.sendKeys("testuser@gmail.com");
		taskpage.add.click();
		
	}
	
	@Test(description = "Verify deleteuser",priority=4)
	public void TC_validateDeleteUser() throws Exception 
	{
		ExtentReport.extentlog = ExtentReport.extentreport.startTest("TC_validatedeleteUser",
				"Verify delete user");
	
	 SignInPage signInPage = new SignInPage(driver);
		
		//signInPage.signIn();
		signInPage.login();
		TaskPage taskpage = new TaskPage(driver);
		taskpage.selectuser.click();
		taskpage.delete.click();
		
	}
}
