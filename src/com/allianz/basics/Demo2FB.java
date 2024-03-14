package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualTitle=driver.getTitle();
		System.out.println("Title :" +actualTitle);
		String currentUrl= driver.getCurrentUrl();
		System.out.println("Current Url :" +currentUrl);
		String pageSource=driver.getPageSource();
		System.out.println("Page Source: " +pageSource);
		driver.quit();
		
	}

}
