package com.selenium.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		//sortable is like just drag and drop(allignment)
		driver.get("http://www.leafground.com/pages/sortable.html");
	    List<WebElement> list = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
	    //get the position where u want to move
	    //get the position which element u want to move
	    WebElement from_ele1 = list.get(1);
	    //from postion which element to move
	    //to where to move
	    WebElement to_ele1= list.get(0);
	    //for drag and drop use clickAndHold(target) method and moveTo() method
	    Actions ac=new Actions(driver);
	    ac.clickAndHold(from_ele1);
	    ac.moveToElement(to_ele1);
	    ac.release(to_ele1);
	    ac.build().perform();
//	    driver.manage().timeouts().implicitlyWait(7000,TimeUnit.MILLISECONDS);
//	    driver.close();
	}

}
