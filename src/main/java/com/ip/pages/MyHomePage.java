package com.ip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyHomePage {

public WebDriver driver;
By myHomePage=By.xpath("/html/body/div/div[1]");

public MyHomePage(WebDriver driver)
{
	this.driver=driver;
}

public WebElement getMyHomePage()
{
	return driver.findElement(myHomePage);
}
}
