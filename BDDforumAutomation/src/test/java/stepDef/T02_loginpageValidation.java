package stepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import Utilities.forumEleLoc;
import Utilities.gridEngine;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.browserEngine;
//import Utilities.browserEngine;
import Utilities.forumConData;

@RunWith(Cucumber.class)
public class T02_loginpageValidation 
{

	public WebDriver driver;
	
	@Given("^Homepage of the Forum web app$")
    public void homepage_of_the_forum_web_app() throws Throwable 
	{
		 System.out.println("T01_Homepage Validation");
    }

    @Then("^Browser is opened$")
    public void browser_is_opened() throws Throwable 
    {
    	driver = browserEngine.getBrowser();
    }

    @Then("^Homepage URL of the forum is loaded$")
    public void homepage_url_of_the_forum_is_loaded() throws Throwable 
    {
    	driver.get(forumConData.homepageURL);
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @Then("^Title of the homepage is validated$")
    public void title_of_the_homepage_is_validated() throws Throwable 
    {
    	String expectedTitle = driver.getTitle();
    	
    	Assert.assertEquals(forumConData.homepageTitle, expectedTitle);
    }

    @Then("^Loginpage URL of the forum is loaded$")
    public void loginpage_url_of_the_forum_is_loaded() throws Throwable 
    {
    			
		driver.findElement(forumEleLoc.homeLoginButtonXpath).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Then("^The Title of the Login page is validated$")
    public void the_title_of_the_login_page_is_validated() throws Throwable 
    {
    	String loginpageATitle=driver.getTitle();
		
		Assert.assertEquals(forumConData.loginpageETitle, loginpageATitle);
    }

    @Then("^Uname sent$")
    public void uname_sent() throws Throwable 
    {
    	driver.findElement(forumEleLoc.unameXpath).sendKeys(forumConData.loginUid);
    }

    @Then("^Psswd sent$")
    public void psswd_sent() throws Throwable 
    {
    	driver.findElement(forumEleLoc.upsswdXpath).sendKeys(forumConData.loginPsswd);
    }

    @Then("^Click on Login Button$")
    public void click_on_login_button() throws Throwable 
    {
    	driver.findElement(forumEleLoc.loginButXpath).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Then("^Validate the Title of the afterlogin page$")
    public void validate_the_title_of_the_afterlogin_page() throws Throwable 
    {
    	String afterloginActualTitle=driver.getTitle();
    	
    	Assert.assertEquals(forumConData.afterloginTitleExpected,afterloginActualTitle);

    }

    @Then("^Click on Logout dropdown$")
    public void click_on_logout_dropdown() throws Throwable 
    {
    	driver.findElement(forumEleLoc.dropdownXpath).click();
    }

    @Then("^Click on Logout button$")
    public void click_on_logout_button() throws Throwable
    {
    	driver.findElement(forumEleLoc.logoutButXpath).click();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @And("^Browser should be closed$")
    public void browser_should_be_closed() throws Throwable 
    {
    	driver.close();
    }

}
