package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    WebElement fd1 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    fd1.click();
	    Thread.sleep(4000);
	    WebElement fd2 = driver.findElement(By.name("firstname"));
	    fd2.sendKeys("abinaya");
	    WebElement fd3 = driver.findElement(By.name("lastname"));
	    fd3.sendKeys("rajesh");
	    Thread.sleep(1000);
	    WebElement fd4 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	    fd4.sendKeys("7585764593");
	    WebElement fd5 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	    fd5.sendKeys("hghjgjb");
        Select s=new Select(driver.findElement(By.id("day")));
        s.selectByValue("10");
	    Select s1=new Select(driver.findElement(By.id("month")));
	    s1.selectByIndex(7);
	    Select s2=new Select(driver.findElement(By.id("year")));
	    s2.selectByVisibleText("1990");
	   
	    
	}
}
