package com.selenium.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
	     ChromeOptions ch=new ChromeOptions();
	     ch.addArguments("incognito");
	     WebDriver driver=new ChromeDriver(ch);
	     driver.get("http://www.leafground.com/pages/selectable.html");
	     driver.manage().window().maximize();
	     //findEleements used to hold multiple value
	     //can use id,name locator but we are going to use xpath because want to add list at last of the path
	     //can't add list(li)at last if we use id,name as a locator
	     List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
	     driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
	     //getting size to know the number of items in list
	     int size = selectable.size();
	     System.out.println("number of items is: "+size);
	     Actions ac=new Actions(driver);
	     //clickAndHold method used to select multiple value at a time
	     ac.clickAndHold(selectable.get(0));
	     ac.clickAndHold(selectable.get(1));
	     ac.clickAndHold(selectable.get(2));
	     ac.clickAndHold(selectable.get(3));
	     ac.clickAndHold(selectable.get(4));
	     ac.clickAndHold(selectable.get(5));
	     ac.build().perform();
	     driver.close();
	     
	}

}
