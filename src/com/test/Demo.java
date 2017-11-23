package com.test;

public class Demo {
	private static String name;
	
	static {
		name = "Tom";
	}
	
	public static void main(String[] args) {
		System.out.println(">>>>>> Demo");	
	}
	
	public static void print(Object o) {
		System.out.println(o);
	}

	
	
	
}
