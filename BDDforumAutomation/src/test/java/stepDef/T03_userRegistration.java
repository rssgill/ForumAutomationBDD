package stepDef;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import Utilities.forumEleLoc;
import Utilities.gridEngine;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import org.testng.AssertJUnit;

import Utilities.browserEngine;
//import Utilities.browserEngine;
import Utilities.forumConData;

@RunWith(Cucumber.class)
public class T03_userRegistration 
{
	public static WebDriver driver;
	
	@Given("^homepage of the forum Webapp$")
    public void homepage_of_the_forum_webapp() throws Throwable 
	{
		System.out.println("T01_Homepage Validation");
    }

    @Then("^browser is open$")
    public void browser_is_open() throws Throwable 
    {
    	driver = browserEngine.getBrowser();
    }

    @Then("^homepage URL for forum is loaded$")
    public void homepage_url_for_forum_is_loaded() throws Throwable 
    {
    	driver.get(forumConData.homepageURL);
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Then("^title of home page validating$")
    public void title_of_home_page_validating() throws Throwable 
    {
    	String expectedTitle = driver.getTitle();
    	
    	Assert.assertEquals(forumConData.homepageTitle, expectedTitle);
    }

    @Then("^User Registration page is loaded$")
    public void user_registration_page_is_loaded() throws Throwable 
    {
    	driver.findElement(forumEleLoc.userRegButtonXpath).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Then("^Title of User Registration page is validated$")
    public void title_of_user_registration_page_is_validated() throws Throwable 
    {
    	String expectedRegistrationTitle = driver.getTitle();
		
		Assert.assertEquals(forumConData.regpageTitle, expectedRegistrationTitle);
    }

    @Then("^choose Language$")
    public void choose_language() throws Throwable 
    {
    	new Select (driver.findElement(forumEleLoc.languageXpath)).selectByVisibleText(forumConData.regLanguage);
    }

    @Then("^Choose Title$")
    public void choose_title() throws Throwable 
    {
    	new Select (driver.findElement(forumEleLoc.titleXpath)).selectByVisibleText(forumConData.regTitle);
    }

    @Then("^Fname sent$")
    public void fname_sent() throws Throwable 
    {
    	driver.findElement(forumEleLoc.regFnameXpath).sendKeys(forumConData.regFname);
    }

    @Then("^Lname sent$")
    public void lname_sent() throws Throwable 
    {
    	driver.findElement(forumEleLoc.regLnameXpath).sendKeys(forumConData.regLname);
    }

    @Then("^Email sent$")
    public void email_sent() throws Throwable 
    {
    	driver.findElement(forumEleLoc.regEmailXpath).sendKeys(forumConData.regEmail);
    }

    @Then("^Pssword sent$")
    public void pssword_sent() throws Throwable 
    {
    	driver.findElement(forumEleLoc.regPsswdXpath).sendKeys(forumConData.regPsswd);
    }

    @Then("^choose Gender$")
    public void choose_gender() throws Throwable 
    {
    	driver.findElement(forumEleLoc.radioButMaleXpath).click();
    }

    @Then("^Phone sent$")
    public void phone_sent() throws Throwable 
    {
    	driver.findElement(forumEleLoc.phoneXpath).sendKeys(forumConData.regPhoneNum);
    }

    @Then("^Choose Course$")
    public void choose_course() throws Throwable 
    {
    	new Select (driver.findElement(forumEleLoc.courseXpath)).selectByVisibleText(forumConData.regCourse);
    }

    @Then("^Click on Confirmed$")
    public void click_on_confirmed() throws Throwable 
    {
    	driver.findElement(forumEleLoc.checkBoxXpath).click();
    }

    @Then("^Click on Submit Button$")
    public void click_on_submit_button() throws Throwable 
    {
    	driver.findElement(forumEleLoc.submitButXpath).click();
    }

    @Then("^title of after SubmitButton page is validated$")
    public void title_of_after_submitbutton_page_is_validated() throws Throwable 
    {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	String expectedAfterRegPageTitle = driver.getTitle();
		
		Assert.assertEquals(forumConData.homepageTitle, expectedAfterRegPageTitle);
    }

    @And("^browser should close UserRegistration page$")
    public void browser_should_close_userregistration_page() throws Throwable 
    {
    	driver.close();
    }
	
	

}
