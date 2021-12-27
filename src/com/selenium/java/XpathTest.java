
package com.selenium.java;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("incognito");
		WebDriver driver=new ChromeDriver(ch);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("abibuvana90@gmail.com");
		WebElement findElement1 = driver.findElement(By.id("pass"));
		findElement1.sendKeys("sbcjdsbckj");
		WebElement findElement3= driver.findElement(By.name("login"));
	    findElement3.click();
	    Thread.sleep(10000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\screenshot\\img1.png");
		FileUtils.copyFile(source, destination);
		driver.navigate().to("https://www.youtube.com/");
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\screenshot\\img2.png");
		FileUtils.copyFile(source1, destination1);
	}

}
