package com.selenium_waits_alert_switch_windows;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Concept_of_Fluent_Wait_in_Selenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		/*
		 * Explicit waits are confined to a particular web element. 
		 * Explicit Wait is code you define to wait for a certain condition to occur before proceeding further in the code.
		 */
		
		/*
		 * Types of Explicit Waits:

			1.WebDriverWait
			2.FluentWait
		 */
		
		
	//When using the FluentWait instance, we can specify:
		/*
		1.The frequency with which FluentWait has to check the conditions defined.
		2.Ignore specific types of exception waiting such as NoSuchElementExceptions while searching for an element on the page.
		3.The maximum amount of time to wait for a condition
		 * 
		 */
		
		/*
	//When should we use FluentWait?
		/*
		When you try to test the presence of an element that may appear after every x seconds/minutes.
		 */
		
		//CODE:
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("//div[contains(text(),'ABCD | Alphabet Song | ABCD Song | Cartoon Video | ABCD Poem | A ...')]")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(60, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);
		
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				
				WebElement element=driver.findElement(By.xpath("//div[contains(text(),'ABCD | Alphabet Song | ABCD Song | Cartoon Video | ABCD Poem | A ...')]"));
				if(element.isEnabled())
				{
					System.out.println("Element Found");
				}
				return element;
						
			}
		});
		foo.click();
		

			
	}

}
