package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login {
	public class Facebook_Login {

		@Test
		public void login() throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			 WebDriver driver = new FirefoxDriver();
			  Thread.sleep(4000);
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.findElement(By.name("email")).sendKeys("faheem");
		    Thread.sleep(2000);
		    driver.findElement(By.id("pass")).sendKeys("123");
		    Thread.sleep(2000);
		    driver.findElement(By.name("login")).click();
		    Thread.sleep(2000);

}
	}
}
