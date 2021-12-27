package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		Thread.sleep(3000);
		WebElement singleframe = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(singleframe);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
	    driver.switchTo().defaultContent();
		WebElement outterframe = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(outterframe);
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/section[1]/div[3]/iframe[1]"));
		driver.switchTo().frame(frame3);
		WebElement inner = driver.findElement(By.xpath("/html[1]/body[1]/iframe[1]"));
		driver.switchTo().frame(inner);
		boolean contains = driver.getPageSource().contains("Find total number of frames.");
		System.out.println("the content are there:"+contains);
	}

}
