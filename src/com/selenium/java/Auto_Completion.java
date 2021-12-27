package com.selenium.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Auto_Completion {
	//program for auto completion(self learn)
	//learn through learn automation online

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
	     ChromeOptions ch=new ChromeOptions();
	     ch.addArguments("incognito");
	     WebDriver driver=new ChromeDriver(ch);
	     driver.get("http://www.leafground.com/pages/autoComplete.html");
	     driver.manage().window().maximize();
	     WebElement input = driver.findElement(By.id("tags"));
	     input.sendKeys("s");
	     driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
	     List<WebElement> options = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
	     for (WebElement webElement : options) {
	    	 if (webElement.getText().equals("SOAP")) {
		    	 webElement.click();
		    	 break;
			} 
		}
	}

}
