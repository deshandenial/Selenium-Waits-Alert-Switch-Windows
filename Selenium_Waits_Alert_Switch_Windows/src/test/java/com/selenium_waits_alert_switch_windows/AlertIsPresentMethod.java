package com.selenium_waits_alert_switch_windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertIsPresentMethod 
{

	public static void main(String[] args) throws Exception 
	{
		
		
	// 1.alertIsPresent()	- void getText()
		
		/*		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html");
				 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
				WebDriverWait wait = new WebDriverWait(driver, 15);
				try
				{
				
					wait.until(ExpectedConditions.alertIsPresent());
					if(driver.switchTo().alert()!=null)
					{
						Alert alert=driver.switchTo().alert();
						System.out.println(alert.getText());
						
					}
					
					  
					 
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
		*/		
		 
	// 2.alertIsPresent()	-  void accept()		
				
		/*	   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html");
				 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
				WebDriverWait wait = new WebDriverWait(driver, 15);
				try
				{
				
					wait.until(ExpectedConditions.alertIsPresent());
					if(driver.switchTo().alert()!=null)
					{
						Alert alert=driver.switchTo().alert();
						alert.accept();
						
					}
					
					  
					  
				}
				catch(Exception e)
				{
					e.printStackTrace();
				} 
		*/
			
	// 3.alertIsPresent()	-  void dismiss()				
				
				
				
			/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html");
				driver.findElement(By.xpath("//button[contains(text(),'Show Me Confirmation')]")).click();
				WebDriverWait wait=new WebDriverWait(driver, 20);
				try
				{
					wait.until(ExpectedConditions.alertIsPresent());
					if(driver.switchTo().alert()!=null)
					{
						Alert alert=driver.switchTo().alert();
						alert.dismiss();
						
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			*/
		
	// 4.alertIsPresent()	-  void void sendKeys()	
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("https://www.engprod-charter.net");
		
		
		
		
	
		try
		{
			wait.until(ExpectedConditions.alertIsPresent());
			if(driver.switchTo().alert()!=null)
			{
				Alert alert=driver.switchTo().alert();
				Thread.sleep(1000);
				
				 
				alert.sendKeys("deshannnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
				Thread.sleep(1000);
				//alert.accept();
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
  // // 4.alertIsPresent()	-  void void Window popup		
				
	}

}
