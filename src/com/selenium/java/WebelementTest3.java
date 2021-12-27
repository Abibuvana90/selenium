package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebelementTest3 {

	public static void main(String[] args) {
    System.setProperty("webdriver.edge.driver", "C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    WebElement findElement = driver.findElement(By.name("q"));
    findElement.sendKeys("selenium wedriver");
    WebElement findElement2 = driver.findElement(By.name("btnK"));
    findElement2.click();
    driver.navigate().to("https://www.facebook.com/");
    WebElement findElement3 = driver.findElement(By.id("email"));
    findElement3.sendKeys("abinaya");
    WebElement findElement4 = driver.findElement(By.id("pass"));
    findElement4.sendKeys("mithranrajesh");
    WebElement findElement5 = driver.findElement(By.name("login"));
    findElement5.click();
    String attribute = findElement5.getAttribute("name");
    System.out.println("findelement5 name is "+attribute);
    String attribute2 = findElement5.getAttribute("value");
    System.out.println("findelement5 value is:"+attribute2);
    
    
//    driver.close();
	}

}
