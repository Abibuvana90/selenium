package com.selenium.java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\Driver\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.get("http://automationpractice.com/index.php?");
		//sign in process
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		login.click();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("abibuvana90@gmail.com");
		WebElement pswd = driver.findElement(By.id("passwd"));
		pswd.sendKeys("Abcd@1234");
		WebElement signin = driver.findElement(By.id("SubmitLogin"));
		signin.click();
		//to click on t-shirt
	    driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
	    driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")).click();
	    //frame handling
	    WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	    driver.switchTo().frame(frame1);
	    //change the requirement
	    WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
	    quantity.clear();
	    quantity.sendKeys("3");
	    WebElement drop = driver.findElement(By.xpath("//select[@name='group_1']"));
	    Select s=new Select(drop);
	    s.selectByIndex(0);
	    WebElement color = driver.findElement(By.xpath("//a[@name='Blue']"));
	    color.click();
	    WebElement cart = driver.findElement(By.xpath("//button[@name='Submit']"));
	    cart.click();
	    driver.switchTo().defaultContent();
	    //Purchase process
	    Thread.sleep(4000);
	    WebElement proced = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	    proced.click();
	    WebElement proced2 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
	    proced2.click();
	    WebElement proced3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
	    proced3.click();
	    WebElement checkbox=driver.findElement(By.xpath("//input[@id='cgv']"));
	    checkbox.click();
	    WebElement proced4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
	    proced4.click();
	    WebElement cheqe=driver.findElement(By.xpath("//a[@title='Pay by check.']"));
	    cheqe.click();
	    WebElement confirm = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
	    confirm.click();
	    WebElement findElement = driver.findElement(By.xpath("//h1[@class='page-heading']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();",findElement);
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Users\\Rajabi\\eclipse-workspace\\SeleniumProj\\screenshot\\ab.png");
	    FileUtils.copyFile(source, destination);
	    
	}

}
