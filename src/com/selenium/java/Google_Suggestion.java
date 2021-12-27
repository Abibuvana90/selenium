package com.selenium.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("w3schools");
		Thread.sleep(6000);
		List<WebElement> sugestion = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement allsug: sugestion) {
			String text = allsug.getText();
			System.out.println(text);
			//selection based on text in the suggestion
			if(text.contains("sql"))
			{
				allsug.click();
				break;
			}
			}
			//select the suggestion by position
//		    int position=0;(out side the loop)
//			position++; (inside the loop)
//			if(position==3)
//			{
//				allsug.click();
//				break;
//			}
		
	}

}
