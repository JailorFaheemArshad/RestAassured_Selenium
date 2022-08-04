package com.bridgelabz.selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Brower_Launching_Based_on_User_Input {
	@Test
//	@SuppressWarnings("null")
	public void launching_Multiple_Browser() throws InterruptedException {
		Scanner bc = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String Browser = bc.nextLine();
		System.out.println("user has enter browser name..."+Browser);
		WebDriver driver = null;
		if(Browser.equals("Chrome")) {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
			 WebDriver driver1 = new ChromeDriver();
			    driver1.get("https://www.facebook.com/");
		        Thread.sleep(2000);
		        driver1.manage().window().maximize();
		        Thread.sleep(2000);
		        driver1.findElement(By.name("email")).sendKeys("Faheem");
		        Thread.sleep(2000);

		        driver1.findElement(By.id("pass")).sendKeys("123");
		        Thread.sleep(2000);
		        driver1.findElement(By.name("login")).click();
		        Thread.sleep(2000);
			 
		}
		else
			if(Browser.equals("Firefox")) {
				
				System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				 WebDriver driver1 = new FirefoxDriver();
				 driver1.get("https://www.facebook.com/");
			        Thread.sleep(2000);
			        driver1.manage().window().maximize();
			        Thread.sleep(2000);
			        driver1.findElement(By.name("email")).sendKeys("Faheem");
			        Thread.sleep(2000);

			        driver1.findElement(By.id("pass")).sendKeys("7869");
			        Thread.sleep(2000);
			        driver1.findElement(By.name("login")).click();
			        Thread.sleep(2000);
			}
			else if(Browser.equals("Edge")) {
				  System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			        WebDriver driver1 = new EdgeDriver();
			        driver1.get("https://www.facebook.com/");
			        Thread.sleep(2000);
			        driver1.manage().window().maximize();
			        Thread.sleep(2000);
			        driver1.findElement(By.name("email")).sendKeys("Faheem");
			        Thread.sleep(2000);

			        driver1.findElement(By.id("pass")).sendKeys("7869");
			        Thread.sleep(2000);
			        driver1.findElement(By.name("login")).click();
			        Thread.sleep(2000);
			}
			else if(Browser.equals("IE")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		        WebDriver driver1 = new InternetExplorerDriver();
		        driver1.get("https://www.facebook.com/");
		        Thread.sleep(2000);
		        driver1.manage().window().maximize();
		        Thread.sleep(2000);
		        driver1.findElement(By.name("email")).sendKeys("Faheem");
		        Thread.sleep(2000);

		        driver1.findElement(By.id("pass")).sendKeys("7869");
		        Thread.sleep(2000);
		        driver1.findElement(By.name("login")).click();
		        Thread.sleep(2000);
				
			}
		
			else {
				System.out.println("Invalid Browser");
			}
		Thread.sleep(4000);
		
	}
	
	
	
	
   

}
