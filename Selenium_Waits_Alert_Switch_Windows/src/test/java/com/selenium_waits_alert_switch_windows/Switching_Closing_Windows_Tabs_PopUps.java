package com.selenium_waits_alert_switch_windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Switching_Closing_Windows_Tabs_PopUps
{

	public static void main(String[] args) throws Exception 
	{
	
// Example of Switching to Windows	
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-----disable-notification----");
		WebDriver driver=new ChromeDriver();
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
		
		driver.switchTo().window(mainWindow);*/
		
// Example of Closing to Windows	
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-----disable-notification----");
		WebDriver driver=new ChromeDriver();
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
			 	
		 }*/
		
		 	
	
  // Example of Tab to Windows		 
		 
		 
		   /* System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("-----disable-notification----");
			WebDriver driver=new ChromeDriver();
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
				 		Actions action = new Actions(driver);
				 		//action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
				 		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
				 	}
				 	
			 }
			*/ 
		
		
		
// Example of POPUP to Windows	
			 
			 	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("-----disable-notification----");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://toolsqa.com/automation-practice-switch-windows/");
				
				driver.findElement(By.xpath("//div[@id='cookie-law-info-bar']//a[contains(text(),'ACCEPT')]")).click();
				String mainWindow = driver.getWindowHandle();
				 
				WebElement clickElement = driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]")); 
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
