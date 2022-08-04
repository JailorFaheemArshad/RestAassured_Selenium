package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Launch {
	
	@Test
	public void Launchbrowser() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
//		System.out.println( driver.getTitle());
//		String pageTitle = driver.getTitle();
//		System.out.println("the title of the page is :"+ pageTitle);
//		Thread.sleep(2000);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("the URL of the page is :"+ currentUrl);
//		Thread.sleep(2000);
//		System.out.println( driver.getPageSource());
//		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
//		String pageTitle1 = driver.getTitle();
//		System.out.println("the title of the page is :"+ pageTitle1);
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		driver.close();
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Create New Account")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("firstname")).sendKeys("Faheem");
//		
//		driver.close();
		
		//****ActiTime*************

		Thread.sleep(2000);
		driver.get("C:\\selenium\\ActiTime.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Faheem");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Faheem");	
	
	}

}
