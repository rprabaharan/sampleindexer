package com.cts.sample.indexer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping("/")
	public String home() {
		
		return "Welcome to Index Controller";
	}
}
