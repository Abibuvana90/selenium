package com.selenium.java;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrwsrLanchTest1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\IEDriverServer.exe");
    WebDriver driver=new InternetExplorerDriver();
    driver.get("https://www.redbus.com/");
    driver.manage().window().fullscreen();
    String title = driver.getTitle();
    System.out.println(title);
    String curl = driver.getCurrentUrl();
    System.out.println(curl);
    driver.navigate().to("https://www.facebook.com/");
	}

}
