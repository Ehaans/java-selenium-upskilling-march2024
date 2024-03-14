package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5FBSignUp {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Jhon");	
		driver.findElement(By.name("lastname")).sendKeys("Joseph");	
		driver.findElement(By.id("password_step_input")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		Select selectDay=new Select(driver.findElement(By.id("day"))); 
		selectDay.selectByVisibleText("14");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Apr");
		
		Select selectYear=new Select(driver.findElement(By.id("year")));
				selectYear.selectByVisibleText("1970");

		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
				
				

	}

}
