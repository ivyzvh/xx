package com.vv.controller;

import java.util.List;

public class AccountController {
	
	
	public String getAccountHome() {
		return "/account/home";
	}
	
	public List<String> getAccountList() {
		return null;
	}
	
	public String getCustomerHome() {
		return "/customer/customer_home";
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add2(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}
	
	
}
