package com.icontrols.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icontrols.service.SampleService;

@RestController
public class MainController {
	
	@Autowired 
	private SampleService sampleService;
	
	@GetMapping("/hello")
	public String hello() {
		return"hello" + sampleService.getName();
	}

}
