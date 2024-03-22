package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskTwoCityBank {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		
		driver.findElement(By.linkText("select your product type")).click() ;
		driver.findElement(By.linkText("Credit Card")).click() ;
		
		driver.findElement(By.id("citiCard1")).sendKeys("4545");
		driver.findElement(By.id("citiCard2")).sendKeys("5656");
		driver.findElement(By.id("citiCard3")).sendKeys("8887");
		driver.findElement(By.id("citiCard4")).sendKeys("9998");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");	
		
		driver.findElement(By.name("DOB")).click();
		
		Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByVisibleText("2022");
		
		Select month=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByVisibleText("Apr");
		
		driver.findElement(By.partialLinkText("14")).click();
		
		driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
		
		String validationMessage=driver.findElement(By.xpath("//li[text()='• Please accept Terms and Conditions ']")).getText();
		System.out.println(validationMessage);
		
	}

}
