package com.webdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Docker_Engines {
	@GetMapping("/getMessage")
	public String getMessage() {
		return "hello World";
	}
}