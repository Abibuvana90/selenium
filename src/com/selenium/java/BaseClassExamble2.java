package com.selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassExamble2 {
	
public static WebDriver driver;
//browser Launch
public static WebDriver browserLaunch(String browser) {
if(browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
}
else {
	System.out.println("you are giving different browser name");
}
//here return is needed for chromedriver otherwise it will return empty driver
// here need to change void as webdriver while giving return type
// because void does not return any value
return driver; 
}


//close
public static void close() {
driver.close();
}

//quit
public static void quit() {
driver.quit();
}

//navigateTo
public static void navigateTo(String url) {
driver.navigate().to(url);
}

//navigateBack()
public static void navigateBack() {
driver.navigate().back();
}

//navigateForward()
public static void navigateForward() {
driver.navigate().forward();
}

//navigateRefresh
public static void navigateRefresh() {
driver.navigate().refresh();	
}

//get
public static void get(String url) {
driver.get(url);
}

//alert
public static void alert(String type) {
Alert alert = driver.switchTo().alert();
if(type.equalsIgnoreCase("simple")) {
alert.accept();	
String text = alert.getText();
System.out.println(text);
}
else if(type.equalsIgnoreCase("confirm")) {
alert.dismiss();
String text = alert.getText();
System.out.println(text);
}
else if(type.equalsIgnoreCase("prompt")) {
String st = null;
alert.sendKeys(st);
alert.accept();
String text = alert.getText();
System.out.println(text);
}
}
//actions 
public static void action(String options) {
Actions ac=new Actions(driver);
if(options.equalsIgnoreCase("click")) {
ac.click();
}
else if(options.equalsIgnoreCase("double click")) {
ac.doubleClick();
}
else if(options.equalsIgnoreCase("right click")) {
ac.contextClick();
}
}

//frames
public static void frames(String str,String s1 ) {
	if(str.equalsIgnoreCase("id")) {
		driver.switchTo().frame(s1);
	}
	if(str.equalsIgnoreCase("index")) {
		driver.switchTo().frame(Integer.parseInt(s1));
	}
}
//default content
public static void frame_def() {
	driver.switchTo().defaultContent();
	}
	
//separate for webelement frame
public static void frame(WebElement ele) {
		driver.switchTo().frame(ele);
	}
public static void sleep(long t1) throws InterruptedException {
	Thread.sleep(t1);
}
public static void maximize() {
	driver.manage().window().maximize();
}

//robot
public static void robot() throws AWTException {
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
}

//windowsHnadling
public static void windowsHnadling(String window_title) {
Set<String> all_windows = driver.getWindowHandles();
for (String allwindows_title : all_windows) {
	if (driver.switchTo().window(allwindows_title).getTitle().equals( window_title)) {
    	break;	
		} 
    	else {
         driver.close();
		}	 
}
}

//dropDown
public static void dropDown(WebElement ele,String str,String s1) {
	 Select s=new Select(ele);
	 if(str.equalsIgnoreCase("by index")) {
	// int i=0;
     s.selectByIndex(Integer.parseInt(s1));
	 }
	 else if (str.equalsIgnoreCase("by value")) {
	 //String a = null;
	 s.selectByValue(s1);
	 }
	 else if (str.equalsIgnoreCase("by visible text")) {
     //String a = null;	
     s.selectByVisibleText(s1);
	 }
	 else if(str.equalsIgnoreCase("deselect by index")) {
     //int i=0;
	 s.deselectByIndex(Integer.parseInt(s1));
	 }
	 else if (str.equalsIgnoreCase("deselect by value")) {
	 //String a = null;
	 s.deselectByValue(s1);
	 }
	 else if (str.equalsIgnoreCase("deselect by visible text")) {
	 String a = null;
	 s.deselectByVisibleText(s1);
	 }
	 else if (str.equalsIgnoreCase("get first selected options")) {
	 s.getFirstSelectedOption();
	 }
	 else if (str.equalsIgnoreCase("is multiple")) {
	 boolean multiple = s.isMultiple(); 
	 System.out.println(multiple);
	 }
	 else if(str.equalsIgnoreCase("get options")) {
	 List<WebElement> options = s.getOptions();
	 for (WebElement alloptions : options) {
	 String text = alloptions.getText();
	 System.out.println(text);
	 }
	 }
	 else if(str.equalsIgnoreCase("get all selected options")) {
	 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	 for (WebElement allselected : allSelectedOptions) {
		 String text = allselected.getText();
		 System.out.println(text);
	 }
	 }
	 }

public static void checkBox(WebElement ele) {
ele.click();//to select only one option
}

//isEnable
public static void isEnable(WebElement ele) {
boolean enabled = ele.isEnabled();
System.out.println(enabled);
}

//isDispalyed
public static void isDispalyed(WebElement ele) {
boolean displayed = ele.isDisplayed();
System.out.println(displayed);
}

//isSelected
public static void isSelected(WebElement ele) {
boolean selected = ele.isSelected();	
System.out.println(selected);
}

//getTitle
public static void getTitle() {
String title = driver.getTitle();
System.out.println(title);
}

//getCurrentUrl
public static void getCurrentUrl() {
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
}

//getText
public static void getText(WebElement ele) {
String text = ele.getText();
System.out.println(text);
}

//getAttribute
public static void getAttribute(WebElement ele) {
String attribute = ele.getAttribute("value");
System.out.println(attribute);
}

//implicit wait
public static void wait_1(long milli_sec) {
driver.manage().timeouts().implicitlyWait( milli_sec,TimeUnit.MILLISECONDS);
}

//takesScreenshot
public static void takesScreenshot(String path) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    File destination=new File(path);
    FileUtils.copyFile(source, destination);
}

//scrollup
public static void scrollup() {
	JavascriptExecutor jr=(JavascriptExecutor)driver;
	 jr.executeScript("window.scrollBy(0,3000)");
}

//scrolldown
public static void scrolldown() {
	JavascriptExecutor jr=(JavascriptExecutor)driver;
	 jr.executeScript("window.scrollBy(0,-3000)");
}
//scroll into view
public static void scrollintoview(WebElement ele) {
	JavascriptExecutor jr=(JavascriptExecutor)driver;
	jr.executeScript("arguments[0].scrollIntoView();",ele);
}

//sendkeys
public static void sendkeys(WebElement ele,String value) {
ele.sendKeys(value);

}

//click
public static void click(WebElement ele) {
ele.click();	
}
//clear
public static void clear(WebElement ele) {
ele.clear();	
}
}
