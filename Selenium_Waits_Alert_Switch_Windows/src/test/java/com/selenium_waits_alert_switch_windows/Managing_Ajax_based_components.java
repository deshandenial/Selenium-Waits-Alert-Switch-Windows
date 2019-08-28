package com.selenium_waits_alert_switch_windows;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Managing_Ajax_based_components 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
	
	//5 Ways to Test AJAX Calls in Selenium WebDriver	
		
		/*
			AJAX stands for Asynchronous Javascript And XML.
			It is a technique for asynchronously sending a XMLHttpRequest from the web page to the server and sending/retrieving data to be used on the developed web page. 
			The client-side browser communicates with the server via AJAX, which allows an operation to be performed without needing to actually refresh the page. 
			This means an AJAX call has no visible output in page transition, so a user can still work on the page while a request is being preceded.  

 

			// AJAX Challenges When Testing with Selenium WebDriver
 

			1.While AJAX calls improve efficiency and are valuable for users, they are challenging when testing with Selenium WebDriver. In AJAX, the code on the DOM page is generated after an action, without actually changing the page or even the DOM. This makes it very difficult to know the actual time when an AJAX call was completed and hence when a page is updated and with which values.

 			2.As a result, you may be spending a lot of time waiting after the integration of every page, which affects both the reliability and the speed of your system. Miscalculating your timing can also fail your test, if you wait too long.

 

			// Overcoming AJAX Call Challenges in Selenium WebDriver
 

			But there is a solution: by waiting for the elements that will appear in the AJAX generated pages, you will know when the page loaded. Then, you can feel comfortable going forward in the test.

 			In this article we will explore several useful ways to actually handle and deal with these AJAX calls, by using Wait methods.

 			There are several Wait methods you can use to handle AJAX calls. You can add these pieces of code to your own AJAX testing code.
	 */
		
		// 1. Explicit Waits
		 
			/*
			Setting a certain desired condition for the system in the code. Only after this condition occurs, the operation can proceed to the next step. 
			*/
		
			//Sample Code:

			/*  webdriver driver = new firefoxdriver();
				driver.get("http://somedomain/url_that_delays_loading");
				webelement mydynamicelement = (new webdriverwait(driver, 10))
				.until(expectedconditions.presenceofelementlocated(by.id("mydynamicelement")));
			*/
		
		 // CODE:
		
		/*  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  ChromeOptions options=new ChromeOptions();
		  WebDriver driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/test/ajax.html");
		  WebElement element=(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='buttoncheck']")));
		  
		  if(element.isEnabled())
		  {
			  element.click();
		  }
		  */
		
		
		
		// 2. Implicit Waits
		  
		  /*
		   You can also go for Implicit Waits, where you can decide on a certain amount of time you require WebDriver to poll the DOM for. 
		   In this case your WebDriver will keep looking for an element(s), if it had been unavailable immediately. 
		   The default time is set as 0, which can be easily adjusted as you may prefer. 
		   In addition, this set wait time lasts as long as your browser is open, so the time to search for any element on the page will be the same.
		   */
		  
		 // Sample Code:

			 /* webdriver driver = new firefoxdriver();
			  driver.manage().timeouts().implicitlywait(10, timeunit.seconds);
			  driver.get("http://somedomain/url_that_delays_loading");
			  webelement mydynamicelement = driver.findelement(by.id("mydynamicelement"));
			  */
		  /*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  ChromeOptions options=new ChromeOptions();
		  WebDriver driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("http://demo.guru99.com/test/ajax.html");
		  driver.findElement(By.xpath("//input[@id='yes']")).click();
		  driver.findElement(By.xpath("//input[@id='buttoncheck']")).click();
		  */
		  
		  
		// 2. Fluent Waits
		  
		  /*
		   In the previous wait methods, you had to manually set the desired time per unit. 
		   However, there are cases when an element still remains unavailable during this period. 
		   In this case you can use Fluent Waits. These allow you to configure the element polling mechanism.
		   An example of code that is set for 5 second wait and poll of every 100 milliseconds is given below:

			Sample CODE
			
		   */
		  
		  // Sampe CODE
		  
		  		/* fluentwait<by> fluentwait = new fluentwait<by>(by.tagname("textarea"));  \\ define element for which you want to poll
			          fluentwait.pollingevery(300, timeunit.milliseconds); \\ it will ping for every 5 sec
			          fluentwait.withtimeout(1000, timeunit.milliseconds);  \\ max time out
			          fluentwait.until(new predicate<by>() {
			              public boolean apply(by by) {
			                  try {
			                      return browser.findelement(by).isdisplayed();
			                  } catch (nosuchelementexception ex) {
			                      return false;
			                  }
			              }
			          });
			          browser.findelement(by.tagname("textarea")).sendkeys("text to enter");
		  		*/
			/*  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			  ChromeOptions options=new ChromeOptions();
			  WebDriver driver = new ChromeDriver(options);
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  driver.get("http://demo.guru99.com/test/ajax.html");
			  driver.findElement(By.xpath("//input[@id='yes']")).click();
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					    .withTimeout(60, TimeUnit.SECONDS)
					    .pollingEvery(5, TimeUnit.SECONDS)
					    .ignoring(NoSuchElementException.class);
				
				
				WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	
					public WebElement apply(WebDriver driver) {
						
						WebElement element=driver.findElement(By.xpath("//input[@id='buttoncheck']"));
						if(element.isEnabled())
						{
							System.out.println("Element Found");
						}
						return element;
								
					}
				});
				foo.click();
			*/	
		// 4. WebDriverWait
				
			/*
			 Another approach of WebdriverWait (which we used in the Explicit Wait) can also be used. 
			 You can use a combination of ExpectedCondition and WebDriverWait strategies, and write a code which will let the system wait for the set amount of time until an element becomes available. 
			 What will happen is that the system will start checking the condition every second, and once the set criteria is met, it will proceed to following steps.
			 */
				
			// Sample CODE
				/*
				 public void performsomeaction() {
			        ..
			        ..
			        wait<webdriver> wait = new webdriverwait(driver, 20);
			        webelement element = wait.until(visibilityofelementlocated(by.tagname("a")));
			        ..        
			      }

				 */
				
			// 	CODE :
			
			/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/ajax.html");
			Wait<WebDriver> wait = new WebDriverWait(driver, 20);
	        WebElement element = wait.until(visibilityofelementlocated(By.xpath("//input[@id='buttoncheck']")));
	        element.click();
			
		
		     
		
		
		

	}

	private static Function<? super WebDriver, WebElement> visibilityofelementlocated(final By xpath)
	{
		// TODO Auto-generated method stub
		return new ExpectedCondition<WebElement>() 
		{
	          public WebElement apply(WebDriver driver) 
	          {
	            WebElement element = driver.findElement(xpath);
	            return element.isDisplayed() ? element : null;
	          }
	        };
	        
	 
	}
	*/
	
	// 5.Thread.Sleep
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/ajax.html");
	//Thread.sleep(3000, 50);
	Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='yes']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='buttoncheck']")).click();

	}

}
