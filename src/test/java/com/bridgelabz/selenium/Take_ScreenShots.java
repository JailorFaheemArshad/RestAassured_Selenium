package com.bridgelabz.selenium;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Take_ScreenShots {

	@Test
	public void screenShot() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
	
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("Faheem@gmail.com");
			Thread.sleep(2000);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./ScreenShots/"+"facebookpage"+".png");
			FileHandler.copy(srcFile, destFile);
			
		}
}

