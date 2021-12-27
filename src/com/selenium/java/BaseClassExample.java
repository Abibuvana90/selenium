package com.selenium.java;

import org.openqa.selenium.WebElement;

public class BaseClassExample {
public static void clickMethod(WebElement element) {
element.click();
}
public static void passValues(WebElement element,String s) {
element.sendKeys(s);
}
}
