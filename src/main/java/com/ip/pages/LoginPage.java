package com.ip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By userEmail=By.xpath("//*[@id=\"user_email\"]");
	By password=By.xpath("//*[@id=\"user_password\"]");
	By loginButton=By.xpath("//*[@id=\"new_user\"]/div[3]/input");
	By forgotPassword=By.xpath("//*[@id=\"new_user\"]/center/a");
	By newUser=By.xpath("/html/body/div/div/div/div/div/div/div[2]/a");

	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getuserEmail()
	{
		return driver.findElement(userEmail);
		
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
		
	}
	public WebElement getloginButton()
	{
		return driver.findElement(loginButton);
		
	}
	public WebElement getforgotPassword()
	{
		return driver.findElement(forgotPassword);
		
	}
	public WebElement getnewUser()
	{
		return driver.findElement(newUser);
		
	}
}
