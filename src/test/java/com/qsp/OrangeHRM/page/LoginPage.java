package com.qsp.OrangeHRM.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage 
{
	public WebDriver driver;
	@FindBy(id="txtUsername")
	private WebElement untbox;
	@FindBy(id="txtPassword")
	private WebElement pwdtbox;
	@FindBy(id="btnLogin")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUn(String Un)
	{
		untbox.sendKeys(Un);
	}
	public void setPwd(String Pwd)
	{
		pwdtbox.sendKeys(Pwd);
	}
	public void clickLogin()
	{
		loginbtn.click();
	}
	public void verifyTitle(String Title)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(Title));
		Reporter.log("Title is matching", true);
	}
}