package com.selenium_waits_alert_switch_windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout_And_SetScriptTimeoutproperty {

	public static void main(String[] args) {
		
		// Timeouts interface manages all the waits of the driver instances
		/*
		 * Timeouts interface has three abstract methods, which are :

		1.implicitlyWait
		2.setScriptTimeout
		3.pageLoadTimeout
		 */
		
		// 1.pageLoadTimeout
		
		/*
		 * Page load timeout in selenium requests/set the time limit for a page to load,
		 *  We can set the amount of time to wait for a page load to complete before throwing an error. 
		 */
		
		//Example :
		
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Explanation:
		
		/*
		 * Once added in the script, the WebDriver instance waits for 20 seconds for every page to get loaded before throwing an exception. 
		 * If the page is not loaded in 20 seconds of time, then it throws TimedOutException at run time.
		 */
	
		
	/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/deshandenial");
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	*/	
		//NOTE: Page load timeout is not applicable when the user clicks a link to open a page.
		//Page load timeout is useful when we perform a performance test, or when we test execution in IE.
		//Page Load timeout is applicable only to driver.get() and driver.navigate().to() methods in selenium
		
		
		
		//2.setScriptTimeout
		
		//We can set the amount of time to wait for an asynchronous script to finish execution before throwing any error.
		// Example :
		//driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
		/*
		 * Once added in the script,
		 * the WebDriver instance waits for 20 seconds for every asynchronous script to get executed on the web page before throwing an exception.
		 */
		
		//What is JavaScriptExecutor?
		
		/*
			JavaScriptExecutor is an Interface that helps to execute JavaScript through Selenium Webdriver. 
			JavaScriptExecutor provides two methods "executescript" & "executeAsyncScript" to run javascript on the selected window or current page.
		*/
		
		//Why do we need JavaScriptExecutor?
		
		/*
		 In Selenium Webdriver, locators like XPath, CSS, etc. are used to identify and perform operations on a web page.
		 In case, these locators do not work you can use JavaScriptExecutor. 
		 You can use JavaScriptExecutor to perform an desired operation on a web element.
		 Selenium supports javaScriptExecutor. There is no need for an extra plugin or add-on. 
		 You just need to import (org.openqa.selenium.JavascriptExecutor) in the script as to use JavaScriptExecutor.
		 */
		
		// JavaScriptExecutor Methods
		
		/*   1.executeAsyncScript
		     2.executeScript
		*/
		
// 1.executeAsyncScript
		
		/*
		 * Execute an asynchronous piece of JavaScript in the context of the currently selected frame or window. 
		 * Unlike executing synchronous JavaScript, scripts executed with this method must explicitly signal they are finished by invoking the provided callback. 
		 * This callback is always injected into the executed function as the last argument.
		 */
		
		 // Example:
		
		 /*
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		  */
		
		//NOTE: Using the executeAsyncScript, helps to improve the performance of your test. 
		//It allows writing test more like a normal coding.
		
	/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.github.com/deshandenial");
		//Creating the JavascriptExecutor interface object by Type casting	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Set the Script Timeout to 20 seconds
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		//Declare and set the start time		
        long start_time = System.currentTimeMillis();
        System.out.println("Start Time:"+start_time);
        //Call executeAsyncScript() method to wait for 5 seconds
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1],5000);");
        //Get the difference (currentTime - startTime)  of times.		
        System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));
    */  
        
 // 	2.executeScript
		
		/*
		 * Executes JavaScript in the context of the currently selected frame or window. 
		 * The script fragment provided will be executed as the body of an anonymous function.
		 */
		
		//Example:
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript(Script,Arguments);
		 */
		
		//NOTE:
		
		/*
		Script – This is the JavaScript that needs to execute.
		Arguments – It is the arguments to the script. It's optional.
        */
    //CODE 1:    
	/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//driver.findElement(By.xpath("")).click();
		WebElement button=driver.findElement(By.xpath("//form[@class='home-hero-signup text-gray-dark js-signup-form']//button[contains(text(),'Sign up for GitHub')]"));
		driver.findElement(By.xpath("//input[@id='user[login]']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@id='user[email]']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id='user[password]']")).sendKeys("abcd@123");
		//driver.findElement(By.xpath("//form[@class='home-hero-signup text-gray-dark js-signup-form']//button[contains(text(),'Sign up for GitHub')]")).click();
		//Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", button);
      */
     //CODE 2:   
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Fetching the Domain Name of the site. Tostring() change object to name.		
        String DomainName = js.executeScript("return document.domain;").toString();			
        System.out.println("Domain name of the site = "+DomainName);					
          		
        //Fetching the URL of the site. Tostring() change object to name		
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);					
          		
       //Method document.title fetch the Title name of the site. Tostring() change object to name		
       String TitleName = js.executeScript("return document.title;").toString();			
       System.out.println("Title of the page = "+TitleName);					

        		
      //Navigate to new Page i.e to generate access page. (launch new url)		
      js.executeScript("window.location = 'https://github.com/'");	
        
	}

}
