package com.tracing.jaeger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/path")
public class SpanController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/1")
	public ResponseEntity<String> path1() {
		String response = restTemplate.getForObject("http://localhost:8080/api/path/2", String.class);
		return ResponseEntity.ok("response from /path1 + " + response);
	}

	@GetMapping("/2")
	public ResponseEntity<String> path2() {
		return ResponseEntity.ok("response from /path2 ");
	}
}
