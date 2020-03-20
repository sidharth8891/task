package com.task.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class TaskPage {

	WebDriver driver;
	WebDriverWait wait;

	public TaskPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 60);

	}
	
	
	
	@FindBy(xpath="//p[@id='greetings']")
	public WebElement welcomeMessage;
	
	@FindBy(xpath="//a[@ng-click='createEmployee()']")
	public WebElement create;
	
	@FindBy(xpath="//a[@id='bEdit']")
	public WebElement edit;
	
	@FindBy(xpath="//a[@id='bDelete']")
	public WebElement delete;
	
	@FindBy(xpath="//input[@ng-model=\"selectedEmployee.firstName\"]")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@ng-model=\"selectedEmployee.email\"]")
	public WebElement email;
	
	@FindBy(xpath="//input[@ng-model=\"selectedEmployee.lastName\"]")
	public WebElement lastname;
	
	@FindBy(xpath="//input[@ng-model=\"selectedEmployee.startDate\"]")
	public WebElement startdate;
	
	@FindBy(xpath="//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//img[@class='s-image']")
	public WebElement firstSearchResult;
	
	@FindBy(xpath="//button[@class='main-button']")
	public WebElement add;
	
	@FindBy(xpath="//li[contains(text(),'test user01')]")
	public WebElement selectuser;
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continueButton;
	
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement signInButton;
	
	@FindBy(css="")
	public WebElement textboxPhWork;
	
	@FindBy(xpath="//div[@class='style__emailAddressContainer__3IjaN']//div[@class='style__leftContainer__2emtq form-group']//input[@id='exampleForm.ControlInput1']")
	public WebElement textboxWorkEmail;

	@FindBy(css="")
	public WebElement textboxOtherEmail;
	
	@FindBy(css="")
	public WebElement textboxCity;
	
	@FindBy(css="")
	public WebElement textboxState;
	
	@FindBy(css=".style__submitButton__3LcPR>span")
	public WebElement textboxCountry;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	public WebElement buttonSave;
	
	@FindBy(xpath="//div[@style='touch-action: none; transform: translate(0px, 0px);']")
	public WebElement chatBotFrom;
	
	@FindBy(xpath="//div[8]//div[16]")
	public WebElement chatBotTo;
	
	@FindBy(xpath="//img[@class='style__commonError__2-Zq7']")
	public WebElement warningSign;
	
	
	

	public void waitForPageToLoad() {

		try {
			//wait.until(ExpectedConditions.visibilityOf(searchButton));
			Reporter.log("Add Private Contact Form is displayed");

			}catch(Exception e) {
				Reporter.log("Add Private Contact Form is not loaded");
			}
	}
	
	public void selectModelPrice() throws InterruptedException {
		TaskPage callPage = new TaskPage(driver);
		//callPage.maxPrice.sendKeys("149");//Should return the products whose price is less than $150
		Thread.sleep(3000);
		//callPage.goPriceRange.click();
		Thread.sleep(3000);
		//callPage.modelYear2017.click();//whose Model Year is 2017 
		Thread.sleep(4000);
	}
}
