package com.selenium.java;

public class PojoMain {

	public static void main(String[] args) {
		//create object for base class
		//we need constructor to access another class object
		//using default constructor
		PojoBase pb=new PojoBase();
		pb.setAge(21);
		pb.setMobile_num(987546799);
		pb.setName("abi");
		int age = pb.getAge();
		System.out.println(age);
		double mobile_num = pb.getMobile_num();
		System.out.println(mobile_num);
		String name = pb.getName();
		System.out.println(name);
	}

}
