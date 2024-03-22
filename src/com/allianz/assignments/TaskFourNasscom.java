package com.allianz.assignments;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskFourNasscom {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://nasscom.in/");
		
		driver.findElement(By.linkText("Login")).click();
				
		//driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//li[text()='register']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-fname-reg-0-value']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='edit-field-lname-0-value']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@id='edit-mail']")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@id='edit-field-company-name-registration-0-value']")).sendKeys("Google");
		
		Select businessFocus=new Select (driver.findElement(By.xpath("//select[@id='edit-field-business-focus-reg']")));
		businessFocus.selectByVisibleText("IT Consulting");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[4]")).click();
	}

}
