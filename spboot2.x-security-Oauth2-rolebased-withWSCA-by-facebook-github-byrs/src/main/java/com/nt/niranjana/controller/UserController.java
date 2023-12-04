package com.nt.niranjana.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{

	@GetMapping("/")
	public String showAll() 
	{
		return "Welcome to OAuth App";
	}
	
	@GetMapping("/data")
	public String showData() 
	{
		return "Welcome to Login user only!";
	}
	
	@GetMapping("/currentuserinfo")
	public Authentication showUser(Principal principal) 
	{
		System.out.println(">>>"+principal.getClass().getName());
		return SecurityContextHolder.getContext().getAuthentication();
	}
	

	
}