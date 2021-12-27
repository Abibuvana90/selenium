package com.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
	     ChromeOptions ch=new ChromeOptions();
	     ch.addArguments("incognito");
	     WebDriver driver=new ChromeDriver(ch);
	     driver.get("http://www.leafground.com/pages/table.html");
	     driver.manage().window().maximize();
	     List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
	     System.out.println("==================get all the data from the table===========");
	     for (WebElement webElement : all_data) {
	    	 String text = webElement.getText();
	    	 System.out.println(text);
		}
	     List<WebElement> onerow = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
	     int size = onerow.size();
	     System.out.println("===========number of rows in this table================"+size);
	     for (WebElement webElement : onerow) {
	    	 String text = webElement.getText();
			System.out.println(text);
		}
	     List<WebElement> onecol = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
	     int size2 = onecol.size();
	     System.out.println("==============number of column in this table============"+size2);
	     for (WebElement webElement : onecol) {
	    	 String text = webElement.getText();
	    	 System.out.println(text);
		}
	     WebElement particulardata = driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]"));
	     String text2 = particulardata.getText();
	     System.out.println("===========particular data from the table is============ "+text2);
	     
	     List<WebElement> table_head = driver.findElements(By.xpath("//table/tbody/tr/th"));
	     System.out.println("===========header of the table is==================");
	     for (WebElement webElement : table_head) {
	    	 String text = webElement.getText();
	    	 System.out.println(text);
		}
	     
	}

}
