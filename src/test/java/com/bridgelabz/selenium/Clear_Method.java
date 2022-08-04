package com.bridgelabz.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear_Method {


@Test
	public void clearField() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Faheem Jailor"); 
		Thread.sleep(2000); 
	 
	    String value = driver.findElement(By.id("username")).getAttribute("value"); 
	    System.out.println("Value present inside the text box is : "+value); 
	    driver.findElement(By.id("username")).clear(); 
	    Thread.sleep(2000); 
	    driver.findElement(By.id("username")).sendKeys("aheem Jailor"); 
	    Thread.sleep(2000); 
	    driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE); 
	    Thread.sleep(2000); 
	}
		// TODO Auto-generated constructor stub
	

	}

