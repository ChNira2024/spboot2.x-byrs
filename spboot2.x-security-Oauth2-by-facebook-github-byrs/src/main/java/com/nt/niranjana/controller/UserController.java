package com.nt.niranjana.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController 
{

	@GetMapping("/")
	public String index(Model model) 
	{
		return "index";
	}
	
	@GetMapping("/secure")
	public String securedPage(Model model, Principal principal) 
	{
		System.out.println(">>>"+principal);
		return "secure";
	}
	

	
}