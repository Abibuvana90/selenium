package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Java_Script_test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
	     ChromeOptions ch=new ChromeOptions();
	     ch.addArguments("incognito");
	     WebDriver driver=new ChromeDriver(ch);
	     driver.navigate().to("http://www.leafground.com/");
	     driver.manage().window().maximize();
	     WebElement mouseover = driver.findElement(By.xpath("//img[@alt='mouseover']"));
	     JavascriptExecutor jr=(JavascriptExecutor)driver;
	     jr.executeScript("arguments[0].scrollIntoView();",mouseover);
	     Thread.sleep(3000);
	     jr.executeScript("window.scrollBy(0,-1000)");
	     WebElement alterbtn = driver.findElement(By.xpath("//img[@alt='Alert']"));
	     Actions ac=new Actions(driver);
	     ac.click(alterbtn).build().perform();
	     driver.navigate().back();
	     Thread.sleep(4000);
	     jr.executeScript("window.scrollBy(0,3000)");
	     Thread.sleep(3000);
	     jr.executeScript(("window.scrollBy(0,-4000)"));
	     Thread.sleep(2000
	    		 );
	     WebElement logo = driver.findElement(By.xpath("(//img[@alt='logo Testleaf'])[2]"));
	     jr.executeScript("arguments[0].scrollIntoView();",logo);
	}

}
