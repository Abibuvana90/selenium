package com.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Test {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
    ChromeOptions ch=new ChromeOptions();
    ch.addArguments("incognito");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.leafground.com/");
    driver.manage().window().maximize();
    WebElement txtb = driver.findElement(By.xpath("(//a)[2]"));
    txtb.click();
    //implicit exception
    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
    //
    WebElement box1 = driver.findElement(By.xpath("//input[@id='email']"));
    box1.sendKeys("roshan");
    //explicit wait
    WebDriverWait wt=new WebDriverWait(driver, 10);
    wt.until(ExpectedConditions.visibilityOf(box1));
    //
    WebElement box2 = driver.findElement(By.xpath("//input[@value='Append ']"));
    box2.sendKeys("harshan");
	}

}
