package com.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.leafground.com/pages/Dropdown.html");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement findElement = driver.findElement(By.id("dropdown1"));
    Select s=new Select(findElement);
    s.selectByVisibleText("Selenium");
    WebElement findElement2 = driver.findElement(By.name("dropdown2"));
    Select s1=new Select(findElement2);
    s1.selectByIndex(2);
	WebElement findElement3 = driver.findElement(By.id("dropdown3"));
	Select s2=new Select(findElement3);
	s2.selectByValue("0");
	List<WebElement> options = s2.getOptions();
	for (WebElement webElement : options) {
		String text = webElement.getText();
		System.out.println(text);
	}
	// boolean multiple = s.isMultiple();
    // System.out.println(multiple);
	}

}
