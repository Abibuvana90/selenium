package com.selenium.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Proj {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
    ChromeOptions ch=new ChromeOptions();
    ch.addArguments("incognito");
    WebDriver driver=new ChromeDriver(ch);
    driver.navigate().to("https://omayo.blogspot.com/");
    driver.manage().window().maximize();
    WebElement muldrop = driver.findElement(By.id("multiselect1"));
    Select s=new Select(muldrop);
    s.selectByValue("volvox");
    s.selectByIndex(1);
    s.selectByVisibleText("Hyundai");
    List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
    for (WebElement webElement : allSelectedOptions) {
    	String text = webElement.getText();
    	System.out.println("in multo drop down u select:"+text);
	}
    WebElement singledrop = driver.findElement(By.id("drop1"));
    Select s1=new Select(singledrop); 
    s1.selectByIndex(1);
    System.out.println("=================");
    System.out.println("in single drop down u select");
    //text box
    WebElement txt = driver.findElement(By.name("fname"));
    String attribute = txt.getAttribute("value");
    System.out.println("the pre defined text value is:"+attribute );
    String t1 = txt.getText();
    System.out.println("the get textvalue is: "+t1);
    System.out.println("===========================");
    txt.sendKeys("hi this abinaya");
    String attribute1 = txt.getAttribute("value");
    System.out.println("the user defined text value is:"+attribute1 );
    System.out.println("======================");
    WebElement hiddenbutn = driver.findElement(By.id("but1"));
    boolean enabled = hiddenbutn.isEnabled();
    System.out.println("the hidden butn enabled?: "+enabled);
    System.out.println("========================");
    //handling link by linktext
//    WebElement linktxt = driver.findElement(By.linkText("SeleniumTutorial"));
//    linktxt.click();
    //frame
    System.out.println("======================");
    WebElement frame1 = driver.findElement(By.id("iframe2"));
    driver.switchTo().frame(frame1);
    System.out.println("you are inside the frame");
    driver.switchTo().defaultContent();
    //image handling
    System.out.println("===========================");
    System.out.println("we are in image");
    WebElement img = driver.findElement(By.xpath("//*[@id=\"HTML29\"]/div[1]/img"));
    if(img.getAttribute("naturalWidth").equals("0"))
    {
   	 System.out.println("this image is broken image");
    }
    else {
		System.out.println("the image is not broken");
	}
    // search box
    WebElement searchbox = driver.findElement(By.name("q"));
    searchbox.sendKeys("input box");
    WebElement searchbutn = driver.findElement(By.xpath("//input[@title='search']"));
    searchbutn.click();
    // alert box
    WebElement alrtbtn = driver.findElement(By.id("alert1"));
    alrtbtn.click();
    Thread.sleep(2000);
    Alert alert1 = driver.switchTo().alert();
    alert1.accept();
    WebElement alrtbtn2 = driver.findElement(By.id("prompt"));
    alrtbtn2.click();
    //implicitly wait
    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
    Alert alert2 = driver.switchTo().alert();
    alert2.dismiss();
    //mouse action
    WebElement doubleclick = driver.findElement(By.xpath("//button[@class='dropbtn']"));
    JavascriptExecutor jr=(JavascriptExecutor)driver;
    jr.executeScript("arguments[0].scrollIntoView();",doubleclick);
    Thread.sleep(5000);
    Actions ac=new Actions(driver);
    ac.doubleClick(doubleclick).build().perform();
    
	}

}
