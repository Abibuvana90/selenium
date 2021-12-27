package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebelementTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().fullscreen();
	    driver.get("https://www.facebook.com/");
	    WebElement findElement = driver.findElement(By.id("email"));
	    findElement.sendKeys("aaaaaaaa");
	    WebElement findElement2 = driver.findElement(By.id("pass"));
	    findElement2.sendKeys("fdhgkjfdh");
	    WebElement findElement3 = driver.findElement(By.name("login"));
	    findElement3.click();
	}

}
