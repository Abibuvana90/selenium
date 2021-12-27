package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		WebElement input = driver.findElement(By.id("datepicker"));
		input.click();
//		input.sendKeys("12/10/2021");
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		WebElement date = driver.findElement(By.xpath("//a[text()='10']"));
		date.click();
	}

}
