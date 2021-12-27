package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
//		WebElement findElement = driver.findElement(By.xpath("//select[@name='url']"));
//		findElement.click();
		WebElement findElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		findElement.sendKeys("womens kuruthas");		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@type='submit']"));
		findElement2.click();		
	}

}
