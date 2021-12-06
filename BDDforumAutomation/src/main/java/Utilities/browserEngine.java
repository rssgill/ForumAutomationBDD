package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class browserEngine {
	
public static WebDriver driver;
	
	
	public static WebDriver getBrowser()
		{
			System.out.println("Browser is going to open.");
			
			//driver is opening with Chrome browser
			System.setProperty("webdriver.chrome.driver", "D:\\Class 2021\\Eclipse_Workspace_Maven\\forumAutomation\\Drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			//driver  is opening with Firefox driver
			//System.setProperty("webdriver.gecko.driver", "D:\\Class 2021\\BDDforumAuto\\BDDforumAutomation\\Drivers\\geckodriver.exe");
			
			//driver = new FirefoxDriver();
			
			//maximize the browser
			
			System.out.println("Browser window is going to maximize.");
			
			driver.manage().window().maximize();
				
			driver.manage().deleteAllCookies();
			
			
			return driver;
			
		}

}
