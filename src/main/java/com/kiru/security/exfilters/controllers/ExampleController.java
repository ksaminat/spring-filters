package com.kiru.security.exfilters.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;

@RestController
public class ExampleController {

	@RequestMapping("/")
	public ResponseEntity<String> entry() {
		/*Cookie cookie = new Cookie("nokia", "nokia-value");
		cookie.setMaxAge(1 * 24 * 60 * 60);
		cookie.setHttpOnly(true);*/
		//return "Welcome to Spring Security Program";
		
		ResponseCookie resCookie = ResponseCookie.from("userid", "c2FtLnNtaXRoQGV4YW1wbGUuY29t")
	            .httpOnly(true)
	            .maxAge(1 * 24 * 60 * 60)
	            .build();
		//return ResponseEntity.ok("Welcome to Spring Security Program");
		return ResponseEntity.ok()
				.header(HttpHeaders.SET_COOKIE, resCookie.toString())
				.body("Welcome to Spring Security Program");
	}
}
