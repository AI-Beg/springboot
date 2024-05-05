package com.sboot.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
//@Profile("dev")
public class ProfileEntity {

	@Value("${message}")
	String message;

	@PostConstruct
	void displayProfile() {
		System.out.println(message);
	}
}
