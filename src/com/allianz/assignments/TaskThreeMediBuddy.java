package com.allianz.assignments;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThreeMediBuddy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.medibuddy.in/");
		
		driver.switchTo().frame("wiz-iframe");
		
		driver.findElement(By.xpath("//a[@class='wzrkClose']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'I have a Corporate Account')]")).click();

		driver.findElement(By.linkText("Learn More")).click();
		
		driver.findElement(By.linkText("skip")).click();
		
		driver.findElement(By.linkText("Login using Username & Password")).click();
		
		driver.findElement(By.id("username")).sendKeys("jhon");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("password")).sendKeys("john123");
		driver.findElement(By.xpath("//img[@alt='hide-password']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String validationMessage=driver.findElement(By.xpath("//div[text()='Please enter valid username and password']")).getText();
		System.out.println(validationMessage);
		


	}

}
