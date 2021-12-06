package stepDef;

import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Utilities.browserEngine;
//import Utilities.browserEngine;
import Utilities.forumConData;
import Utilities.gridEngine;

@RunWith(Cucumber.class)
public class T01_homepageValidation 
{
	
	public static WebDriver driver;
	
	@Given("^Home page of the Forum web app$")
    public void home_page_of_the_forum_web_app() throws Throwable 
	{
       System.out.println("T01_Homepage Validation");
    }

    @Then("^The Browser is opened$")
    public void the_browser_is_opened() throws Throwable 
    {
    	driver = browserEngine.getBrowser();
    
    }

    @Then("^Home page URL of the forum is loaded$")
    public void home_page_url_of_the_forum_is_loaded() throws Throwable 
    {
        driver.get(forumConData.homepageURL);
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Then("^Title of the home page is validated$")
    public void title_of_the_home_page_is_validated() throws Throwable 
    {
    	String expectedTitle = driver.getTitle();
    	
    	Assert.assertEquals(forumConData.homepageTitle, expectedTitle);
    }

    @Then("^browser of the Home page is closed$")
    public void browser_of_the_home_page_is_closed() throws Throwable 
    {
    	System.out.println("Browser is closing.");
		
		driver.close();
    }

}
