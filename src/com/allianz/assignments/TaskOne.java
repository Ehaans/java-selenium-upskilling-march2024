package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskOne {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Jhon");
		driver.findElement(By.name("UserLastName")).sendKeys("Wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
				
		Select selectjobTitle=new Select(driver.findElement(By.name("UserTitle")));
		selectjobTitle.selectByVisibleText("IT Manager");
		
		Select selectEmployees=new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmployees.selectByVisibleText("101 - 200 employees");
		
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
		
		Select selectCountry=new Select(driver.findElement(By.name("CompanyCountry")));
	    selectCountry.selectByVisibleText("Austria");
				
	    driver.findElement(By.xpath("//button[text()='start my free trial']")).click();
	    
	    




	}

}
