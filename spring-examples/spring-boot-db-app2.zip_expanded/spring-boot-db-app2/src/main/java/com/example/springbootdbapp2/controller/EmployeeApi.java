package com.example.springbootdbapp2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // acts like a rest Webservice
@RequestMapping("/v1/api") // entry point URL for the clients
public class EmployeeApi {

	@GetMapping("/test")	
	// Client must access this using GET http://ip:port/v1/api/test
	public Map<String, String> greetings() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("title", "Simple webservice");
		return map;
	}	
}
