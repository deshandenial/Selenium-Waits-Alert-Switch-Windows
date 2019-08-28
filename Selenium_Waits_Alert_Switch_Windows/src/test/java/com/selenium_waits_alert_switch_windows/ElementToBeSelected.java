package com.selenium_waits_alert_switch_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementToBeSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement element=driver.findElement(By.xpath("//select[@id='month']"));
		WebDriverWait wait=new WebDriverWait(driver, 20);
		Select select=new Select(element);
		select.selectByVisibleText("Oct");
		try
		{
			WebElement selected =select.getFirstSelectedOption();
			boolean elementToBeSelected=wait.until(ExpectedConditions.elementToBeSelected(selected));
			System.out.println("ElementToBeSelected results:"+elementToBeSelected);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
