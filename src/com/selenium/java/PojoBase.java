package com.selenium.java;

public class PojoBase {
//private variable
private int age;
private double mobile_num;
private String name;
//create getter and setter
//right click----->source-->getter and setter
//getter and setter for access private variable
//encapsulation concept
public double getMobile_num() {
	return mobile_num;
}
public void setMobile_num(double mobile_num) {
	this.mobile_num = mobile_num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
