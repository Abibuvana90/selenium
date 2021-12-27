package com.selenium.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Google {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		WebElement box = driver.findElement(By.name("q"));
		box.sendKeys("sql query");
		WebElement search = driver.findElement(By.name("btnK"));
		search.click();
		Thread.sleep(5000);
//      List<WebElement> all_link = driver.findElements(By.xpath("//a"));
//      to print all the lins in google page
//		for (WebElement links : all_link) {
//			String attribute = links.getAttribute("href");
//			System.out.println(attribute);
//		}
		List<WebElement> links=
				driver.findElements(By.xpath("//div[@id='search']//following::a//descendant::cite"));// no need to give index to show 1 of 1
		//it will show 1 of 15
		for (WebElement Pagelink : links) {
			System.out.println(Pagelink.getText());
		}
		driver.close();
	}

}
