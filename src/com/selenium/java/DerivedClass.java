package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DerivedClass extends BaseClassExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().fullscreen();
	    driver.get("https://www.facebook.com/");
	    WebElement findElement = driver.findElement(By.id("email"));
	    passValues(findElement,"ghjgjh");
	    WebElement findElement2 = driver.findElement(By.id("pass"));
	    passValues(findElement2,"djnckjds");
	    WebElement findElement3 = driver.findElement(By.name("login"));
	    clickMethod(findElement3);
}

	
}

