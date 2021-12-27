package com.selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
	     ChromeOptions ch=new ChromeOptions();
	     ch.addArguments("incognito");
	     WebDriver driver=new ChromeDriver(ch);
	     driver.get("http://www.greenstech.in/selenium-course-content.html");
	     driver.manage().window().maximize();
	     String paterntwindow = driver.getWindowHandle();
	     WebElement tab1 = driver.findElement(By.xpath("//a[@title='Corporate Training']"));
	     Actions ac=new Actions(driver);
	     ac.contextClick(tab1).build().perform();
	     Robot r=new Robot();
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_DOWN);
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     WebElement tab2 = driver.findElement(By.xpath("//a[@title='All Courses']"));
	     ac.contextClick(tab2).build().perform();
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_DOWN);
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     WebElement tab3 = driver.findElement(By.xpath("(//a[@title='All Branches'])[1]"));
	     ac.contextClick(tab3).build().perform();
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_DOWN);
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     Set<String> childwindows = driver.getWindowHandles();
	     for (String childdetail : childwindows) {
			String title = driver.switchTo().window(childdetail).getTitle();
			System.out.println("windows title is: "+title);
		}
	     String window_title="Best Training Courses offered by Greens Technology | Training Courses in Chennai & Online";
	     for(String childdetail: childwindows) {
	    	if (driver.switchTo().window(childdetail).getTitle().equals( window_title)) {
	    	break;	
			} 
	    	else {
             driver.close();
			}	 
	     }

}
}

