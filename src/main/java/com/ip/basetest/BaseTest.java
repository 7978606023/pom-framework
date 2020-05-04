package com.ip.basetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//Invoking the browsers as per data.properties file
public class BaseTest {
public WebDriver driver;
public Properties prop;
public TakesScreenshot scrn;
	public WebDriver initializeDriver() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("H:\\My Program\\CollectionFramework\\pom\\src\\main\\java\\com\\ip\\properties\\data.properties");
     prop.load(fis);
     String browserName=prop.getProperty("Browser");
     //System.out.println("browser");
     if(browserName.equals("Chrome"))
     {
  	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
  	   driver=new ChromeDriver();
     }
     else if(browserName.equals("Firefox"))
     {
  	   System.setProperty("webdriver.gecko.driver", "C:\\Java\\WorkSpace\\geckodriver.exe");
  	   driver=new FirefoxDriver();
     }
     else if(browserName.equals("InternetExplorer"))
     {
  	   System.setProperty("webdriver.msedge.driver", "C:\\Java\\WorkSpace\\msedgedriver.exe");
  	   driver=new InternetExplorerDriver();
     }
     
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     return driver;
     
     
	}
	
     public   void getScreenshot(String result) throws IOException
     {
     	//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     	//FileHandler.copy(src,new File("C:\\Java\\WorkSpace\\screenshots\\"+result+"+screenshot.png"));
     	
     	//added FileUtils dependency from apache to POM file
     	
         File srcc= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(srcc,new File("C:\\Java\\WorkSpace\\screenshots\\"+result+"+screenshot.png"));
     }
     
	}
