package Utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridEngine 
{
	
	public static WebDriver drvier;

	
	public static RemoteWebDriver browserSetup() throws MalformedURLException
	{
	
	
	String hubURL ="http://10.0.0.145:4444/wd/hub";
	DesiredCapabilities cap = DesiredCapabilities.chrome();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	RemoteWebDriver driver = new RemoteWebDriver(new URL(hubURL),cap);
	
	/*DesiredCapabilities capFire = DesiredCapabilities.firefox();
	capFire.setBrowserName("firefox");
	capFire.setPlatform(Platform.WINDOWS);
	RemoteWebDriver driver = new RemoteWebDriver(new URL(hubURL), capFire);*/
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	return driver;
	}
	


}
