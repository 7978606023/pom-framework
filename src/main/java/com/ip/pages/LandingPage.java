package com.ip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By signIn = By.xpath("//*[@id=\'homepage\']/header/div[1]/div/nav/ul/li[4]/a/span");
	By textLandingPage=By.xpath("//*[@id=\"content\"]/div/div/h2");
	By navBar=By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav");
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		//To provide the xpath for signin
		return driver.findElement(signIn);
	}

	public WebElement getTextLandingPage()
	{
		//To provide the xpath for signin
		return driver.findElement(textLandingPage);
	}
	
	public WebElement getNavBarLandingPage()
	{
		//To provide the xpath for signin
		return driver.findElement(navBar);
	}
}
