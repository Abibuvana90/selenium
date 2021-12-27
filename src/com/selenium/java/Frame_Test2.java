
package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Test2 {

	public static void main(String[] args) {		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("http://demo.automationtesting.in/Frames.html");
     driver.manage().window().maximize();
     driver.switchTo().frame("singleframe");
     WebElement txtb = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
     txtb.sendKeys("mithran");
     driver.switchTo().defaultContent();
     WebElement multib = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
     multib.click();
     WebElement outterframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
     driver.switchTo().frame(outterframe);
     WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
     driver.switchTo().frame(innerframe);
     driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("raj");
     driver.switchTo().parentFrame();
     driver.switchTo().defaultContent();
     driver.findElement(By.xpath("//a[text()='Video']")).click();
     
	}

}
