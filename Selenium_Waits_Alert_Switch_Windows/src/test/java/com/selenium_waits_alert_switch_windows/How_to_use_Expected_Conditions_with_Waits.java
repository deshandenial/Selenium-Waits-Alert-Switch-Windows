package com.selenium_waits_alert_switch_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class How_to_use_Expected_Conditions_with_Waits 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	/*	The following are the Expected Conditions that can be used in Explicit Wait

		1.alertIsPresent()
		2.elementSelectionStateToBe()
		3.elementToBeClickable()
		4.elementToBeSelected()
		5.frameToBeAvaliableAndSwitchToIt()
		6.invisibilityOfTheElementLocated()
		7.invisibilityOfElementWithText()
		8.presenceOfAllElementsLocatedBy()
		9.presenceOfElementLocated()
		10.textToBePresentInElement()
		11.textToBePresentInElementLocated()
		12.textToBePresentInElementValue()
		13.titleIs()
		14.titleContains()
		15.visibilityOf()
		16.visibilityOfAllElements()
		17.visibilityOfAllElementsLocatedBy()
		18.visibilityOfElementLocated()
		*/
		
  // 1.alertIsPresent()	- print alert Text	
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
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
			
			  
			  /*
			   * if(webDriver.switchTo().alert() != null){
           Alert alert = webDriver.switchTo().alert();
           alert.getText();
			   */
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		  
		 
	// 2.elementSelectionStateToBe()	
		
	}

}
