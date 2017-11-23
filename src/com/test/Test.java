package com.test;

public class Test {

	public static void main(String[] args) {
		out("master-rene");
	}
	
	public static void out(Object s) {
		System.out.println(s);
	}
	
	public double getSalary() {
		return 1000;
	}
	
	public void addAge(int age) {
		int x = age;
		System.out.println(x);
	}

}
