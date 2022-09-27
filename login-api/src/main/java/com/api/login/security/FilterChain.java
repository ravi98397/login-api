package com.api.login.security;

import java.util.List;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.SecurityFilterChain;

public class FilterChain {

	public void display() {
		System.out.println("thisis filter chain!!!");
	}
	
}
