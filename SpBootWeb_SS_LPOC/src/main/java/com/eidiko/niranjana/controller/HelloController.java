package com.eidiko.niranjana.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/show")
	public String showData()
	{
		return "Good Moorning";
	}
}
