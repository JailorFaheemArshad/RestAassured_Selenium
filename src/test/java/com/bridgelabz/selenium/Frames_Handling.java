package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Frames_Handling {
		@Test
		public void frames_usingIndex () throws InterruptedException{
			System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\dc\\\\Downloads\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("C:\\selenium\\page2.html");
			//using index of the frame - [ int value] [ index of frames starts with zero]
			driver.switchTo().frame(0);
			driver.findElement(By.id("t1")).sendKeys("San");
			driver.switchTo().defaultContent();
			driver.findElement(By.id("t2")).sendKeys("Naw");	
		}
		@Test
		public void frames_usingId () throws InterruptedException{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("C:\\selenium\\page2.html");
			//using id attribute of the frame -string
			driver.switchTo().frame("f1");
			driver.findElement(By.id("t1")).sendKeys("San");
			driver.switchTo().defaultContent();
			driver.findElement(By.id("t2")).sendKeys("Naw");
		}
		
		@Test
		public void frames_usingAddressFrame () throws InterruptedException{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("C:\\selenium\\page2.html");
			//using address of the frame -webelement
			WebElement f = driver.findElement(By.className("c1"));
			driver.switchTo().frame(f);
			driver.findElement(By.id("t1")).sendKeys("San");
			driver.switchTo().defaultContent();
			driver.findElement(By.id("t2")).sendKeys("Naw");
			//driver.close();
		}
		@Test
		public void frames_ThreeTextField() {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("C:\\selenium\\page2.html");
			// frames handling for three text field
			//using ID attribute
			driver.switchTo().frame("f1");
			driver.findElement(By.id("t1")).sendKeys("San");
			driver.switchTo().defaultContent();
			driver.findElement(By.id("t2")).sendKeys("A");
			driver.findElement(By.id("t3")).sendKeys("Naw");

		}
}
