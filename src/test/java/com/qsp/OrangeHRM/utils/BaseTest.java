package com.qsp.OrangeHRM.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qsp.OrangeHRM.page.LoginPage;

public class BaseTest 
{
	static WebDriver driver;
	static LoginPage lp;
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		lp=new LoginPage(driver);
		lp.setUn("Admin");
		lp.setPwd("admin123");
		lp.clickLogin();
	}
}
