package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
		WebElement box = driver.findElement(By.name("q"));
		box.sendKeys("sql query");
	}

}
