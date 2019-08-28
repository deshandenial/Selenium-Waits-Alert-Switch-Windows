package com.selenium_waits_alert_switch_windows;

import java.util.concurrent.TimeUnit;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Unit test for simple App.
 */
public class Implicit_and_Explicit_waits 
{
	public static void main(String[] args) 
	{
			// In selenium "Waits" play an important role in executing tests
			/*
			 * Why Do We Need Waits In Selenium?
			Most of the web applications are developed using Ajax and Javascript.
			 When a page is loaded by the browser the elements which we want to interact with may load at different time intervals.

			Not only it makes this difficult to identify the element but also if the element is not located it will throw an "ElementNotVisibleException" exception. 
			Using Waits, we can resolve this problem.

			Let's consider a scenario where we have to use both implicit and explicit waits in our test.
			 Assume that implicit wait time is set to 20 seconds and explicit wait time is set to 10 seconds.

			Suppose we are trying to find an element which has some "ExpectedConditions "(Explicit Wait), If the element is not located within the time frame defined by the Explicit wait(10 Seconds), It will use the time frame defined by implicit wait(20 seconds) before throwing an "ElementNotVisibleException".
		 */
		
		
		/*Selenium Web Driver Waits

		Implicit Wait
		Explicit Wait
		*/
		
/*	Implicit Wait
		Selenium Web Driver has borrowed the idea of implicit waits from Watir.

		The implicit wait will tell to the web driver to wait for certain amount of time before it throws a "No Such Element Exception". The default setting is 0. Once we set the time, web driver will wait for that time before throwing an exception.

		In the below example we have declared an implicit wait with the time frame of 10 seconds. It means that if the element is not located on the web page within that time frame, it will throw an exception.

		To declare implicit wait:

		Syntax: driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		*/
		
/*		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String eTitle = "The world’s leading software development platform · GitHub";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		driver.get("https://github.com/" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		
	/*	
		/*
		 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 * Implicit wait will accept 2 parameters, the first parameter will accept the time as an integer value and the second parameter will accept the time measurement in terms of SECONDS, MINUTES, MILISECOND, MICROSECONDS, NANOSECONDS, DAYS, HOURS, etc.
		 */
		
/*Explicit Wait
	 
		The explicit wait is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or the maximum time exceeded before throwing an "ElementNotVisibleException" exception.

		The explicit wait is an intelligent kind of wait, but it can be applied only for specified elements. 
		Explicit wait gives better options than that of an implicit wait as it will wait for dynamically loaded Ajax elements.	
	 */
		
		/*
		 * In the below example, we are creating reference wait for "WebDriverWait" class and instantiating using "WebDriver" reference, and we are giving a maximum time frame of 20 seconds.
		 */
		
		// Syntax: WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebDriverWait wait=new WebDriverWait(driver, 20);
		String eTitle = "The world’s leading software development platform · GitHub";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		driver.get("https://github.com/");
		//Maximizes the browser window
		driver.manage().window().maximize();
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		WebElement link;
		link= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[@class='HeaderMenu-link no-underline mr-3']")));
		link.click();
		
		/*In the above example, wait for the amount of time defined in the "WebDriverWait" class or the "ExpectedConditions" to occur whichever occurs first.

		The above Java code states that we are waiting for an element for the time frame of 20 seconds as defined in the "WebDriverWait" class on the webpage until the "ExpectedConditions" are met and the condition is "visibilityofElementLocated".
		*/
		
	}
  
}
