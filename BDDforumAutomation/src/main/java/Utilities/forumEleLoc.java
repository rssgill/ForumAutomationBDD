package Utilities;

import org.openqa.selenium.By;

public class forumEleLoc {
	
	
	//T02_loginpageValidation Element Locators.
	public static By homeLoginButtonXpath = By.xpath("//*[@id=\'text-fade\']/div[1]/div/div[3]/div/a[2]");
	
	public static By unameXpath = By.name("email");
	
	public static By upsswdXpath = By.name("password");
	
	public static By loginButXpath = By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button");
	
	public static By dropdownXpath = By.xpath("//*[@id=\'navbar-right\']/li/a/span");
	
	public static By logoutButXpath = By.xpath("//*[@id=\'navbar-right\']/li/ul/li/a");
	
	
	//T02_userRegistion Page Element Locators
	public static By userRegButtonXpath = By.xpath("//*[@id=\'text-fade\']/div[1]/div/div[3]/div/a[3]");
	
	public static By languageXpath = By.xpath("//*[@id=\'home\']/div/div[1]/div[1]/select");
	
	public static By titleXpath = By.xpath("//*[@id=\'home\']/div/div[2]/div[1]/select");
	
	public static By regFnameXpath = By.xpath("//*[@id=\'home\']/div/div[1]/div[2]/input");
	
	public static By regLnameXpath = By.xpath("//*[@id=\'home\']/div/div[2]/div[2]/input");
	
	public static By regEmailXpath = By.xpath("//*[@id=\'home\']/div/div[1]/div[3]/input");
	
	public static By regPsswdXpath = By.xpath("//*[@id=\'home\']/div/div[2]/div[3]/input");
	
	public static By radioButMaleXpath = By.xpath("//*[@id=\'home\']/div/div[1]/div[4]/div/label[2]/input");
	
	public static By phoneXpath = By.xpath("//*[@id=\'home\']/div/div[2]/div[4]/input");
	
	public static By courseXpath = By.xpath("//*[@id=\'home\']/div/div[1]/div[5]/select");
	
	public static By checkBoxXpath = By.xpath("//*[@id=\'home\']/div/div[1]/div[6]/input");
	
	public static By submitButXpath = By.xpath("//*[@id=\'home\']/div/div[2]/input");

}
