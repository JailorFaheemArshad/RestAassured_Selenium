package com.bridgelabz.selenium;


import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JS_PopUp {
	@Test
	public void simpleAlertPopups() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(200);	
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(200);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	@Test
	public void conformationPopUp() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        driver.manage().window().maximize();
        Thread.sleep(200);	
        driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
        Alert conalert = driver.switchTo().alert();
        String alertText = conalert.getText();
        System.out.println("the test is :"+alertText);
        conalert.accept();
		
	}
	@Test
	public void promptPopUp() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(200);	
        driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
        Alert promtAlert = driver.switchTo().alert();
         promtAlert.sendKeys("Faheem");
         Thread.sleep(200);
         promtAlert.accept();
		
		
	}
	@Test
	public void hiddenpopup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("");
        driver.manage().window().maximize();
        Thread.sleep(200);
		
		
	}
	@Test
	public void fileUpload() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("http://www.spotify.com/");
        driver.manage().window().maximize();
        Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\dc\\Documents\\Faheem.pdf");
	}
	@Test
	public void autoIt_FileUpload() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dc\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        Thread.sleep(200);
        WebElement button= driver.findElement(By.xpath("//input[@id='file-upload']"));
    	Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		Thread.sleep(2000);
        

//   
        Runtime.getRuntime().exec("C:\\Users\\dc\\Desktop\\page1.exe" + " " + "C:\\Users\\dc\\Desktop\\page2.exe");
////        driver.findElement(By.xpath("//span[@class='sc-1rd62mt-2 ejRuwW']")).click();
//        Thread.sleep(2000);
//        driver.close();
	}

}