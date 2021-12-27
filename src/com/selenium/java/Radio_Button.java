package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radio_Button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
	     ChromeOptions ch=new ChromeOptions();
	     ch.addArguments("incognito");
	     WebDriver driver=new ChromeDriver(ch);
	     driver.get("http://www.leafground.com/pages/radio.html");
	     driver.manage().window().maximize();
	     WebElement option = driver.findElement(By.xpath("//input[@id='yes']"));
	     option.click();
	     WebElement option1 = driver.findElement(By.xpath("(//input[@value='0'])[2]"));
	     boolean selected = option1.isSelected();
	     WebElement option2 = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
	     boolean selected1 = option1.isSelected();
	     if (selected==true) {
	    	 System.out.println("you are selected unchecked.....");
			
		} else {
			System.out.println("you are selected checked.........");

		}
	     WebElement option3 = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
	     option3.click();
	     WebElement option4= driver.findElement(By.xpath("(//input[@value='2'])"));
	     option4.click();
	     
	}    

}
