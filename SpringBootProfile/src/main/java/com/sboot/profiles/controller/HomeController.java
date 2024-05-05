package com.sboot.profiles.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getHome() {
		return "Welcome Aafia! Congratulation for your first SpringBoot project on Aws linux machine.";
	}

}
