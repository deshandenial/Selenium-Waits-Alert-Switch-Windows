package com.selenium_waits_alert_switch_windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ways_to_handle_Simple_Confirmation_Prompt_Alert 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Testing a web page requires a specific set of rules to be followed but, when you tend to miss it, the system will end up throwing an alert. Dealing with these alerts while testing an application is too tedious. Through the medium of this blog on how to handle alerts in Selenium, I will help you understand all about alerts and pop-ups in Selenium.

		//I will be covering the below topics in this article:

		/*1.What is an Alert?
		2.Why is an Alert used in Selenium?
		3.Types of Alerts in Selenium
		4.How to handle Alerts in Selenium Webdriver?
		5.How to handle popup window in Selenium Webdriver?
		6.Application areas of Alerts
		*/
		
		//So, let’s get started.

	//1.What is an Alert?
				
		//When you test a web application using Selenium and try logging in to a website but, fail to add in the mandatory fields like mail ID or the password, the system throws an alert.
		
	//2.Why is an Alert used in Selenium?
		
		/*Alert is basically used to display a warning message.
		It is a pop-up window that comes up on the screen. 
		There are many user actions that can result in an alert on the screen.
		For example, if you click on a button that displays a message or maybe when you entered a form, HTML page asked you for some extra information. This is an alert.
		Alerts are the unhandled window when you navigate for the first time to a webpage.
		*/
		
	//3.Types of Alerts in Selenium
		
		/*There are mainly 3 types of Alerts, namely:

			1.Simple Alert
			2.Prompt Alert
			3.Confirmation Alert
		*/	
		
		//Let me explain them in detail: 

		// 1.Simple Alert: 
			/*A simple alert just has an OK button on them. 
			 * They are mainly used to display some information to the user.
			 * The very first alert on the test page is a simple alert. 
			 * The following code will read the text from the Alert and then accept the alert.
			 */
         //Syntax:
		
        	// Alert simpleAlert = driver.switchTo().alert();
		
	/*	  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  ChromeOptions options=new ChromeOptions();
		  options.addArguments("--disable-notifications");
		  WebDriver driver=new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		  driver.findElement(By.xpath("//div[@id='cookie-law-info-bar']//a[contains(text(),'ACCEPT')]")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
		  WebDriverWait wait = new WebDriverWait(driver, 15);
			try
			{
			
				wait.until(ExpectedConditions.alertIsPresent());
				if(driver.switchTo().alert()!=null)
				{
					Alert alert=driver.switchTo().alert();
					System.out.println(alert.getText());
					alert.accept();
					
				}
			}
			catch (Exception e) 
			{
				
			}
	*/		
		// 2.Prompt Alert: 	
			
			/*In prompt alerts, you get an option to add a text field to the alert box. 
			 *This is specifically used when some input is required from the user
 			 You can use the sendKeys() method to type some text in the Prompt alert box. 
			 */
			
			//syntax:
			
				//promptAlert.sendKeys("Accepting the alert");
			
	/*		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			  ChromeOptions options=new ChromeOptions();
			  options.addArguments("--disable-notifications");
			  WebDriver driver=new ChromeDriver(options);
			  driver.manage().window().maximize();
			  driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
			  driver.findElement(By.xpath("//div[@id='cookie-law-info-bar']//a[contains(text(),'ACCEPT')]")).click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]")).click();
			  WebDriverWait wait=new WebDriverWait(driver, 30);
			  try
			  {
				  wait.until(ExpectedConditions.alertIsPresent());
				  if(driver.switchTo().alert()!=null)
				  {
					  Alert Promtalert=driver.switchTo().alert();
					  String alertText=Promtalert.getText();
					  System.out.println("pop up:"+alertText);
					
					  Thread.sleep(2000);
					  Promtalert.sendKeys("deshan");
					 
					  Thread.sleep(4000);
					  Promtalert.accept();
				  }
			  }
			  catch (Exception e) {
				// TODO: handle exception
			}
	*/		  
			  
			 
	 // 3.Confirmation Alert: 
			  
			//  This type of alert comes with an option to accept or dismiss the alert. 
			// In order to accept the alert, you can use the Alert.accept()and to dismiss, use Alert.dismiss()
			  
			//  syntax:
			//  confirmationAlert.dismiss();
			  
			  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			  ChromeOptions options=new ChromeOptions();
			  options.addArguments("--disable-notifications");
			  WebDriver driver=new ChromeDriver(options);
			  driver.manage().window().maximize();
			  driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
			  driver.findElement(By.xpath("//div[@id='cookie-law-info-bar']//a[contains(text(),'ACCEPT')]")).click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]")).click();
			  WebDriverWait wait = new WebDriverWait(driver, 15);
				try
				{
				
					wait.until(ExpectedConditions.alertIsPresent());
					if(driver.switchTo().alert()!=null)
					{
						Alert alert=driver.switchTo().alert();
						System.out.println(alert.getText());
						alert.dismiss();
						
					}
				}
				catch (Exception e) 
				{
					
				}
		  
	}

}
