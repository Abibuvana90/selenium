package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Check_Box {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		//select any one
		 WebElement java = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		 java.click();
		 //check it is selected or not
		 WebElement selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		 boolean selected2 = selected.isSelected();
		 if (selected2==true) {
			 System.out.println("you are selected selenium");
		}
		 //deselect the selected one
		 WebElement selected3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		 selected3.click();
		 //select all
		 WebElement selected4 = driver.findElement(By.xpath("(//input[@type='checkbox'])[9]"));
		 selected4.click();
		 WebElement selected5 = driver.findElement(By.xpath("(//input[@type='checkbox'])[10]"));
		 selected5.click();
		 WebElement selected6 = driver.findElement(By.xpath("(//input[@type='checkbox'])[11]"));
		 selected6.click();
		 WebElement selected7 = driver.findElement(By.xpath("(//input[@type='checkbox'])[12]"));
		 selected7.click();
		 WebElement selected8 = driver.findElement(By.xpath("(//input[@type='checkbox'])[13]"));
		 selected8.click();
	}

}
