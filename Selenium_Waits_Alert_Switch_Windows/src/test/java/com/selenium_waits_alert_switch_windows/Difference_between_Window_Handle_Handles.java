package com.selenium_waits_alert_switch_windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Difference_between_Window_Handle_Handles 
{

	public static void main(String[] args) throws Exception
	
	{
		// GetWindowHandle Command :- To get the window handle of the current window.

		// String handle= driver.getWindowHandle();
		
		//Return a string of alphanumeric window handle
		
		
		// GetWindowHandles Command :- To get the window handle of all the current windows
		
		// Set<String> handle= driver.getWindowHandles();
		
		// Return a set of window handle
		
		
		
		// 1. Handle Windows in Selenium Webdriver
		
		/*
		 * To uniquely identify an opened browser Selenium WebDriver keeps a map of Opened windows VS Window Handle. 
		 * Window handle is a unique string value that uniquely identifies a Browser window on desktop. 
		 * It is guaranteed that each browser will have a unique window handle.
		 * To get Window handle WebDriver interface provides two methods – getWindowHandle() – getWindowHandles() 
		 */
		
		// getWindowHandle() method return a string value and it returns the Window handle of current focused browser window. 
		
		// getWindowHandles() method returns a set of all Window handles of all the browsers that were opened in the session. 
		//In this case it will return 4 windows handles because we have 4 windows open. 

	//	Way 1:
			/*			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
						ChromeOptions options=new ChromeOptions();
						options.addArguments("----disable-notification----");
						WebDriver driver=new ChromeDriver(options);
						driver.manage().window().maximize();
						driver.get("http://toolsqa.com/automation-practice-switch-windows/");
						
						driver.findElement(By.xpath("//div[@id='cookie-law-info-bar']//a[contains(text(),'ACCEPT')]")).click();
						String parentWindowHandle = driver.getWindowHandle();
						 System.out.println("Parent window's handle -> " + parentWindowHandle);
						WebElement clickElement = driver.findElement(By.id("button1")); 
				
						for(int i = 0; i < 3; i++)
						{
							clickElement.click();
							Thread.sleep(3000);
						}
						
						Set<String> allWindowHandles = driver.getWindowHandles();
				// String lastWindowHandle = "";
						 for(String handle : allWindowHandles)
						 {
						 System.out.println("Window handle - > " + handle);
						 System.out.println("Navigating to google.com");
						 driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
						 driver.get("http://google.com");
				// lastWindowHandle = handle;
						 }
						 
						//Switch to the parent window
						 driver.switchTo().window(parentWindowHandle);
						 
						 //close the parent window
						// driver.close();
						 //at this point there is no focused window, we have to explicitly switch back to some window.
				// driver.switchTo().window(lastWindowHandle);
						
						 //driver.get("http://toolsqa.com");
						  
						 
		  */
// Way 2:
		
					/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
					// System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\geckodriver.exe");
					ChromeOptions options=new ChromeOptions();
					options.addArguments("----disable-notification----");
					WebDriver driver=new ChromeDriver(options);
					driver.manage().window().maximize();
					//driver.get("http://toolsqa.com/automation-practice-switch-windows/");
					driver.get("http://www.naukri.com/");
					 // It will return the parent window name as a String
					 String mainWindow=driver.getWindowHandle();
					 // It returns no. of windows opened by WebDriver and will return Set of Strings
					 Set<String> set =driver.getWindowHandles();
					 // Using Iterator to iterate with in windows
					 Iterator<String> itr= set.iterator();
					 while(itr.hasNext())
					 {
						 String childWindow=itr.next();
						 	// Compare whether the main windows is not equal to child window. If not equal, we will close.
						 	if(!mainWindow.equals(childWindow))
						 	{
						 		driver.switchTo().window(childWindow);
						 		System.out.println(driver.switchTo().window(childWindow).getTitle());
						 		driver.close();
						 	}
					 }
					 // This is to switch to the main window
					 driver.switchTo().window(mainWindow);*/
		
		
// Way 3		

		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("----disable-notification----");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		driver.findElement(By.xpath("//div[@id='cookie-law-info-bar']//a[contains(text(),'ACCEPT')]")).click();
		String mainWindow = driver.getWindowHandle();
		 
		WebElement clickElement = driver.findElement(By.id("button1")); 
		for(int i = 0; i < 3; i++)
		{
			clickElement.click();
			Thread.sleep(3000);
		}

		Set<String> set =driver.getWindowHandles();
		 // Using Iterator to iterate with in windows
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext())
		 {
			 
			 String childWindow=itr.next();
			
			 	// Compare whether the main windows is not equal to child window. If not equal, we will close.
			 	if(!mainWindow.equals(childWindow))
			 	{
			 		driver.switchTo().window(childWindow);
			 		System.out.println(driver.switchTo().window(childWindow).getTitle());
			 		driver.close();
			 	}
		 }
		*/
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("----disable-notification----");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		driver.findElement(By.xpath("//div[@id='cookie-law-info-bar']//a[contains(text(),'ACCEPT')]")).click();
		String mainWindow = driver.getWindowHandle();
		 
		WebElement clickElement = driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")); 
		for(int i = 0; i < 3; i++)
		{
			clickElement.click();
			Thread.sleep(3000);
		}

		Set<String> set =driver.getWindowHandles();
		 // Using Iterator to iterate with in windows
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext())
		 {
			 
			 String childWindow=itr.next();
			
			 	// Compare whether the main windows is not equal to child window. If not equal, we will close.
			 	if(!mainWindow.equals(childWindow))
			 	{
			 		driver.switchTo().window(childWindow);
			 		System.out.println(driver.switchTo().window(childWindow).getTitle());
			 		driver.close();
			 	}
		 }

		
	}

}
