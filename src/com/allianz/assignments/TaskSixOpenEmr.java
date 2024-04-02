package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskSixOpenEmr {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demo.openemr.io/b/openemr/");
		
		driver.findElement(By.name("authUser")).sendKeys("admin");
		driver.findElement(By.name("clearPass")).sendKeys("pass");
		
		Select language=new Select(driver.findElement(By.xpath("//select[@name='languageChoice']")));
		language.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(), 'Patient')]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'New/Search')]")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
		
		driver.findElement(By.id("form_fname")).sendKeys("Shibin");
		driver.findElement(By.id("form_lname")).sendKeys("Basheer");
		driver.findElement(By.id("form_DOB")).sendKeys("2024-03-25");
		
		Select gender= new Select(driver.findElement(By.id("form_sex")));
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.id("create")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(4);
		
		driver.findElement(By.xpath("//button[contains(text(),'Confirm Create New Patient')]")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
					
		String actualAlertText=driver.switchTo().alert().getText();
		System.out.println(actualAlertText);
		
		driver.switchTo().alert().accept();
		
		//driver.switchTo().defaultContent();
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='bdayreminder']")));		
		driver.findElement(By.xpath("//div[contains(@class,'closeDlgIframe')]")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
		String patientName=driver.findElement(By.xpath("//span[contains(text(),'Medical Record Dashboard - Shibin Basheer')]")).getText();
		System.out.println(patientName);
		
		
		

	}

}
