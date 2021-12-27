package com.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("incognito");
	    WebDriver driver=new ChromeDriver(ch);
	    driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	    driver.manage().window().maximize();
	    WebElement fd1 = driver.findElement(By.xpath("//select[@multiple='true']"));
	    Select s=new Select(fd1);
	    s.selectByVisibleText("Burger");
	    s.selectByIndex(1);
	    s.selectByValue("pizza");
	    List<WebElement> options = s.getOptions();
	    for (WebElement webElement : options) {
	    	String text = webElement.getText();
	    	System.out.println(text);
		}
	    System.out.println("----------------------------------");
	    List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	    for (WebElement webElement : allSelectedOptions) {
	    	String text = webElement.getText();
	    	System.out.println(text);
		}
	    System.out.println("__________________________________________");
	    boolean multiple = s.isMultiple();
	    System.out.println("multiple dropdown or not?   "+multiple);
	    WebElement firstSelectedOption = s.getFirstSelectedOption();
	    String text = firstSelectedOption.getText();
	    System.out.println("first selected option is:   "+text);
	    
	}

}
