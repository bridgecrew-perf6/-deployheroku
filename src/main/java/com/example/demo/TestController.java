package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("ramram")
	public String method() {
		
		return "Srirama today's date is: "+new Date();
	}
}
