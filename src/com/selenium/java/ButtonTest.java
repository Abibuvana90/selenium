package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ButtonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
	     ChromeOptions ch=new ChromeOptions();
	     ch.addArguments("incognito");
	     WebDriver driver=new ChromeDriver(ch);
	     driver.get("http://www.leafground.com/pages/Button.html");
	     driver.manage().window().maximize();
	     //1.get position of the button
	     WebElement position = driver.findElement(By.id("position"));
	     Point xypoint=position.getLocation();
	     int x = xypoint.getX();
	     int y = xypoint.getY();
	     System.out.println("x position is "+x+"y position is "+y);
	     //2.get colour
	     WebElement color = driver.findElement(By.id("color"));
	     String colorbtn = color.getCssValue("background-color");
	     System.out.println("the button color is: "+colorbtn);
	     //3. size of the button
	     WebElement size = driver.findElement(By.id("size"));
	     int height = size.getSize().getHeight();
	     int width = size.getSize().getWidth();
	     System.out.println("button height is:"+height+"button width is"+width);
	     //4.button click
	     WebElement home = driver.findElement(By.id("home"));
	     home.click();
//	     newly used methods is
//	     1.Point----------> class
//	     2.getLocation()------->get the position x and y together
//	     3.getx & gety--------------> separete x and y
//	     4.getsize()------------->it will get height and width together
//	     5.getHeight()
//	     6.getWidth()
	}

}
